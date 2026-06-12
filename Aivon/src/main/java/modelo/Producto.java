/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dave Natalia
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String uso;
    private double tamanioCm3;
    private double precioVenta;
    private double precioCosto;

    public Producto(String codigo, String nombre, String uso, double tamanioCm3, double precioVenta, double precioCosto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.uso = uso;
        this.tamanioCm3 = tamanioCm3;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public double getTamanioCm3() {
        return tamanioCm3;
    }

    public void setTamanioCm3(double tamanioCm3) {
        this.tamanioCm3 = tamanioCm3;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    @Override
    public String toString() {
        return nombre + " (cod " + codigo + ") $" + precioVenta;
    }
    
    
    
    
}
