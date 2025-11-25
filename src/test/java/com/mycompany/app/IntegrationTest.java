package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {

    @Test
    public void testFlujoCompleto() {
        ServicioA a = new ServicioA();
        ServicioB b = new ServicioB();

        String datos = a.obtenerDatos();
        String procesado = b.procesar(datos);

        assertEquals("OK-DATOS", procesado);
    }
}

class ServicioA {
    public String obtenerDatos() {
        return "DATOS";
    }
}

class ServicioB {
    public String procesar(String datos) {
        return "OK-" + datos;
    }
}
