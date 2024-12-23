// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RGitHubPackage model. */
@Fluent
public final class RGitHubPackage {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(RGitHubPackage.class);

    /*
     * Repository address in the format username/repo[/subdir][@ref|#pull].
     */
    @JsonProperty(value = "repository")
    private String repository;

    /*
     * Personal access token to install from a private repo
     */
    @JsonProperty(value = "authToken")
    private String authToken;

    /**
     * Get the repository property: Repository address in the format username/repo[/subdir][@ref|#pull].
     *
     * @return the repository value.
     */
    public String repository() {
        return this.repository;
    }

    /**
     * Set the repository property: Repository address in the format username/repo[/subdir][@ref|#pull].
     *
     * @param repository the repository value to set.
     * @return the RGitHubPackage object itself.
     */
    public RGitHubPackage withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the authToken property: Personal access token to install from a private repo.
     *
     * @return the authToken value.
     */
    public String authToken() {
        return this.authToken;
    }

    /**
     * Set the authToken property: Personal access token to install from a private repo.
     *
     * @param authToken the authToken value to set.
     * @return the RGitHubPackage object itself.
     */
    public RGitHubPackage withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
