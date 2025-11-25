package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testSuma() {
        int resultado = 2 + 3;
        assertEquals(5, resultado, "La suma debe dar 5");
    }

    @Test
    public void testCadena() {
        String nombre = "Pica";
        assertTrue(nombre.startsWith("P"));
    }
}