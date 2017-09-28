package com.readlearncode;

import org.junit.Test;

import javax.json.JsonObject;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SimpleStreamingModelExampleTest {

    @Test
    public void buildJsonDocument() {
        JsonObject jsonObject = new SimpleStreamingModelExample().buildJsonDocument();

        assertThat(jsonObject.getInt("id")).isEqualTo(123456);
        assertThat(jsonObject.getString("title")).isEqualTo("Fun with JSON-Processing");
        assertThat(jsonObject.getBoolean("published")).isEqualTo(true);
    }

}