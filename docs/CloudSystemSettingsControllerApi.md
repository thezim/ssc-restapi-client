# CloudSystemSettingsControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCloudSystemSettings**](CloudSystemSettingsControllerApi.md#getCloudSystemSettings) | **GET** /cloudsystem/settings | get


<a name="getCloudSystemSettings"></a>
# **getCloudSystemSettings**
> ApiResultCloudSystemSettings getCloudSystemSettings()

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudSystemSettingsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudSystemSettingsControllerApi apiInstance = new CloudSystemSettingsControllerApi();
try {
    ApiResultCloudSystemSettings result = apiInstance.getCloudSystemSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudSystemSettingsControllerApi#getCloudSystemSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultCloudSystemSettings**](ApiResultCloudSystemSettings.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

