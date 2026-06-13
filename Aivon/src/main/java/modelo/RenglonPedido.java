/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dave Natalia
 */
public class RenglonPedido {
       private Producto producto;
    private int cantidad;
    private double subtotal;

    public RenglonPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecioVenta() * cantidad;
    }

    public double calcularSubtotal() { 
        return subtotal; 
    }
    public Producto getProducto() {
        return producto;
    }
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return producto.getNombre() + " x" + cantidad + " = $" + subtotal;
    }
}
    

