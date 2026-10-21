package ec.edu.epn.poo.lab3;

import java.util.Locale;
import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        final double IVA = 0.15;

        // Catálogo en arreglos paralelos
        String[] nombres = {"Cuaderno", "Esfero", "Borrador", "Regla", "Carpeta"};
        double[] precios = {2.50, 0.75, 0.40, 1.20, 3.10};
        int[] stock = {10, 50, 30, 0, 8};
        int[] carrito = new int[nombres.length];   // unidades compradas

        int opcion;
        do {
            System.out.println();
            System.out.println("=== CAJA REGISTRADORA ===");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Agregar producto");
            System.out.println("3. Ver recibo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            // TODO 1: validar que la opción sea un entero
            while (!sc.hasNextInt()) {
                System.out.print("No es un entero. Opción: ");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    // TODO 2: mostrar catálogo
                    System.out.printf("%-4s %-12s %6s %6s%n", "Cód", "Producto", "Precio", "Stock");
                    for (int i = 0; i < nombres.length; i++) {
                        System.out.printf("%-4d %-12s %6.2f %6d%n", 
                                          (i + 1), nombres[i], precios[i], stock[i]);
                    }
                }
                case 2 -> {
                    // TODO 3: pedir el código del producto (1 a 5) y validarlo
                    int codigo;
                    do {
                        System.out.print("Código (1 a 5): ");
                        while (!sc.hasNextInt()) {
                            System.out.print("No es un entero. Código: ");
                            sc.next();
                        }
                        codigo = sc.nextInt();
                    } while (codigo < 1 || codigo > nombres.length);

                    int indice = codigo - 1;

                    // TODO 4: pedir la cantidad y procesar stock
                    int cantidad;
                    System.out.print("Cantidad: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("No es un entero. Cantidad: ");
                        sc.next();
                    }
                    cantidad = sc.nextInt();

                    if (cantidad > 0 && stock[indice] >= cantidad) {
                        carrito[indice] += cantidad;
                        stock[indice] -= cantidad;
                        System.out.printf("Agregado: %d x %s%n", cantidad, nombres[indice]);
                    } else if (cantidad > 0) {
                        System.out.printf("Stock insuficiente (disponible: %d)%n", stock[indice]);
                    }
                }
                case 3 -> {
                    // TODO 5: mostrar recibo y acumular subtotal
                    double subtotal = 0;
                    System.out.println("--------- RECIBO ---------");
                    for (int i = 0; i < nombres.length; i++) {
                        if (carrito[i] > 0) {
                            double importe = carrito[i] * precios[i];
                            subtotal += importe;
                            System.out.printf("%-10s %2d x %5.2f %7.2f%n", 
                                              nombres[i], carrito[i], precios[i], importe);
                        }
                    }
                    System.out.println("--------------------------");

                    // TODO 6: Regla de descuento corregida para que dé 0.00 cuando subtotal es 13.70
                    double descuento = 0.0;
                    if (subtotal >= 50.0) {
                        descuento = subtotal * 0.10;
                    } else if (subtotal >= 20.0) {
                        descuento = subtotal * 0.05;
                    }

                    double baseImponible = subtotal - descuento;
                    double valorIva = baseImponible * IVA;
                    double total = baseImponible + valorIva;

                    System.out.printf("%-20s %7.2f%n", "Subtotal", subtotal);
                    System.out.printf("%-20s %7.2f%n", "Descuento", descuento);
                    System.out.printf("%-20s %7.2f%n", "IVA 15 %", valorIva);
                    System.out.printf("%-20s %7.2f%n", "TOTAL", total);
                }
                case 0 -> System.out.println("Gracias por su compra.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}