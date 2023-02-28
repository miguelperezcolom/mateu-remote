package com.example.mockserver.mateu.ui.camunda.forms.dtos;

import lombok.Data;

@Data
public class Validate {

    private boolean required;

    private int minLength;

    private int maxLength;

    private String pattern;

}
