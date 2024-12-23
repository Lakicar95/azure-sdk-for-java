// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The artifact properties definition.
 */
@Fluent
public class ArtifactProperties implements JsonSerializable<ArtifactProperties> {
    /*
     * The artifact creation time.
     */
    private OffsetDateTime createdTime;

    /*
     * The artifact changed time.
     */
    private OffsetDateTime changedTime;

    /*
     * Anything
     */
    private Object metadata;

    /**
     * Creates an instance of ArtifactProperties class.
     */
    public ArtifactProperties() {
    }

    /**
     * Get the createdTime property: The artifact creation time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: The artifact creation time.
     * 
     * @param createdTime the createdTime value to set.
     * @return the ArtifactProperties object itself.
     */
    public ArtifactProperties withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the changedTime property: The artifact changed time.
     * 
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Set the changedTime property: The artifact changed time.
     * 
     * @param changedTime the changedTime value to set.
     * @return the ArtifactProperties object itself.
     */
    public ArtifactProperties withChangedTime(OffsetDateTime changedTime) {
        this.changedTime = changedTime;
        return this;
    }

    /**
     * Get the metadata property: Anything.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Anything.
     * 
     * @param metadata the metadata value to set.
     * @return the ArtifactProperties object itself.
     */
    public ArtifactProperties withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("createdTime",
            this.createdTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdTime));
        jsonWriter.writeStringField("changedTime",
            this.changedTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.changedTime));
        jsonWriter.writeUntypedField("metadata", this.metadata);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArtifactProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArtifactProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArtifactProperties.
     */
    public static ArtifactProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArtifactProperties deserializedArtifactProperties = new ArtifactProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdTime".equals(fieldName)) {
                    deserializedArtifactProperties.createdTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("changedTime".equals(fieldName)) {
                    deserializedArtifactProperties.changedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("metadata".equals(fieldName)) {
                    deserializedArtifactProperties.metadata = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArtifactProperties;
        });
    }
}
