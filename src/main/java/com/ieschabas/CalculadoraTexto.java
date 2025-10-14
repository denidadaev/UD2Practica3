
package com.ieschabas;

/**
 * Clase que calcula la suma, la resta y el producto de los dos números introducidos
 *
 * @author Deni Dadaev
 * @version 1.0
 */
class CalculadoraTexto {
    private double n1;
    private double n2;

    /**
     * Método que genera el constructor de dos números
     *
     * @param expresion
     */
    public CalculadoraTexto(String expresion) {
        String[] partes = expresion.split("\\+");
        this.n1 = Double.parseDouble(partes[0].trim());
        this.n2 = Double.parseDouble(partes[1].trim());
    }

    /**
     * Método para calcular la suma
     *
     * @return double
     */
    public double calcularSuma() {
        return n1 + n2;
    }

    /**
     * *Método para calcular la resta
     *
     * @return double
     */
    public double calcularResta() {
        return n1 - n2;
    }

    /**
     * *Método para calcular la multiplicación
     *
     * @return double
     */
    public double calcularProducto() {
        return n1 * n2;
    }

    /**
     * Método que devuelve el resultado
     *
     * @return String
     */
    public String generarResumen() {
        return String.format("Suma: " + calcularSuma() + ", " + "Resta: " + calcularResta() + ", " + "Producto: " + calcularProducto());
    }
}