package ec.edu.epn.poo.lab4;
 
public class Referencias {
    public static void main(String[] args) {
        Producto p1 = new Producto("Cuaderno", 2.50, 10);
        Producto p2 = p1;                 
        p2.precio = 3.00;
        Producto p3 = new Producto("Cuaderno", 3.00, 10);     // otro objeto con los mismos datos
        p3.nombre = "Cuaderno";
        p3.precio = 3.00;
        p3.stock = 10;
 
        System.out.println("1) p1.precio = " + p1.precio);
        System.out.println("2) p1 == p2  = " + (p1 == p2));
        System.out.println("3) p1 == p3  = " + (p1 == p3));
 
        p1 = null;
        System.out.println("4) p2.nombre = " + p2.nombre);
        System.out.println("5) p1.nombre = " + p1.nombre);
    }
}
