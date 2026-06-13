/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dave Natalia
 */
public class Pedido {
    
    private int nro;
    private LocalDate fechaIngreso;
    private LocalDate fechaEntrega;
    private LocalDate fechaPago;
    private int cantCajas;
    private String domicilio;
    private String qr;
    private double importe;
    
    private Revendedora revendedora;
    private Campania campania;
    private Vehiculo vehiculo;
    private List<CajaPedido> cajas = new ArrayList<>();

    public Pedido(int nro, LocalDate fechaIngreso, String domicilio, String qr, Revendedora revendedora, Campania campania) throws Exception{
        if (revendedora.hayPedido(campania)){
            throw new Exception ("La revendedora " + revendedora.getNombre() 
                    + " ya tiene un pedido registrado en la campaña " + campania.getNro() + ".");
        }
        
        this.nro = nro;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
        this.qr = qr;
        this.revendedora = revendedora;
        this.campania = campania;
        revendedora.getPedidos().add(this);
        campania.getPedidos().add(this);
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Revendedora getRevendedora() {
        return revendedora;
    }

    public void setRevendedora(Revendedora revendedora) {
        this.revendedora = revendedora;
    }

    public Campania getCampania() {
        return campania;
    }

    public void setCampania(Campania campania) {
        this.campania = campania;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<CajaPedido> getCajas() {
        return cajas;
    }

    public void setCajas(List<CajaPedido> cajas) {
        this.cajas = cajas;
    }

    @Override
    public String toString() {
        return "Pedido # " + nro + "-" + domicilio;
    }
    
    //métodos
    public void agregarCaja(CajaPedido caja) {

        cajas.add(caja);
        cantCajas = cajas.size();

    }

    public double calcularImporte() {

        importe = 0;
        for (CajaPedido c : cajas) {

            importe += c.calcularSubtotalCaja();

        }
        return importe;

    }

    //Pago: hay 10 días hábiles desde fechaEntrega para pagar
    public boolean estaPago() {

        return fechaPago != null;

    }

}
