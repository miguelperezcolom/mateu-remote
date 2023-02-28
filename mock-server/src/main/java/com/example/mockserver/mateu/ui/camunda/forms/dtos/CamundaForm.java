package com.example.mockserver.mateu.ui.camunda.forms.dtos;

import lombok.Data;

@Data
public class CamundaForm {

    private int schemaVersion;

    private String executionPlatformVersion;

    private String executionPlatform;

    private String id;

    private String type;

    private Exporter exporter;

    private Component[]  components;

}
