package com.ieschabas;

import java.time.LocalDate;
import java.time.Period;

class FichaPersonal {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String ciudad;

    // Constructor
    public FichaPersonal(String datos) {
        String[] partes = datos.split(" - ");
        String[] nombreApellido = partes[0].split(" ");
        this.nombre = nombreApellido[0];
        this.apellido = nombreApellido[1];
        this.fechaNacimiento = LocalDate.parse(partes[1]);
        this.ciudad = partes[2];
    }

    // Calcular edad aproximada
    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Generar etiqueta de identificación
    public String generarEtiqueta() {
        return String.format("Nombre: %s %s\nFecha de nacimiento: %s\nEdad: %d\nCiudad: %s",
                nombre, apellido, fechaNacimiento, calcularEdad(), ciudad);
    }
}
