package com.example.mockserver.mateu.ui;

import com.example.mockserver.mateu.ui.camunda.commands.RunStepActionCommand;
import com.example.mockserver.mateu.ui.camunda.commands.StartJourneyCommand;
import com.example.mockserver.mateu.ui.camunda.queries.GetJourneyQuery;
import com.example.mockserver.mateu.ui.camunda.queries.GetJourneyTypesQuery;
import com.example.mockserver.mateu.ui.camunda.queries.GetStepQuery;
import io.mateu.remote.dtos.*;
import org.openapitools.client.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


@RestController
@RequestMapping("mateu/v1")
public class RemoteMateuController {

    @Autowired
    RemoteMateuUIService uiService;

    @Autowired
    RemoteMateuJourneyService journeyService;

    @GetMapping(value = "uis/{uiClassName}")
    public UI getUI(@PathVariable String uiClassName) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        return uiService.createUI();
    }

    @GetMapping("uis/{uiClassName}/{viewClassName}")
    public View getView(@PathVariable String uiClassName, @PathVariable String viewClassName) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        return uiService.createView();
    }

    @PostMapping("uis/{uiClassName}/{viewClassName}/{actionId}")
    public View runAction(@PathVariable String uiClassName, @PathVariable String viewClassName,
                          @PathVariable String actionId,
                          @RequestBody ActionData actionData
                          ) {
        return uiService.createView();
    }

    @GetMapping("journey-types")
    public List<JourneyType> getJourneyTypes() throws Exception {
        return GetJourneyTypesQuery.builder().build().run();
    }

    @PostMapping("journeys/{journeyId}")
    public void createJourney(@PathVariable String journeyId, @RequestBody JourneyCreationRq rq) throws Exception {
        StartJourneyCommand.builder()
                .journeyId(journeyId)
                .journeyTypeId(rq.getJourneyTypeId())
                .build().run();
    }

    @GetMapping("journeys/{journeyId}")
    public Journey getJourney(@PathVariable String journeyId) throws Exception {
        return GetJourneyQuery.builder().journeyId(journeyId).build().run();
    }

    @GetMapping("journeys/{journeyId}/steps/{stepId}")
    public Step getStep(@PathVariable String journeyId, @PathVariable String stepId) throws Exception {
        return GetStepQuery.builder().journeyId(journeyId).stepId(stepId).build().run();
    }

    @PostMapping("journeys/{journeyId}/steps/{stepId}/{actionId}")
    public void runStep(@PathVariable String journeyId,
                        @PathVariable String stepId,
                        @PathVariable String actionId,
                        @RequestBody RunActionRq rq) throws Exception {
        RunStepActionCommand.builder()
                .journeyId(journeyId)
                .stepId(stepId)
                .actionId(actionId)
                .data(rq.getData())
                .build().run();
    }

}
