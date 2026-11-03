package ec.edu.epn.poo.lab4;
 
public class Constructores {
    public static void main(String[] args) {
        Producto c = new Producto("Cuaderno", 2.50, 10);
        Producto e = new Producto("Esfero", 0.75, 50);
        System.out.println(c.nombre + " " + c.precio + " " + c.stock);
        System.out.println(e.nombre + " " + e.precio + " " + e.stock);
    }
}
