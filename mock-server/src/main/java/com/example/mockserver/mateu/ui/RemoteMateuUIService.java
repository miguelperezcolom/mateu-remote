package com.example.mockserver.mateu.ui;

import io.mateu.remote.dtos.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RemoteMateuUIService {
    public UI createUI() {
        return UI.builder()
                .title("Demo app")
                .subtitle("Working on Mateu Remote")
                .home(View.builder()
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
                                                                                                .caption("")
                                                                                                .id("mainContent")
                                                                                                .type("html")
                                                                                                .build()
                                                                                ))
                                                                                .build()
                                                                ))
                                                                .build()
                                                ))
                                                .build())
                                        .data(Map.of("mainContent", "<h1>Hello Mateu!</h1>"))
                                        .build()
                        ))
                        .build())
                .menu(List.of(
                        Menu.builder()
                                .caption("Menu 1")
                                .type(MenuType.MenuOption)
                                .build()
                        , Menu.builder()
                                .caption("Menu 2")
                                .type(MenuType.MenuOption)
                                .build()
                ))
                .build();
    }

    public View createView() {
        return View.builder()
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
                .build();
    }
}
