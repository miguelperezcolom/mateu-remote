/*
 * Camunda Platform REST API
 * OpenApi Spec for Camunda Platform REST API.
 *
 * The version of the OpenAPI document: 7.18.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AuthorizationExceptionDto;
import org.openapitools.client.model.EvaluationConditionDto;
import org.openapitools.client.model.ExceptionDto;
import org.openapitools.client.model.ProcessInstanceDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConditionApi
 */
@Ignore
public class ConditionApiTest {

    private final ConditionApi api = new ConditionApi();

    
    /**
     * Evaluate
     *
     * Triggers evaluation of conditions for conditional start event(s).  Internally this maps to the engines condition evaluation builder method ConditionEvaluationBuilder#evaluateStartConditions().  For more information see the [Conditional Start Events](https://docs.camunda.org/manual/7.18/reference/bpmn20/events/conditional-events/#conditional-start-event) section of the [BPMN 2.0 Implementation Reference](https://docs.camunda.org/manual/7.18/reference/bpmn20/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evaluateConditionTest() throws ApiException {
        EvaluationConditionDto evaluationConditionDto = null;
        List<ProcessInstanceDto> response = api.evaluateCondition(evaluationConditionDto);

        // TODO: test validations
    }
    
}
