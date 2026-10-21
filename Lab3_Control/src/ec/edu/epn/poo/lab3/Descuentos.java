package ec.edu.epn.poo.lab3;
 
import java.util.Locale;
import java.util.Scanner;
 
public class Descuentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
 
        System.out.print("Total de la compra: ");
        double total = sc.nextDouble();
        System.out.print("Categoría del cliente (A, B, C): ");
        char categoria = sc.next().toUpperCase().charAt(0);
 
        // 1. Descuento por monto: if / else if / else
        double porcentaje;
        if (total >= 100) {
            porcentaje = 0.10;
        } else if (total >= 50) {
            porcentaje = 0.05;
        } else {
            porcentaje = 0.0;
        }
 
        // 2. Beneficio por categoría: switch con flechas
        String beneficio;
        switch (categoria) {
            case 'A' -> beneficio = "envío gratis";
            case 'B' -> beneficio = "puntos dobles";
            case 'C' -> beneficio = "sin beneficio adicional";
            default  -> beneficio = "categoría inválida";
        }
 
        // 3. Ternario: el envío es gratis desde 30 o para la categoría A
        double envio = (total >= 30 || categoria == 'A') ? 0.0 : 2.50;
 
        double aPagar = total - total * porcentaje + envio;
        System.out.printf(Locale.US, "Descuento: %.0f %%%n", porcentaje * 100);
        System.out.println("Beneficio: " + beneficio);
        System.out.printf(Locale.US, "Envío:     %.2f%n", envio);
        System.out.printf(Locale.US, "A pagar:   %.2f%n", aPagar);
        sc.close();
    }
}
