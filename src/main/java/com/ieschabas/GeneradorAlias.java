package com.ieschabas;
/**
 * Clase que genera un alias a partir de las primeras letras del nombre y las letras del ciclo introducido
 * @author Deni Dadaev
 * @version 1.0
 */
class GeneradorAlias {
    private String nombreCompleto;
    private String ciclo;

    // Constructor
    public GeneradorAlias(String nombreCompleto, String ciclo) {
        this.nombreCompleto = nombreCompleto;
        this.ciclo = ciclo;
    }

    // Generar alias: primeras 3 letras del nombre + últimas 3 letras del ciclo
    public String generarAlias() {
        String[] partesNombre = nombreCompleto.split(" ");
        String iniciales = partesNombre[0].substring(0, Math.min(3, partesNombre[0].length()));
        String finCiclo = ciclo.substring(Math.max(0, ciclo.length() - 3));
        return iniciales.toLowerCase() + finCiclo.toLowerCase();
    }

    // Generar código numérico: suma de los códigos ASCII de las iniciales del nombre y ciclo
    public int generarCodigo() {
        int suma = 0;
        for (char c : nombreCompleto.toCharArray()) {
            suma += c;
        }
        for (char c : ciclo.toCharArray()) {
            suma += c;
        }
        return suma % 1000; // Limitar a 3 dígitos
    }
}
