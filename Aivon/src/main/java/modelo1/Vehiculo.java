/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;


import java.util.*;

/**
 *
 * @author Dave Natalia
 */
public class Vehiculo {

    private String patente;
    private String modelo;
    private List<Pedido> pedidos = new ArrayList<>();

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public void cargarPedido(Pedido p) {
        pedidos.add(p);
        p.setVehiculo(this);
    }

    public void descargarPedido(Pedido p) {
        pedidos.remove(p);
        p.setVehiculo(null);
    }

    public void seguirVehiculo() {
        System.out.println("Siguiendo vehiculo " + patente + "por GPS");
    }

    public String getPatente() {
        return patente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

}

