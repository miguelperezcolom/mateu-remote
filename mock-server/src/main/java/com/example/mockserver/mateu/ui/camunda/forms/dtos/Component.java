package com.example.mockserver.mateu.ui.camunda.forms.dtos;

import lombok.Data;

@Data
public class Component {

    private String label;

    private String id;

    private String key;

    private String type;

    private String description;

    private String defaultValue;

    private boolean disabled;

    private Validate validate;

    private Conditional conditional;

    private Option[] values;

}
