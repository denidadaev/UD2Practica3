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
        System.out.print("Ingrese expresión (formato n1+n2): ");
        String expresion = scanner.nextLine();
        CalculadoraTexto calc = new CalculadoraTexto(expresion);
        System.out.println(calc.generarResumen());
        System.out.println();

        // Actividad 3: Formateador de factura
        System.out.println("Actividad 3: Formateador de factura");
        System.out.print("Ingrese nombre del producto: ");
        String producto = scanner.nextLine();
        System.out.print("Ingrese precio base: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese porcentaje de IVA: ");
        double iva = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        FormateadorFactura factura = new FormateadorFactura(producto, precio, iva);
        System.out.println("Ticket: " + factura.generarLineaTicket());
        System.out.printf("Total con IVA: %.2f\n", factura.calcularTotal());
        System.out.println();

        // Actividad 4: Ficha personal
        System.out.println("Actividad 4: Ficha personal");
        System.out.print("Ingrese datos (formato: Nombre Apellido - YYYY-MM-DD - Ciudad): ");
        String datos = scanner.nextLine();
        FichaPersonal ficha = new FichaPersonal(datos);
        System.out.println(ficha.generarEtiqueta());
        System.out.println();

        // Actividad 5: Normalizador de registro
        System.out.println("Actividad 5: Normalizador de registro");
        System.out.print("Ingrese usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Bienvenido: " + usuario);
    }
}