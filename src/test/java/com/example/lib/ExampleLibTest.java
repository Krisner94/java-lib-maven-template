package com.example.lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleLibTest {
    @Test
    void testHello() {
        assertEquals("hello", ExampleLib.hello());
    }
}
