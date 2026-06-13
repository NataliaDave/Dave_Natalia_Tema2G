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
public class CajaPedido {

    private int nroCaja;
    private List<RenglonPedido> renglones = new ArrayList<>();

    public CajaPedido(int nroCaja) {
        this.nroCaja = nroCaja;
    }

    public void agregarRenglon(RenglonPedido r) {
        renglones.add(r);
    }

    public double calcularSubtotalCaja() {
        double total = 0;
        for (RenglonPedido r : renglones) {
            total += r.calcularSubtotal();
        }
        return total;
    }

    public int getNroCaja() {
        return nroCaja;
    }

    public List<RenglonPedido> getRenglones() {
        return renglones;
    }
}
