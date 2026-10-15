package ec.edu.epn.poo.lab2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Recibo {
    public static void main(String[] args) {
        final double IVA = 0.15;                 // IVA de Ecuador
        Scanner sc = new Scanner(System.in);
        
        // Configuración regional para Ecuador (es-EC)
        Locale localeEC = Locale.forLanguageTag("es-EC");
        sc.useLocale(localeEC);

        // --- CÓDIGO DE FACTURA ---
        int numFactura = 127;

        // --- PRODUCTO 1 ---
        System.out.print("Producto 1: ");
        String producto1 = sc.nextLine();
        System.out.print("Cantidad 1: ");
        int cantidad1 = sc.nextInt();
        System.out.print("Precio unitario 1: ");
        double precio1 = sc.nextDouble();

        // Limpieza del Enter pendiente
        sc.nextLine(); 

        // --- PRODUCTO 2 ---
        System.out.print("Producto 2: ");
        String producto2 = sc.nextLine();
        System.out.print("Cantidad 2: ");
        int cantidad2 = sc.nextInt();
        System.out.print("Precio unitario 2: ");
        double precio2 = sc.nextDouble();

        // --- CÁLCULOS ---
        double subtotal1 = cantidad1 * precio1;
        double subtotal2 = cantidad2 * precio2;
        double subtotalTotal = subtotal1 + subtotal2;

        double iva = subtotalTotal * IVA;
        double total = subtotalTotal + iva;

        // --- IMPRESIÓN DEL RECIBO ---
        System.out.println();
        System.out.println("=========== RECIBO ===========");
        System.out.printf(localeEC, "Factura N°: %08d%n", numFactura);
        System.out.println("------------------------------");
        System.out.printf(localeEC, "%-14s %4s %10s%n",
                "Producto", "Cant", "Subtotal");
        
        // Fila Producto 1
        System.out.printf(localeEC, "%-14.14s %4d %,10.2f%n",
                producto1, cantidad1, subtotal1);
        // Fila Producto 2
        System.out.printf(localeEC, "%-14.14s %4d %,10.2f%n",
                producto2, cantidad2, subtotal2);

        System.out.println("------------------------------");
        System.out.printf(localeEC, "%-19s %,10.2f%n", "IVA 15 %", iva);
        System.out.printf(localeEC, "%-19s %,10.2f%n", "TOTAL", total);

        NumberFormat moneda = NumberFormat.getCurrencyInstance(localeEC);
        System.out.println("Total a pagar: " + moneda.format(total));
        sc.close();
    }
}