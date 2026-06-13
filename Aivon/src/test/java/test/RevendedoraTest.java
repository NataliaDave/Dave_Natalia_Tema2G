/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;


import java.time.LocalDate;
import java.time.Month;
import modelo1.Revendedora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Dave Natalia
 */


public class RevendedoraTest {
    
    public RevendedoraTest() {
    }
    
    private static LocalDate fechaLocal;
    private static int i=0;
    
    private Revendedora revCuenta;
    private Revendedora rev3;
    
    @BeforeClass
    public static void inicio() {
        fechaLocal= LocalDate.of(2024, Month.JUNE, 8);
        System.out.println("Fecha de transacción " + fechaLocal);
    }
    
    @AfterClass
    public static void fin() {
        System.out.println("FIN de la transacción.");
    }
    
    @Before
    public void setUp() {
        revCuenta = new Revendedora ("Cintia", "30222333", 100, 9000.0);
        rev3 = new Revendedora ("Marina", "30333444", 200, 5000.0);
    }
    
    @After
    public void tearDown() {
        i++;
        System.out.println("Transaccion" + i + "> El monto en cuenta es " + revCuenta.getSaldo());
    }

 @Test (expected = Exception.class)
 public void testRetirarFallo() throws Exception{
     revCuenta.retirarDinero(88000.0);
 }
 
 @Test
 public void testRetirarExito() throws Exception{
 
     double saldoFinal= revCuenta.retirarDinero(1000.0);
     assertEquals(8000.0, saldoFinal, 0.01);
 
 }
 
 @Test
    public void testDepositarDinero() {
        Revendedora cuentaTemporal = null;
        assertNull(cuentaTemporal);
        revCuenta.depositarDinero(revCuenta, 2000.0);
        assertEquals(11000.0, revCuenta.getSaldo(), 0.002);
    }
    
    @Test
    public void testTransferirCuentaNoNula() throws Exception {
        assertNull("La CUENTA no es null" , revCuenta);
        Revendedora rev2 = new Revendedora ("Lucía", "30444555", 300, 5000.0);
        revCuenta.transferirDinero(rev2, 1000.0);
        assertEquals(8000.0, revCuenta.getSaldo(),0.01);
        assertEquals(6000.0, rev2.getSaldo(), 0.01);
    }
    
    @Test
    public void testSiempreFalla(){
        fail("Fallo de caja.");
    }
    
    @Test
    public void testDolarMEP1(){
        double resultado = revCuenta.convertirMoneda("1300");
        assertEquals(6.92, resultado, 0.01);
    }
    
    @Test
    public void testDolarMEP2(){
        revCuenta.convertirMoneda("1300 U$S");
   }
    
    @Test 
    public void testMismaRevendedora(){
        assertSame("Las cuentas son diferentes---", revCuenta, rev3);
    }
    
    @Test(timeout = 60)
    public void testPagoDemorado(){
        revCuenta.pagoDemorado(100);
    }
}
