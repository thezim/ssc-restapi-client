/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.api;

import com.fortify.ssc.restclient.ApiException;
import com.fortify.ssc.restclient.model.ApiCollectionActionlong;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultApiActionResponse;
import com.fortify.ssc.restclient.model.ApiResultIssueActionResponse;
import com.fortify.ssc.restclient.model.ApiResultIssueFileBugResponse;
import com.fortify.ssc.restclient.model.ApiResultListProjectVersionIssue;
import com.fortify.ssc.restclient.model.ApiResultProjectVersionIssue;
import com.fortify.ssc.restclient.model.IssueAssignUserRequest;
import com.fortify.ssc.restclient.model.IssueAuditRequest;
import com.fortify.ssc.restclient.model.IssueFileBugRequest;
import com.fortify.ssc.restclient.model.IssueSuppressRequest;
import com.fortify.ssc.restclient.model.IssueUpdateTagRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueOfProjectVersionControllerApi
 */
@Ignore
public class IssueOfProjectVersionControllerApiTest {

    private final IssueOfProjectVersionControllerApi api = new IssueOfProjectVersionControllerApi();

    
    /**
     * assignUserFor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignUserForIssueOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        IssueAssignUserRequest resource = null;
        ApiResultIssueActionResponse response = api.assignUserForIssueOfProjectVersion(parentId, resource);

        // TODO: test validations
    }
    
    /**
     * audit
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void auditIssueOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        IssueAuditRequest resource = null;
        ApiResultIssueActionResponse response = api.auditIssueOfProjectVersion(parentId, resource);

        // TODO: test validations
    }
    
    /**
     * doAction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void doActionIssueOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        ApiCollectionActionlong collectionAction = null;
        ApiResultApiActionResponse response = api.doActionIssueOfProjectVersion(parentId, collectionAction);

        // TODO: test validations
    }
    
    /**
     * fileBugFor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fileBugForIssueOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        IssueFileBugRequest resource = null;
        ApiResultIssueFileBugResponse response = api.fileBugForIssueOfProjectVersion(parentId, resource);

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIssueOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        String qm = null;
        String orderby = null;
        String filterset = null;
        String fields = null;
        Boolean showhidden = null;
        Boolean showremoved = null;
        Boolean showsuppressed = null;
        Boolean showshortfilenames = null;
        String filter = null;
        String groupid = null;
        String groupingtype = null;
        ApiResultListProjectVersionIssue response = api.listIssueOfProjectVersion(parentId, start, limit, q, qm, orderby, filterset, fields, showhidden, showremoved, showsuppressed, showshortfilenames, filter, groupid, groupingtype);

        // TODO: test validations
    }
    
    /**
     * read
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readIssueOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        Long id = null;
        String fields = null;
        ApiResultProjectVersionIssue response = api.readIssueOfProjectVersion(parentId, id, fields);

        // TODO: test validations
    }
    
    /**
     * suppress
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressIssueOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        IssueSuppressRequest resource = null;
        ApiResultIssueActionResponse response = api.suppressIssueOfProjectVersion(parentId, resource);

        // TODO: test validations
    }
    
    /**
     * updateTagFor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTagForIssueOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        IssueUpdateTagRequest resource = null;
        ApiResultIssueActionResponse response = api.updateTagForIssueOfProjectVersion(parentId, resource);

        // TODO: test validations
    }
    
}
