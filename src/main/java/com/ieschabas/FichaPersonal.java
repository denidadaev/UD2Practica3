
package com.ieschabas;

import java.time.LocalDate;
import java.time.Period;

/**
 * Clase que me crea una ficha con mi nombre, mi edad calculada y donde vivo
 *
 * @author Deni Dadaev
 * @version 1.0
 */
class FichaPersonal {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String ciudad;

    /**
     * Método para generar los datos del usuario
     *
     * @param datos
     */
    public FichaPersonal(String datos) {
        String[] partes = datos.split(" - ");
        String[] nombreApellido = partes[0].split(" ");
        this.nombre = nombreApellido[0];
        this.apellido = nombreApellido[1];
        this.fechaNacimiento = LocalDate.parse(partes[1]);
        this.ciudad = partes[2];
    }

    /**
     * Método para calcular la edad del usuario
     *
     * @return int
     */
    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    /**
     * Método para generar la etiqueta de identificación
     *
     * @return String
     */
    public String generarEtiqueta() {
        return String.format("Nombre: " + nombre + " Apellidos: " + apellido + " Fecha de nacimiento: " + fechaNacimiento + " Edad: " + calcularEdad() + " Ciudad: " + ciudad);
    }
}

