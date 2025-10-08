package com.ieschabas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Actividad 1: Generador de alias
        System.out.println("Actividad 1: Generador de alias académico");
        System.out.print("Ingrese nombre completo: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese ciclo: ");
        String ciclo = scanner.nextLine();
        GeneradorAlias alias = new GeneradorAlias(nombre, ciclo);
        System.out.println("Alias: " + alias.generarAlias());
        System.out.println("Código: " + alias.generarCodigo());
        System.out.println();

        // Actividad 2: Calculadora de texto
        System.out.println("Actividad 2: Calculadora de texto");
        System.out.print("Ingrese expresión (formato n1+n2 o n1 + n2): ");
        String expresion = scanner.nextLine();
        CalculadoraTexto calc = new CalculadoraTexto(expresion);
        System.out.println(calc.generarResumen());
        System.out.println();

        // Actividad 3: Formateador de factura
        System.out.println("Actividad 3: Formateador de factura");
        System.out.print("Ingrese nombre del producto: ");
        String producto = scanner.nextLine();
        System.out.println("El nombre del producto es: " + producto);
        //Creo el precio
        System.out.println("Ingrese precio base: ");
        double precio = scanner.nextDouble();
        System.out.println("El precio base es: " + precio + "€");
        //calcular el porcentaje del IVA
        System.out.println("Ingrese porcentaje de IVA: ");
        double iva = scanner.nextDouble();
        System.out.println("El porcentaje de IVA es: " + iva + "%");
        //Calcular el ticket y el precio total con iva incluido
        scanner.nextLine();
        FormateadorFactura factura = new FormateadorFactura(producto, precio, iva);
        System.out.println("Ticket: " + factura.generarLineaTicket());
        double total = factura.calcularTotal();
        double totalRedondeado = Math.round(total * 100.0) / 100.0;
        System.out.println("Total con IVA: " + totalRedondeado);
        System.out.println();

        // Actividad 4: Ficha personal
        System.out.println("Actividad 4: Ficha personal");
        //ingresar los datos tal y como pone en el formato
        System.out.print("Ingrese datos (formato: Nombre Apellido - YYYY-MM-DD - Ciudad): ");
        String datos = scanner.nextLine();
        FichaPersonal ficha = new FichaPersonal(datos);
        System.out.println(ficha.generarEtiqueta());
        System.out.println();

        // Actividad 5: Normalizador de registro
        System.out.println("Actividad 5: Normalizador de registro");
        //Solicitar nombre
        System.out.println("Ingrese usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Bienvenido: " + usuario);
        //solicitar correo electrónico
        System.out.println("Ingrese correo electrónico: ");
        String correo = scanner.nextLine();
        // Solicitar número de teléfono
        System.out.println("Ingrese número de teléfono, con el prefijo: ");
        String telefono = scanner.nextLine();
        // Crear objeto NormalizadorDeRegistro
        NormalizadorDeRegistro normalizador = new NormalizadorDeRegistro(usuario, correo, telefono);
        // Mostrar resultados
        System.out.println("Resultados del normalizador: " + ", " + "usuario formateado: " + normalizador.formatearUsuario() + ", " +" correo electrónico: " + normalizador.formatoCorreo() + ", " + " prefijo del teléfono: " + normalizador.extraerPrefijo() + ", " + " clave numérica: " + normalizador.generarClave());
    }
}