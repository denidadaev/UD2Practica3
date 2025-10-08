package com.ieschabas;
/**
 * Clase que me crea una ficha con mi nombre, mi edad calculada y donde vivo
 * @author Deni Dadaev
 * @version 1.0
 */
class FormateadorFactura {
    private String producto;
    private double precioBase;
    private double iva;

    // Constructor
    public FormateadorFactura(String producto, double precioBase, double iva) {
        this.producto = producto;
        this.precioBase = precioBase;
        this.iva = iva / 100.0;
    }

    // Generar línea de ticket
    public String generarLineaTicket() {
        return String.format("Ticket del producto: " + producto + " " + precioBase + "€");
    }

    // Calcular total con IVA
    public double calcularTotal() {
        return precioBase * (1 + iva);
    }
}
