/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author Dave Natalia
 */
public class Campania {

    private int nro;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;
    private boolean activa;
    private List<Pedido> pedidos = new ArrayList<>();

    public Campania(int nro, LocalDate fechaInicio, LocalDate fechaFin, double monto, boolean activa) {
        this.nro = nro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.activa = activa;

    }

    public boolean estaActiva() {

        return activa;

    }

    public int getNro() {

        return nro;

    }

    public List<Pedido> getPedidos() {

        return pedidos;

    }

}
