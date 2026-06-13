/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dave Natalia
 */
public class Revendedora {
    private String nombre;
    private String dni;
    private int nroCuenta;
    private double saldo;
    
    private List<Pedido> pedidos = new ArrayList<>();

    public Revendedora() {
    }

    public Revendedora(String nombre, String dni, int nroCuenta, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    
    //Métodos
    
    public boolean tieneSaldo() {

        return saldo > 0;

    }

    public boolean cuentasDiferentes(Revendedora otra) {

        return !this.equals(otra);

    }

    public double convertirMoneda(String cotizacion) {

        return this.saldo / (Integer.parseInt(cotizacion));

    }
    
    public void pagoDemorado(int time) {

        try {

            Thread.sleep(time);
            System.out.println("El pago se produjo en tiempo y forma");

        } catch (InterruptedException e) {

            System.out.println("El pago ha tardado demasiado!!!" + time + " cancelando.");
        }

    }
    public double retirarDinero(double monto) throws Exception {
        if (monto > saldo) {
            throw new Exception("Su cuenta no tiene saldo.");
        }
        saldo -= monto;
        return saldo;
    }

    public void depositarDinero(Revendedora destino, double monto) {
        destino.saldo += monto;
    }

    public void transferirDinero(Revendedora destino, double monto) throws Exception {
        retirarDinero(monto);
        depositarDinero(destino, monto);
    }

    public boolean hayPedido(Campania campania) {
        for (Pedido p : pedidos) {
            if (p.getCampania().getNro() == campania.getNro()) {
                return true;
            }
        }
        return false;
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
    
}
