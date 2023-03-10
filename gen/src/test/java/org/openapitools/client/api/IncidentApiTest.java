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
import org.openapitools.client.model.AnnotationDto;
import org.openapitools.client.model.CountResultDto;
import org.openapitools.client.model.ExceptionDto;
import org.openapitools.client.model.IncidentDto;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IncidentApi
 */
@Ignore
public class IncidentApiTest {

    private final IncidentApi api = new IncidentApi();

    
    /**
     * Clear Incident Annotation
     *
     * Clears the annotation of an incident with given id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearIncidentAnnotationTest() throws ApiException {
        String id = null;
        api.clearIncidentAnnotation(id);

        // TODO: test validations
    }
    
    /**
     * Get Incident
     *
     * Retrieves an incident by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncidentTest() throws ApiException {
        String id = null;
        IncidentDto response = api.getIncident(id);

        // TODO: test validations
    }
    
    /**
     * Get List
     *
     * Queries for incidents that fulfill given parameters. The size of the result set can be retrieved by using the [Get Incident Count](https://docs.camunda.org/manual/7.18/reference/rest/incident/get-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncidentsTest() throws ApiException {
        String incidentId = null;
        String incidentType = null;
        String incidentMessage = null;
        String incidentMessageLike = null;
        String processDefinitionId = null;
        String processDefinitionKeyIn = null;
        String processInstanceId = null;
        String executionId = null;
        OffsetDateTime incidentTimestampBefore = null;
        OffsetDateTime incidentTimestampAfter = null;
        String activityId = null;
        String failedActivityId = null;
        String causeIncidentId = null;
        String rootCauseIncidentId = null;
        String _configuration = null;
        String tenantIdIn = null;
        String jobDefinitionIdIn = null;
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        List<IncidentDto> response = api.getIncidents(incidentId, incidentType, incidentMessage, incidentMessageLike, processDefinitionId, processDefinitionKeyIn, processInstanceId, executionId, incidentTimestampBefore, incidentTimestampAfter, activityId, failedActivityId, causeIncidentId, rootCauseIncidentId, _configuration, tenantIdIn, jobDefinitionIdIn, sortBy, sortOrder, firstResult, maxResults);

        // TODO: test validations
    }
    
    /**
     * Get List Count
     *
     * Queries for the number of incidents that fulfill given parameters. Takes the same parameters as the [Get Incidents](https://docs.camunda.org/manual/7.18/reference/rest/incident/get-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncidentsCountTest() throws ApiException {
        String incidentId = null;
        String incidentType = null;
        String incidentMessage = null;
        String incidentMessageLike = null;
        String processDefinitionId = null;
        String processDefinitionKeyIn = null;
        String processInstanceId = null;
        String executionId = null;
        OffsetDateTime incidentTimestampBefore = null;
        OffsetDateTime incidentTimestampAfter = null;
        String activityId = null;
        String failedActivityId = null;
        String causeIncidentId = null;
        String rootCauseIncidentId = null;
        String _configuration = null;
        String tenantIdIn = null;
        String jobDefinitionIdIn = null;
        CountResultDto response = api.getIncidentsCount(incidentId, incidentType, incidentMessage, incidentMessageLike, processDefinitionId, processDefinitionKeyIn, processInstanceId, executionId, incidentTimestampBefore, incidentTimestampAfter, activityId, failedActivityId, causeIncidentId, rootCauseIncidentId, _configuration, tenantIdIn, jobDefinitionIdIn);

        // TODO: test validations
    }
    
    /**
     * Resolve Incident
     *
     * Resolves an incident with given id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resolveIncidentTest() throws ApiException {
        String id = null;
        api.resolveIncident(id);

        // TODO: test validations
    }
    
    /**
     * Set Incident Annotation
     *
     * Sets the annotation of an incident with given id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setIncidentAnnotationTest() throws ApiException {
        String id = null;
        AnnotationDto annotationDto = null;
        api.setIncidentAnnotation(id, annotationDto);

        // TODO: test validations
    }
    
}
