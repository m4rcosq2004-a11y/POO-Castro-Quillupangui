package ec.edu.epn.poo.lab4;
 
import java.util.Locale;
 
public class Tienda {
    public static void main(String[] args) {
        Producto p = new Producto(null,0.0,0); 
        System.out.println("nombre = " + p.nombre);
        System.out.println("precio = " + p.precio);
        System.out.println("stock  = " + p.stock);
 
        p.nombre = "Cuaderno";                
        p.precio = 2.50;
        p.stock = 10;
        System.out.printf(Locale.US, "%s: %.2f (%d en stock)%n",
                p.nombre, p.precio, p.stock);  
    }
}
