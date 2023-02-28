package com.example.mockserver.mateu.ui;

import io.mateu.remote.dtos.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@Service
public class RemoteMateuJourneyService {
    public Step createStep(String journeyId, String stepId) {
        return Step.builder()
                .name("Test journey")
                .view(
                        View.builder()
                                .components(List.of(
                                        Component.builder()
                                                .metadata(Form.builder()
                                                        .title("A simple form")
                                                        .subtitle("Here it will be the home of our demo")
                                                        .sections(List.of(
                                                                Section.builder()
                                                                        .caption("")
                                                                        .fieldGroups(List.of(
                                                                                FieldGroup.builder()
                                                                                        .caption("")
                                                                                        .fields(List.of(
                                                                                                Field.builder()
                                                                                                        .caption("Name")
                                                                                                        .id("name")
                                                                                                        .type("string")
                                                                                                        .build(),
                                                                                                Field.builder()
                                                                                                        .caption("Age")
                                                                                                        .id("age")
                                                                                                        .type("int")
                                                                                                        .build()
                                                                                        ))
                                                                                        .build()
                                                                        ))
                                                                        .build()
                                                        ))
                                                        .mainActions(List.of(Action.builder()
                                                                .caption("Save")
                                                                .id("save")
                                                                .type(ActionType.Primary)
                                                                .build()))
                                                        .build())
                                                .data(Map.of("name", "Mateu", "age", 14))
                                                .build()
                                ))
                                .build()
                )
                .build();
    }
}
