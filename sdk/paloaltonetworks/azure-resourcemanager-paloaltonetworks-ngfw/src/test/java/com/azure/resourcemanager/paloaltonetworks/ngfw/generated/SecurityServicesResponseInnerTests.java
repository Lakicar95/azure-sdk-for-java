// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.SecurityServicesResponseInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.NameDescriptionObject;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SecurityServicesTypeList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SecurityServicesResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityServicesResponseInner model =
            BinaryData
                .fromString(
                    "{\"value\":{\"type\":\"oskg\",\"entry\":[{\"name\":\"auu\",\"description\":\"jmvxie\"},{\"name\":\"uugidyjrrfby\",\"description\":\"svexcsonpclhoco\"}]},\"nextLink\":\"lkevle\"}")
                .toObject(SecurityServicesResponseInner.class);
        Assertions.assertEquals("oskg", model.value().type());
        Assertions.assertEquals("auu", model.value().entry().get(0).name());
        Assertions.assertEquals("jmvxie", model.value().entry().get(0).description());
        Assertions.assertEquals("lkevle", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityServicesResponseInner model =
            new SecurityServicesResponseInner()
                .withValue(
                    new SecurityServicesTypeList()
                        .withType("oskg")
                        .withEntry(
                            Arrays
                                .asList(
                                    new NameDescriptionObject().withName("auu").withDescription("jmvxie"),
                                    new NameDescriptionObject()
                                        .withName("uugidyjrrfby")
                                        .withDescription("svexcsonpclhoco"))))
                .withNextLink("lkevle");
        model = BinaryData.fromObject(model).toObject(SecurityServicesResponseInner.class);
        Assertions.assertEquals("oskg", model.value().type());
        Assertions.assertEquals("auu", model.value().entry().get(0).name());
        Assertions.assertEquals("jmvxie", model.value().entry().get(0).description());
        Assertions.assertEquals("lkevle", model.nextLink());
    }
}