package com.example.lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleLibTest {
    @Test
    void testGetGreeting() {
        ExampleLib exampleLib = new ExampleLib();
        assertEquals("Hello World!", exampleLib.getGreeting());
    }
}
