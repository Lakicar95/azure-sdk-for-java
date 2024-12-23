// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.RecoveryPointModelProperties;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.RecoveryPointModelSystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Recovery point model. */
@Fluent
public final class RecoveryPointModelInner {
    /*
     * Recovery point model properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RecoveryPointModelProperties properties;

    /*
     * Gets or sets the Id of the resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Gets or sets the name of the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Gets or sets the type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The systemData property.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private RecoveryPointModelSystemData systemData;

    /** Creates an instance of RecoveryPointModelInner class. */
    public RecoveryPointModelInner() {
    }

    /**
     * Get the properties property: Recovery point model properties.
     *
     * @return the properties value.
     */
    public RecoveryPointModelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Recovery point model properties.
     *
     * @param properties the properties value to set.
     * @return the RecoveryPointModelInner object itself.
     */
    public RecoveryPointModelInner withProperties(RecoveryPointModelProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the id property: Gets or sets the Id of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Gets or sets the name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Gets or sets the type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the systemData property: The systemData property.
     *
     * @return the systemData value.
     */
    public RecoveryPointModelSystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property properties in model RecoveryPointModelInner"));
        } else {
            properties().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPointModelInner.class);
}
