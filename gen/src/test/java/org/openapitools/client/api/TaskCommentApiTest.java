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
import org.openapitools.client.model.CommentDto;
import org.openapitools.client.model.ExceptionDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskCommentApi
 */
@Ignore
public class TaskCommentApiTest {

    private final TaskCommentApi api = new TaskCommentApi();

    
    /**
     * Create
     *
     * Creates a comment for a task by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCommentTest() throws ApiException {
        String id = null;
        CommentDto commentDto = null;
        CommentDto response = api.createComment(id, commentDto);

        // TODO: test validations
    }
    
    /**
     * Get
     *
     * Retrieves a task comment by task id and comment id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentTest() throws ApiException {
        String id = null;
        String commentId = null;
        CommentDto response = api.getComment(id, commentId);

        // TODO: test validations
    }
    
    /**
     * Get List
     *
     * Gets the comments for a task by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentsTest() throws ApiException {
        String id = null;
        List<CommentDto> response = api.getComments(id);

        // TODO: test validations
    }
    
}
