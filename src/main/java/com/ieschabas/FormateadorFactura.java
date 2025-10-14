

package com.ieschabas;

/**
 * Clase que crea un ticket de un producto con su precio y su iva
 *
 * @author Deni Dadaev
 * @version 1.0
 */
class FormateadorFactura {
    private String producto;
    private double precioBase;
    private double iva;

    /**
     * Método para generar el nombre del producto, su precio básico y el iva
     *
     * @param producto
     * @param precioBase
     * @param iva
     */
    public FormateadorFactura(String producto, double precioBase, double iva) {
        this.producto = producto;
        this.precioBase = precioBase;
        this.iva = iva / 100.0;
    }

    /**
     * Método para generar el ticket
     *
     * @return String
     */
    public String generarLineaTicket() {
        return String.format("Ticket del producto: " + producto + " " + precioBase + "€");
    }

    /**
     * Método para calcular el ticket con le iva incluido
     *
     * @return double
     */
    public double calcularTotal() {
        return precioBase * (1 + iva);
    }
}

