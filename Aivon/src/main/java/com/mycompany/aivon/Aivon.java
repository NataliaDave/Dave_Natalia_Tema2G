/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aivon;
import java.time.LocalDate;
import modelo1.*;

/**
 *
 * @author Dave Natalia
 */
public class Aivon {

    public static void main(String[] args) throws Exception {
 
        Producto esmalteRojo = new Producto("P001", "Esmalte Rojo", "Unas", 15, 800, 500);
        Producto crema = new Producto("P002", "Crema Hidratante", "Piel", 200, 1500, 900);
        Producto perfume = new Producto("P003", "Perfume Floral", "Cuerpo", 100, 5000, 3000);

        Campania campania6 = new Campania(6, LocalDate.of(2026, 6, 1), LocalDate.of(2026, 6, 25), 50000, true);
        Revendedora revendedora = new Revendedora("Ana Gomez", "30111222", 1001, 9000);

        // Secuencia A
        Pedido pedido = new Pedido(101, LocalDate.now(), "Calle Chile 123, San Luis", "QR-101", revendedora, campania6);

        CajaPedido caja1 = new CajaPedido(1);
        caja1.agregarRenglon(new RenglonPedido(esmalteRojo, 20));
        caja1.agregarRenglon(new RenglonPedido(crema, 5));
        caja1.agregarRenglon(new RenglonPedido(perfume, 2));
        pedido.agregarCaja(caja1);

        System.out.println("Importe del pedido #" + pedido.getNro() + ": $" + pedido.calcularImporte());
        System.out.println("Ya tiene pedido en campania 6? " + revendedora.hayPedido(campania6));

        // Secuencia B
        Vehiculo camion = new Vehiculo("AB123CD", "Mercedes Sprinter");
        camion.cargarPedido(pedido);

        Transportista transportista = new Transportista("Juan Perez", 55, "+5492664000000");
        String destino = transportista.escanearPedido(pedido);

        System.out.println("IUScreen -> Destino final: " + destino);
    }
}
