package com.ieschabas;

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
        return String.format("%-20s %.2f", producto, precioBase);
    }

    // Calcular total con IVA
    public double calcularTotal() {
        return precioBase * (1 + iva);
    }
}
