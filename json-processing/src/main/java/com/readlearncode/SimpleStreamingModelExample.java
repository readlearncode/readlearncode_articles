package com.readlearncode;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SimpleStreamingModelExample {

    public JsonObject buildJsonDocument() {

        JsonObject jsonObject = Json.createObjectBuilder()
                .add("id", 123456)
                .add("title", "Fun with JSON-Processing")
                .add("published", true)
                .build();

        return jsonObject;
    }

}