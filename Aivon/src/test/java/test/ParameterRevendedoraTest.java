/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import modelo1.Revendedora;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
/**
 *
 * @author Usuario
 */
public class ParameterRevendedoraTest {
    
    private static double montoActual;
    private static Revendedora cRev = new Revendedora("Cintia", "30222333", 100, 9000.0);
    private static double montoEsperado;

    public ParameterRevendedoraTest(double pMontoActual, Revendedora pRev, Double pMontoEsperado) {
        montoActual = pMontoActual;
        montoEsperado = pMontoEsperado;

    }

    @Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][]{
            {300.5, cRev, 3333.0},
            {500.0, cRev, 8199.5},
            {9999.0, cRev, 1111.0}

        });
    }

    @Test
    public void testRetirarDinero() throws Exception {
        double saldoFinal = cRev.retirarDinero(montoActual);
        System.out.println("Saldo final..." + saldoFinal);
        assertEquals(montoEsperado, saldoFinal, 0.01);
    }

}
