// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for VirtualMachines Delete. */
public final class VirtualMachinesDeleteSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/VirtualMachines_Delete.json
     */
    /**
     * Sample code: Delete virtual machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void deleteVirtualMachine(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.virtualMachines().delete("resourceGroupName", "virtualMachineName", com.azure.core.util.Context.NONE);
    }
}