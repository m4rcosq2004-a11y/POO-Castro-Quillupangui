package ec.edu.epn.poo.lab4;

import java.util.Locale;

public class OrdenarCatalogo {
    public static void main(String[] args) {
        // Catálogo de 5 productos con 4 parámetros
        Producto[] catalogo = {
            new Producto("Cuaderno", 2.50, 10, "Papelería"),
            new Producto("Esfero", 0.75, 50, "Escritura"),
            new Producto("Borrador", 0.40, 30, "Papelería"),
            new Producto("Regla", 1.20, 0, "Geometría"),
            new Producto("Carpeta", 3.10, 8, "Papelería")
        };

        int intercambios = 0;

        // Ordenamiento por método de la burbuja (menor a mayor precio)
        for (int i = 0; i < catalogo.length - 1; i++) {
            for (int j = 0; j < catalogo.length - 1 - i; j++) {
                if (catalogo[j].precio > catalogo[j + 1].precio) {
                    // Intercambio de una sola referencia de objeto
                    Producto t = catalogo[j];
                    catalogo[j] = catalogo[j + 1];
                    catalogo[j + 1] = t;
                    intercambios++;
                }
            }
        }

        // Mostrar el catálogo ordenado con un bucle for-each
        System.out.printf(Locale.US, "%-10s %-12s %7s %6s%n", "Producto", "Categoría", "Precio", "Stock");
        for (Producto p : catalogo) {
            System.out.printf(Locale.US, "%-10s %-12s %7.2f %6d%n", p.nombre, p.categoria, p.precio, p.stock);
        }

        System.out.println("\nIntercambios realizados: " + intercambios);
    }
}