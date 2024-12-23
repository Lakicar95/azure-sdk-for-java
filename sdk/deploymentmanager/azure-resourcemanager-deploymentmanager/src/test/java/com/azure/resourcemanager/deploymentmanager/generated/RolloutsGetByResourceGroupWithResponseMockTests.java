// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.deploymentmanager.DeploymentManager;
import com.azure.resourcemanager.deploymentmanager.models.Rollout;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class RolloutsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"identity\":{\"type\":\"mhrkwofyyvoqacp\",\"identityIds\":[\"xpbtgiwbwo\",\"nwashrtd\"]},\"properties\":{\"status\":\"nqxwbp\",\"totalRetryAttempts\":1343129600,\"operationInfo\":{\"retryAttempt\":1328811722,\"skipSucceededOnRetry\":false,\"startTime\":\"2021-10-03T21:01Z\",\"endTime\":\"2021-11-02T16:16:22Z\"},\"services\":[],\"buildVersion\":\"i\",\"artifactSourceId\":\"byuqerpqlp\",\"targetServiceTopologyId\":\"wcciuqgbdbu\",\"stepGroups\":[]},\"location\":\"uvfbtkuwh\",\"tags\":{\"koymkcd\":\"ykojoxafnndlpic\",\"pkkpw\":\"h\",\"jxywsuws\":\"reqnovvqfov\",\"aeneqnzarrwl\":\"rsndsytgadgvra\"},\"id\":\"uu\",\"name\":\"jfqka\",\"type\":\"e\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DeploymentManager manager = DeploymentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Rollout response = manager.rollouts()
            .getByResourceGroupWithResponse("sdqrhzoymibmrq", "ibahwflus", 1671003126, com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("uvfbtkuwh", response.location());
        Assertions.assertEquals("ykojoxafnndlpic", response.tags().get("koymkcd"));
        Assertions.assertEquals("mhrkwofyyvoqacp", response.identity().type());
        Assertions.assertEquals("xpbtgiwbwo", response.identity().identityIds().get(0));
        Assertions.assertEquals("i", response.buildVersion());
        Assertions.assertEquals("byuqerpqlp", response.artifactSourceId());
        Assertions.assertEquals("wcciuqgbdbu", response.targetServiceTopologyId());
    }
}
