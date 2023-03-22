package com.example.storageserver.camunda;

import com.example.storageserver.camunda.infra.CamundaApiClient;
import com.example.storageserver.storage.JourneyOutcome;
import com.example.storageserver.storage.JourneyOutcomeRepository;
import com.example.storageserver.storage.Variable;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.ExternalTaskApi;
import org.openapitools.client.api.ProcessInstanceApi;
import org.openapitools.client.api.TaskApi;
import org.openapitools.client.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ExternalTaskPoller {

    @Scheduled(fixedDelay = 120000)
    public void scheduleFixedDelayTask() {
        poll();
    }

    @Autowired
    private JourneyOutcomeRepository repo;

    public void poll() {

        ApiClient apiClient = CamundaApiClient.get();

        ExternalTaskApi externalTaskApi = new ExternalTaskApi(apiClient);

        String workerId = "me";

        try {
            List<ExternalTaskDto> tasks = externalTaskApi.getExternalTasks(
                    null, null, null, null, null, null,
                    null, null, null, null, null,
                    null, null, null, null, null,
                    null, null, false, null, null,
                    null, null, 0, 1000);

            for (ExternalTaskDto task : tasks) {
                try {

                    if (!task.getSuspended()) {
                        LockExternalTaskDto lockDto = new LockExternalTaskDto();
                        lockDto.setWorkerId(workerId);
                        lockDto.setLockDuration(300000l);
                        externalTaskApi.lock(task.getId(), lockDto);


                        JourneyOutcome outcome = new JourneyOutcome();

                        outcome.setJourneyId(task.getBusinessKey());
                        outcome.setJourneyType(task.getProcessDefinitionId());
                        List<Variable> variables = getVariables(apiClient, task);
                        outcome.setVariables(variables);
                        for (Variable variable : variables) {
                            variable.setJourneyOutcome(outcome);
                        }

                        repo.save(outcome);

                        CompleteExternalTaskDto dto = new CompleteExternalTaskDto();
                        dto.setWorkerId(workerId);
                        externalTaskApi.completeExternalTaskResource(task.getId(), dto);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (ApiException e) {
            e.printStackTrace();
        }

    }

    private List<Variable> getVariables(ApiClient apiClient, ExternalTaskDto externalTask) {
        ProcessInstanceApi processInstanceApi = new ProcessInstanceApi(apiClient);

        List<Variable> variables = new ArrayList<>();

        try {

            Map<String, VariableValueDto> taskVariables = processInstanceApi
                    .getProcessInstanceVariables(externalTask.getProcessInstanceId(), false);

            for (String k : taskVariables.keySet()) {
                VariableValueDto dto = taskVariables.get(k);
                Variable v = new Variable();
                v.setKey(k);
                v.setValue("" + dto.getValue());
                variables.add(v);
            }


        } catch (ApiException e) {
            e.printStackTrace();
        }

        return variables;
    }

}
