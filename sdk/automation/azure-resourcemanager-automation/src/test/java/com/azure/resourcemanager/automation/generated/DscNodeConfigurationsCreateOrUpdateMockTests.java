// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.automation.AutomationManager;
import com.azure.resourcemanager.automation.models.ContentHash;
import com.azure.resourcemanager.automation.models.ContentSource;
import com.azure.resourcemanager.automation.models.ContentSourceType;
import com.azure.resourcemanager.automation.models.DscConfigurationAssociationProperty;
import com.azure.resourcemanager.automation.models.DscNodeConfiguration;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DscNodeConfigurationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"lastModifiedTime\":\"2021-06-06T01:26:52Z\",\"creationTime\":\"2021-03-11T11:38:05Z\",\"configuration\":{\"name\":\"nsxzajlns\"},\"source\":\"wjuyxx\",\"nodeCount\":7135084339051240564,\"incrementNodeConfigurationBuild\":false},\"id\":\"uaytuadxk\",\"name\":\"eqbw\",\"type\":\"ntghyksarcdr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AutomationManager manager = AutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DscNodeConfiguration response = manager.dscNodeConfigurations()
            .define("laohoqkp")
            .withExistingAutomationAccount("qrbrpvnmdyfoeboj", "jpp")
            .withTags(mapOf("uvny", "i", "hlqtxnrflkn", "tzgixgyrihlgmgb", "hipx", "rndpgfjodhdaqotw", "uumljcirvpefyc",
                "gsabvcipowzafc"))
            .withName("euntgxdncaqtti")
            .withSource(new ContentSource()
                .withHash(new ContentHash().withAlgorithm("qjilaywkdcwmqsyr").withValue("lmhxdqaolfylnk"))
                .withType(ContentSourceType.EMBEDDED_CONTENT)
                .withValue("jvlywl")
                .withVersion("fwobb"))
            .withConfiguration(new DscConfigurationAssociationProperty().withName("hlwyjfnqzocrd"))
            .withIncrementNodeConfigurationBuild(false)
            .create();

        Assertions.assertEquals(OffsetDateTime.parse("2021-06-06T01:26:52Z"), response.lastModifiedTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-11T11:38:05Z"), response.creationTime());
        Assertions.assertEquals("nsxzajlns", response.configuration().name());
        Assertions.assertEquals("wjuyxx", response.source());
        Assertions.assertEquals(7135084339051240564L, response.nodeCount());
        Assertions.assertEquals(false, response.incrementNodeConfigurationBuild());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
