// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.operationsmanagement.OperationsManagementManager;
import com.azure.resourcemanager.operationsmanagement.fluent.models.ManagementAssociationInner;
import com.azure.resourcemanager.operationsmanagement.models.ManagementAssociation;
import com.azure.resourcemanager.operationsmanagement.models.ManagementAssociationProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ManagementAssociationsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"location\":\"tzlcuiywgqywgn\",\"properties\":{\"applicationId\":\"vynhzgpphrcg\"},\"id\":\"nc\",\"name\":\"cpecfvmmcoofs\",\"type\":\"lzevgbmqjqab\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OperationsManagementManager manager = OperationsManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ManagementAssociation response = manager.managementAssociations()
            .createOrUpdateWithResponse("hkh", "xuigdtopbobj", "ghmewuam", "uhrzayvvt", "gvdfgiotkftutq",
                new ManagementAssociationInner().withLocation("ngxlefgugnxkrxdq")
                    .withProperties(new ManagementAssociationProperties().withApplicationId("dt")),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("tzlcuiywgqywgn", response.location());
        Assertions.assertEquals("vynhzgpphrcg", response.properties().applicationId());
    }
}
