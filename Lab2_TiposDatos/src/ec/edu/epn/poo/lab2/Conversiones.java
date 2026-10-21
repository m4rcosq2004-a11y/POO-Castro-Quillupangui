package ec.edu.epn.poo.lab2;
 
public class Conversiones {
    public static void main(String[] args) {
        // Ampliación (implícita)
        int i = 100;
        long l = i;
        double d = l;
        System.out.println("int -> long -> double : " + d);
        long grande = 123456789L;
        float f = grande;          // ampliación con pérdida
        System.out.println("123456789L como float : " + f);
 
        // Estrechamiento (cast explícito)
        System.out.println("(int) 9.99            : " + (int) 9.99);
        System.out.println("(int) -9.99           : " + (int) -9.99);
        System.out.println("Math.round(9.5)       : " + Math.round(9.5));
        System.out.println("(byte) 200            : " + (byte) 200);
        System.out.println("(char) 65             : " + (char) 65);
        System.out.println("(int) 3e10            : " + (int) 3e10);
 
        // Promoción numérica
        byte a = 10, b = 20;
        byte c = (byte) (a + b);              // sin el cast no compila
        System.out.println("(byte) (a + b)        : " + c);
        System.out.println("7 / 2                 : " + 7 / 2);
        double y = 7 / 2;
        System.out.println("double y = 7 / 2      : " + y);
        System.out.println("7 / 2.0               : " + 7 / 2.0);
        System.out.println("'A' + 2               : " + ('A' + 2));
 
        // Texto <-> número
        int n = Integer.parseInt("42");
        double p = Double.parseDouble("3.5");
        String s = String.valueOf(n + p);
        System.out.println("parseInt + parseDouble: " + s);
    }
}
