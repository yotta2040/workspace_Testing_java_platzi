package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {


    @Test
    void false_when_is_not_empty() {
        assertFalse(StringUtil.isEmpty("tony"));
    }

    @Test
    void true_when_is_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    void true_when_is_space() {
        assertTrue(StringUtil.isEmpty(" "));
    }

    @Test
    void true_when_is_null() {
        assertTrue(StringUtil.isEmpty(null));
    }
}