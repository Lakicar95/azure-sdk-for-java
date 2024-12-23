// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.databricks.models.GroupIdInformationProperties;
import com.azure.resourcemanager.databricks.models.PrivateLinkResourcesList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourcesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourcesList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupId\":\"hmuouqfprwzwbn\",\"requiredMembers\":[\"tnwu\",\"zga\",\"x\",\"fizuckyf\"],\"requiredZoneNames\":[\"fidfvzw\",\"zuhtymwisdkfthwx\",\"nteiwaopv\"]},\"id\":\"mijcmmxdcufufs\",\"name\":\"pymzidnsezcxtbzs\",\"type\":\"fycc\"},{\"properties\":{\"groupId\":\"ewmdw\",\"requiredMembers\":[\"iachbo\",\"sflnrosfqp\",\"eeh\",\"zvypyqrimzinp\"],\"requiredZoneNames\":[\"jdkirsoodqx\"]},\"id\":\"crmnohjtckwhds\",\"name\":\"ifiyipjxsqwpgrj\",\"type\":\"znorcj\"},{\"properties\":{\"groupId\":\"snb\",\"requiredMembers\":[\"abnmocpcyshu\",\"zafb\"],\"requiredZoneNames\":[\"gpbtoqcjmklj\"]},\"id\":\"vbqid\",\"name\":\"qajzyulpkudjkr\",\"type\":\"khbzhfepgzg\"}],\"nextLink\":\"xzlocxscp\"}")
            .toObject(PrivateLinkResourcesList.class);
        Assertions.assertEquals("hmuouqfprwzwbn", model.value().get(0).properties().groupId());
        Assertions.assertEquals("tnwu", model.value().get(0).properties().requiredMembers().get(0));
        Assertions.assertEquals("fidfvzw", model.value().get(0).properties().requiredZoneNames().get(0));
        Assertions.assertEquals("xzlocxscp", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourcesList model = new PrivateLinkResourcesList().withValue(Arrays.asList(
            new GroupIdInformationInner()
                .withProperties(new GroupIdInformationProperties().withGroupId("hmuouqfprwzwbn")
                    .withRequiredMembers(Arrays.asList("tnwu", "zga", "x", "fizuckyf"))
                    .withRequiredZoneNames(Arrays.asList("fidfvzw", "zuhtymwisdkfthwx", "nteiwaopv"))),
            new GroupIdInformationInner().withProperties(new GroupIdInformationProperties().withGroupId("ewmdw")
                .withRequiredMembers(Arrays.asList("iachbo", "sflnrosfqp", "eeh", "zvypyqrimzinp"))
                .withRequiredZoneNames(Arrays.asList("jdkirsoodqx"))),
            new GroupIdInformationInner().withProperties(new GroupIdInformationProperties().withGroupId("snb")
                .withRequiredMembers(Arrays.asList("abnmocpcyshu", "zafb"))
                .withRequiredZoneNames(Arrays.asList("gpbtoqcjmklj")))))
            .withNextLink("xzlocxscp");
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourcesList.class);
        Assertions.assertEquals("hmuouqfprwzwbn", model.value().get(0).properties().groupId());
        Assertions.assertEquals("tnwu", model.value().get(0).properties().requiredMembers().get(0));
        Assertions.assertEquals("fidfvzw", model.value().get(0).properties().requiredZoneNames().get(0));
        Assertions.assertEquals("xzlocxscp", model.nextLink());
    }
}
