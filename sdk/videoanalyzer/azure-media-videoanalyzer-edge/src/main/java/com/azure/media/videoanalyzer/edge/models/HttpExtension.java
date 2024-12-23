// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HTTP extension processor allows pipeline extension plugins to be connected to the pipeline through over the HTTP
 * protocol. Extension plugins must act as an HTTP server. Please see https://aka.ms/ava-extension-http for details.
 */
@Fluent
public final class HttpExtension extends ExtensionProcessorBase {
    /*
     * Type discriminator for the derived types.
     */
    private String type = "#Microsoft.VideoAnalyzer.HttpExtension";

    /**
     * Creates an instance of HttpExtension class.
     * 
     * @param name the name value to set.
     * @param inputs the inputs value to set.
     * @param endpoint the endpoint value to set.
     * @param image the image value to set.
     */
    public HttpExtension(String name, List<NodeInput> inputs, EndpointBase endpoint, ImageProperties image) {
        super(name, inputs, endpoint, image);
    }

    /**
     * Get the type property: Type discriminator for the derived types.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpExtension setSamplingOptions(SamplingOptions samplingOptions) {
        super.setSamplingOptions(samplingOptions);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeArrayField("inputs", getInputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("endpoint", getEndpoint());
        jsonWriter.writeJsonField("image", getImage());
        jsonWriter.writeJsonField("samplingOptions", getSamplingOptions());
        jsonWriter.writeStringField("@type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HttpExtension from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HttpExtension if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HttpExtension.
     */
    public static HttpExtension fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            boolean inputsFound = false;
            List<NodeInput> inputs = null;
            boolean endpointFound = false;
            EndpointBase endpoint = null;
            boolean imageFound = false;
            ImageProperties image = null;
            SamplingOptions samplingOptions = null;
            String type = "#Microsoft.VideoAnalyzer.HttpExtension";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("inputs".equals(fieldName)) {
                    inputs = reader.readArray(reader1 -> NodeInput.fromJson(reader1));
                    inputsFound = true;
                } else if ("endpoint".equals(fieldName)) {
                    endpoint = EndpointBase.fromJson(reader);
                    endpointFound = true;
                } else if ("image".equals(fieldName)) {
                    image = ImageProperties.fromJson(reader);
                    imageFound = true;
                } else if ("samplingOptions".equals(fieldName)) {
                    samplingOptions = SamplingOptions.fromJson(reader);
                } else if ("@type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound && inputsFound && endpointFound && imageFound) {
                HttpExtension deserializedHttpExtension = new HttpExtension(name, inputs, endpoint, image);
                deserializedHttpExtension.setSamplingOptions(samplingOptions);
                deserializedHttpExtension.type = type;

                return deserializedHttpExtension;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!nameFound) {
                missingProperties.add("name");
            }
            if (!inputsFound) {
                missingProperties.add("inputs");
            }
            if (!endpointFound) {
                missingProperties.add("endpoint");
            }
            if (!imageFound) {
                missingProperties.add("image");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
