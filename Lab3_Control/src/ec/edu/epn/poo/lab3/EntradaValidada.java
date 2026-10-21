package ec.edu.epn.poo.lab3;
 
import java.util.Scanner;
 
public class EntradaValidada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
 
        // 1. Validar el tipo (while) y el rango (do-while)
        do {
            System.out.print("Cantidad (1 a 20): ");
            while (!sc.hasNextInt()) {
                System.out.print("No es un entero. Cantidad (1 a 20): ");
                sc.next();                          // descarta el token inválido
            }
            cantidad = sc.nextInt();
            if (cantidad < 1 || cantidad > 20) {
                System.out.println("Fuera de rango.");
            }
        } while (cantidad < 1 || cantidad > 20);
        System.out.println("Cantidad aceptada: " + cantidad);
 
        // 2. Tabla de multiplicar con for (traza con el depurador)
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d x %d = %d%n", cantidad, i, cantidad * i);
        }
        sc.close();
    }
}
