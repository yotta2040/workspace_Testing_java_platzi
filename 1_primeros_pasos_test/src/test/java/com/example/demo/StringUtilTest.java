package com.example.demo;



import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class StringUtilTest {


    @Test
    public void repeat_string_one_time() {
        assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multipl_time() {
        assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_time() {
        assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test
    public void repeat_string_negative_time() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("hola", -1);
        });
    }

}