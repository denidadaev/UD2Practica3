package com.ieschabas;

class CalculadoraTexto {
    private double n1;
    private double n2;

    // Constructor
    public CalculadoraTexto(String expresion) {
        String[] partes = expresion.split("\\+");
        this.n1 = Double.parseDouble(partes[0].trim());
        this.n2 = Double.parseDouble(partes[1].trim());
    }

    // Calcular suma
    public double calcularSuma() {
        return n1 + n2;
    }

    // Calcular resta
    public double calcularResta() {
        return n1 - n2;
    }

    // Calcular producto
    public double calcularProducto() {
        return n1 * n2;
    }

    // Generar resumen
    public String generarResumen() {
        return String.format("Suma: %.2f, Resta: %.2f, Producto: %.2f",
                calcularSuma(), calcularResta(), calcularProducto());
    }
}