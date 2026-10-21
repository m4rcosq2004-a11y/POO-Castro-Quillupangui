package ec.edu.epn.poo.lab3;
 
import java.util.Locale;
 
public class Catalogo {
    public static void main(String[] args) {
        // Arreglos paralelos: el mismo índice describe al mismo producto
        String[] nombres = {"Cuaderno", "Esfero", "Borrador", "Regla", "Carpeta","Marcador"};
        double[] precios = {2.50, 0.75, 0.40, 1.20, 3.10,0.90};
        int[] stock = {10, 50, 30, 0, 8,25};
 
        // 1. Recorrido con for e índice
        System.out.printf("%-4s %-10s %7s %6s%n",
                "Cód", "Producto", "Precio", "Stock");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf(Locale.US, "%-4d %-10s %7.2f %6d%n",
                    i + 1, nombres[i], precios[i], stock[i]);
        }
 
        // 2. Acumuladores: suma, índice del máximo y contador
        double suma = 0;
        int iMax = 0;
        int agotados = 0;
        for (int i = 0; i < precios.length; i++) {
            suma += precios[i];
            if (precios[i] > precios[iMax]) {
                iMax = i;
            }
            if (stock[i] == 0) {
                agotados++;
            }
        }
        double promedio = suma / precios.length;
        System.out.printf(Locale.US, "Precio promedio: %.2f%n", promedio);
        System.out.println("Más caro: " + nombres[iMax]);
        System.out.println("Agotados: " + agotados);
    }
}
