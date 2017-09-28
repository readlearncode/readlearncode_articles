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
public class SimpleJsonProcessingExampleTest {

    @Test
    public void loadJsonString()   {

        JsonObject jsonObject = new SimpleJsonProcessingExample().loadJsonString();

        assertThat(jsonObject.getString("id")).isEqualTo("QWERTY1234");
        assertThat(jsonObject.getString("title")).isEqualTo("Fun with JSON-Processing");
        assertThat(jsonObject.getString("author")).isEqualTo("Alex Theedom");

    }

}