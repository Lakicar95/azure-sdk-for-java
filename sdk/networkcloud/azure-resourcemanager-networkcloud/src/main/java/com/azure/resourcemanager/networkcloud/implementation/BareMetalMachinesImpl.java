// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.fluent.BareMetalMachinesClient;
import com.azure.resourcemanager.networkcloud.fluent.models.BareMetalMachineInner;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachine;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineCordonParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachinePowerOffParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineReplaceParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunCommandParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunDataExtractsParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunReadCommandsParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineValidateHardwareParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachines;

public final class BareMetalMachinesImpl implements BareMetalMachines {
    private static final ClientLogger LOGGER = new ClientLogger(BareMetalMachinesImpl.class);

    private final BareMetalMachinesClient innerClient;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public BareMetalMachinesImpl(
        BareMetalMachinesClient innerClient,
        com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BareMetalMachine> list() {
        PagedIterable<BareMetalMachineInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<BareMetalMachine> list(Context context) {
        PagedIterable<BareMetalMachineInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<BareMetalMachine> listByResourceGroup(String resourceGroupName) {
        PagedIterable<BareMetalMachineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<BareMetalMachine> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<BareMetalMachineInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineImpl(inner1, this.manager()));
    }

    public Response<BareMetalMachine> getByResourceGroupWithResponse(
        String resourceGroupName, String bareMetalMachineName, Context context) {
        Response<BareMetalMachineInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, bareMetalMachineName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BareMetalMachineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BareMetalMachine getByResourceGroup(String resourceGroupName, String bareMetalMachineName) {
        BareMetalMachineInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, bareMetalMachineName);
        if (inner != null) {
            return new BareMetalMachineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String bareMetalMachineName) {
        this.serviceClient().delete(resourceGroupName, bareMetalMachineName);
    }

    public void delete(String resourceGroupName, String bareMetalMachineName, Context context) {
        this.serviceClient().delete(resourceGroupName, bareMetalMachineName, context);
    }

    public void cordon(String resourceGroupName, String bareMetalMachineName) {
        this.serviceClient().cordon(resourceGroupName, bareMetalMachineName);
    }

    public void cordon(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineCordonParameters bareMetalMachineCordonParameters,
        Context context) {
        this.serviceClient().cordon(resourceGroupName, bareMetalMachineName, bareMetalMachineCordonParameters, context);
    }

    public void powerOff(String resourceGroupName, String bareMetalMachineName) {
        this.serviceClient().powerOff(resourceGroupName, bareMetalMachineName);
    }

    public void powerOff(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachinePowerOffParameters bareMetalMachinePowerOffParameters,
        Context context) {
        this
            .serviceClient()
            .powerOff(resourceGroupName, bareMetalMachineName, bareMetalMachinePowerOffParameters, context);
    }

    public void reimage(String resourceGroupName, String bareMetalMachineName) {
        this.serviceClient().reimage(resourceGroupName, bareMetalMachineName);
    }

    public void reimage(String resourceGroupName, String bareMetalMachineName, Context context) {
        this.serviceClient().reimage(resourceGroupName, bareMetalMachineName, context);
    }

    public void replace(String resourceGroupName, String bareMetalMachineName) {
        this.serviceClient().replace(resourceGroupName, bareMetalMachineName);
    }

    public void replace(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineReplaceParameters bareMetalMachineReplaceParameters,
        Context context) {
        this
            .serviceClient()
            .replace(resourceGroupName, bareMetalMachineName, bareMetalMachineReplaceParameters, context);
    }

    public void restart(String resourceGroupName, String bareMetalMachineName) {
        this.serviceClient().restart(resourceGroupName, bareMetalMachineName);
    }

    public void restart(String resourceGroupName, String bareMetalMachineName, Context context) {
        this.serviceClient().restart(resourceGroupName, bareMetalMachineName, context);
    }

    public void runCommand(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunCommandParameters bareMetalMachineRunCommandParameters) {
        this.serviceClient().runCommand(resourceGroupName, bareMetalMachineName, bareMetalMachineRunCommandParameters);
    }

    public void runCommand(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunCommandParameters bareMetalMachineRunCommandParameters,
        Context context) {
        this
            .serviceClient()
            .runCommand(resourceGroupName, bareMetalMachineName, bareMetalMachineRunCommandParameters, context);
    }

    public void runDataExtracts(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunDataExtractsParameters bareMetalMachineRunDataExtractsParameters) {
        this
            .serviceClient()
            .runDataExtracts(resourceGroupName, bareMetalMachineName, bareMetalMachineRunDataExtractsParameters);
    }

    public void runDataExtracts(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunDataExtractsParameters bareMetalMachineRunDataExtractsParameters,
        Context context) {
        this
            .serviceClient()
            .runDataExtracts(
                resourceGroupName, bareMetalMachineName, bareMetalMachineRunDataExtractsParameters, context);
    }

    public void runReadCommands(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunReadCommandsParameters bareMetalMachineRunReadCommandsParameters) {
        this
            .serviceClient()
            .runReadCommands(resourceGroupName, bareMetalMachineName, bareMetalMachineRunReadCommandsParameters);
    }

    public void runReadCommands(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunReadCommandsParameters bareMetalMachineRunReadCommandsParameters,
        Context context) {
        this
            .serviceClient()
            .runReadCommands(
                resourceGroupName, bareMetalMachineName, bareMetalMachineRunReadCommandsParameters, context);
    }

    public void start(String resourceGroupName, String bareMetalMachineName) {
        this.serviceClient().start(resourceGroupName, bareMetalMachineName);
    }

    public void start(String resourceGroupName, String bareMetalMachineName, Context context) {
        this.serviceClient().start(resourceGroupName, bareMetalMachineName, context);
    }

    public void uncordon(String resourceGroupName, String bareMetalMachineName) {
        this.serviceClient().uncordon(resourceGroupName, bareMetalMachineName);
    }

    public void uncordon(String resourceGroupName, String bareMetalMachineName, Context context) {
        this.serviceClient().uncordon(resourceGroupName, bareMetalMachineName, context);
    }

    public void validateHardware(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineValidateHardwareParameters bareMetalMachineValidateHardwareParameters) {
        this
            .serviceClient()
            .validateHardware(resourceGroupName, bareMetalMachineName, bareMetalMachineValidateHardwareParameters);
    }

    public void validateHardware(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineValidateHardwareParameters bareMetalMachineValidateHardwareParameters,
        Context context) {
        this
            .serviceClient()
            .validateHardware(
                resourceGroupName, bareMetalMachineName, bareMetalMachineValidateHardwareParameters, context);
    }

    public BareMetalMachine getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String bareMetalMachineName = Utils.getValueFromIdByName(id, "bareMetalMachines");
        if (bareMetalMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, bareMetalMachineName, Context.NONE).getValue();
    }

    public Response<BareMetalMachine> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String bareMetalMachineName = Utils.getValueFromIdByName(id, "bareMetalMachines");
        if (bareMetalMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, bareMetalMachineName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String bareMetalMachineName = Utils.getValueFromIdByName(id, "bareMetalMachines");
        if (bareMetalMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachines'.", id)));
        }
        this.delete(resourceGroupName, bareMetalMachineName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String bareMetalMachineName = Utils.getValueFromIdByName(id, "bareMetalMachines");
        if (bareMetalMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachines'.", id)));
        }
        this.delete(resourceGroupName, bareMetalMachineName, context);
    }

    private BareMetalMachinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    public BareMetalMachineImpl define(String name) {
        return new BareMetalMachineImpl(name, this.manager());
    }
}