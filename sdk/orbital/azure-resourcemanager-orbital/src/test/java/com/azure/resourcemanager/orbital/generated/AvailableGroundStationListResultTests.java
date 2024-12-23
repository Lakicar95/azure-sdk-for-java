// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.fluent.models.AvailableGroundStationInner;
import com.azure.resourcemanager.orbital.models.AvailableGroundStationListResult;
import com.azure.resourcemanager.orbital.models.ReleaseMode;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AvailableGroundStationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableGroundStationListResult model = BinaryData.fromString(
            "{\"value\":[{\"id\":\"vtvudutncormr\",\"name\":\"qtvcofudflvkgj\",\"location\":\"gdknnqv\",\"type\":\"znqntoru\",\"properties\":{\"city\":\"gsahmkycgrauw\",\"providerName\":\"etaebu\",\"longitudeDegrees\":82.7481,\"latitudeDegrees\":93.07586,\"altitudeMeters\":51.671677,\"releaseMode\":\"Preview\"}},{\"id\":\"l\",\"name\":\"ab\",\"location\":\"oefki\",\"type\":\"vtpuqujmqlgk\",\"properties\":{\"city\":\"tndoaongbjc\",\"providerName\":\"ujitcjedftww\",\"longitudeDegrees\":24.823893,\"latitudeDegrees\":63.156284,\"altitudeMeters\":5.341405,\"releaseMode\":\"Preview\"}}],\"nextLink\":\"zfoqouicybxar\"}")
            .toObject(AvailableGroundStationListResult.class);
        Assertions.assertEquals("gdknnqv", model.value().get(0).location());
        Assertions.assertEquals("gsahmkycgrauw", model.value().get(0).city());
        Assertions.assertEquals("etaebu", model.value().get(0).providerName());
        Assertions.assertEquals(82.7481F, model.value().get(0).longitudeDegrees());
        Assertions.assertEquals(93.07586F, model.value().get(0).latitudeDegrees());
        Assertions.assertEquals(51.671677F, model.value().get(0).altitudeMeters());
        Assertions.assertEquals(ReleaseMode.PREVIEW, model.value().get(0).releaseMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableGroundStationListResult model = new AvailableGroundStationListResult().withValue(Arrays.asList(
            new AvailableGroundStationInner().withLocation("gdknnqv")
                .withCity("gsahmkycgrauw")
                .withProviderName("etaebu")
                .withLongitudeDegrees(82.7481F)
                .withLatitudeDegrees(93.07586F)
                .withAltitudeMeters(51.671677F)
                .withReleaseMode(ReleaseMode.PREVIEW),
            new AvailableGroundStationInner().withLocation("oefki")
                .withCity("tndoaongbjc")
                .withProviderName("ujitcjedftww")
                .withLongitudeDegrees(24.823893F)
                .withLatitudeDegrees(63.156284F)
                .withAltitudeMeters(5.341405F)
                .withReleaseMode(ReleaseMode.PREVIEW)));
        model = BinaryData.fromObject(model).toObject(AvailableGroundStationListResult.class);
        Assertions.assertEquals("gdknnqv", model.value().get(0).location());
        Assertions.assertEquals("gsahmkycgrauw", model.value().get(0).city());
        Assertions.assertEquals("etaebu", model.value().get(0).providerName());
        Assertions.assertEquals(82.7481F, model.value().get(0).longitudeDegrees());
        Assertions.assertEquals(93.07586F, model.value().get(0).latitudeDegrees());
        Assertions.assertEquals(51.671677F, model.value().get(0).altitudeMeters());
        Assertions.assertEquals(ReleaseMode.PREVIEW, model.value().get(0).releaseMode());
    }
}
