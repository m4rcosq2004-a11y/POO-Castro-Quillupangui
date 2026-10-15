package ec.edu.epn.poo.lab2;
 
import java.util.Locale;
import java.util.Scanner;
 
public class CalculadoraTipos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);             // punto decimal
 
        System.out.print("Ingrese un entero a: ");
        int a = sc.nextInt();
        System.out.print("Ingrese un entero b (distinto de 0): ");
        int b = sc.nextInt();
        System.out.print("Ingrese un número real x: ");
        double x = sc.nextDouble();
        sc.nextLine();          // consume el Enter pendiente
        System.out.print("Ingrese un número como texto: ");
        String texto = sc.nextLine();
 
        System.out.println("\n=== Operaciones con enteros ===");
        System.out.println("a + b           = " + (a + b));
        System.out.println("a / b (entera)  = " + (a / b));
        System.out.println("a % b (resto)   = " + (a % b));
        System.out.println("a / b (real)    = " + ((double) a / b));
        System.out.println("a * b (long)    = " + ((long) a * b));
 
        System.out.println("\n=== Conversiones de x ===");
        System.out.println("(int) x         = " + (int) x);
        System.out.println("Math.round(x)   = " + Math.round(x));
        System.out.println("(byte) x        = " + (byte) x);
        System.out.println("(float) x       = " + (float) x);
 
        System.out.println("\n=== Otros tipos ===");
        System.out.println("(char) a        = " + (char) a);
        System.out.println("(byte) a        = " + (byte) a);
        int desdeTexto = Integer.parseInt(texto.strip());
        System.out.println("texto + 1       = " + (desdeTexto + 1));
        System.out.println("texto concatenado con 1 = " + texto + 1);
 
        sc.close();
    }
}
