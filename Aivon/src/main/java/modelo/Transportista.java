/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dave Natalia
 */
public class Transportista {

    private String nombreCompleto, whatsapp;
    private int nroTransportista;

    public Transportista(String nombreCompleto, int nroTransportista, String whatsapp) {
        this.nombreCompleto = nombreCompleto;
        this.nroTransportista = nroTransportista;
        this.whatsapp = whatsapp;
    }

    public String escanearPedido(Pedido pedido) {
        System.out.println("QR: " + pedido.getQr() + " -> Destino: " + pedido.getDomicilio());
        return pedido.getDomicilio();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
