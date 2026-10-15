package ec.edu.epn.poo.lab2;
 
import java.util.Locale;
import java.util.Scanner;
 
public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // 1. La trampa del Enter pendiente
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Nombre completo: ");
        String nombre = sc.nextLine();     // ¿qué lee aquí?
        System.out.println("edad = " + edad + ", nombre = [" + nombre + "]");
 
        // 2. Solución: consumir el Enter antes de leer la línea
        System.out.print("Nombre completo (otra vez): ");
        nombre = sc.nextLine();
        System.out.println("nombre = [" + nombre + "]");
 
        // 3. Locale: ¿punto o coma decimal?
        System.out.println("Locale del sistema: " + Locale.getDefault());
        // sc.useLocale(Locale.US);           // el punto será el separador
        System.out.print("Estatura en metros (use punto): ");
        double estatura = sc.nextDouble();
        System.out.println("estatura = " + estatura);
 
        sc.close();
    }
}
