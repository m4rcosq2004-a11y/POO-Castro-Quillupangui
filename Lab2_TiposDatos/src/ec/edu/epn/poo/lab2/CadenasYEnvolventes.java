package ec.edu.epn.poo.lab2;
 
public class CadenasYEnvolventes {
    public static void main(String[] args) {
        // == frente a equals() con String
        String a = "Hola";
        String b = "Hola";
        String c = new String("Hola");
        System.out.println("a == b        : " + (a == b));
        System.out.println("a == c        : " + (a == c));
        System.out.println("a.equals(c)   : " + a.equals(c));
 
        // Inmutabilidad
        String nombre = "epn";
        nombre.toUpperCase();
        System.out.println("sin reasignar : " + nombre);
        nombre = nombre.toUpperCase();
        System.out.println("reasignando   : " + nombre);
 
        // Caché de Integer
        Integer x1 = 127, x2 = 127;
        Integer y1 = 128, y2 = 128;
        System.out.println("127 == 127    : " + (x1 == x2));
        System.out.println("128 == 128    : " + (y1 == y2));
        System.out.println("128 equals    : " + y1.equals(y2));
 
        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Nota: ").append(18).append("/20");
        System.out.println("StringBuilder : " + sb.toString());
    }
}
