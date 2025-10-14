

package com.ieschabas;

/**
 * Clase que me registra con datos de nombre completo, correo electrónico, telefono y genera una clave numérica
 *
 * @author Deni Dadaev
 * @version 1.0
 */
class NormalizadorDeRegistro {
    private String usuario;
    private String correo;
    private String telefono;

    /**
     * Método que genera los Strings de usuario, correo y teléfono
     *
     * @param usuario
     * @param correo
     * @param telefono
     */
    public NormalizadorDeRegistro(String usuario, String correo, String telefono) {
        this.usuario = usuario;
        this.correo = correo;
        this.telefono = telefono;
    }

    /**
     * Método que genera la respuesta para el string usuario
     *
     * @return String
     */
    public String formatearUsuario() {
        return usuario.substring(0, 1).toUpperCase() + usuario.substring(1).toLowerCase();
    }

    /**
     * Método que genera formato del correo: todo en minúsculas
     * return String
     */

    public String formatoCorreo() {
        return correo.toLowerCase();
    }

    /**
     * Método para extraer prefijo del teléfono (primeros 3 dígitos)
     * return String
     */
    public String extraerPrefijo() {
        return telefono.substring(0, Math.min(3, telefono.length()));
    }

    /**
     * Método para generar clave numérica: suma de códigos ASCII de usuario y correo
     *
     * @return int
     */
    public int generarClave() {
        int suma = 0;
        for (char c : usuario.toCharArray()) {
            suma += c;
        }
        for (char c : correo.toCharArray()) {
            suma += c;
        }
        return suma % 10000; // Limitar a 4 dígitos
    }
}

