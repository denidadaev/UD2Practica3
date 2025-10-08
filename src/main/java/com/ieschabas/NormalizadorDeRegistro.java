package com.ieschabas;
/**
 * Clase que me registra con datos de nombre completo, correo electrónico, telefono y genera una clave numérica
 * @author Deni Dadaev
 * @version 1.0
 */
class NormalizadorDeRegistro {
    private String usuario;
    private String correo;
    private String telefono;

    // Constructor
    public NormalizadorDeRegistro(String usuario, String correo, String telefono) {
        this.usuario = usuario;
        this.correo = correo;
        this.telefono = telefono;
    }

    // Formatear usuario: primera letra mayúscula, resto minúsculas
    public String formatearUsuario() {
        return usuario.substring(0, 1).toUpperCase() + usuario.substring(1).toLowerCase();
    }

    // Formato canónico del correo: todo en minúsculas
    public String formatoCorreo() {
        return correo.toLowerCase();
    }

    // Extraer prefijo del teléfono (primeros 3 dígitos)
    public String extraerPrefijo() {
        return telefono.substring(0, Math.min(3, telefono.length()));
    }

    // Generar clave numérica: suma de códigos ASCII de usuario y correo
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
