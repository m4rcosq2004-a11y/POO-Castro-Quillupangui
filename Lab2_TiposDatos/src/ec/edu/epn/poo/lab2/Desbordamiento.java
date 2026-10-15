package ec.edu.epn.poo.lab2;
 
public class Desbordamiento {
    public static void main(String[] args) {
        // 1. Desbordamiento de enteros
        int max = Integer.MAX_VALUE;
        int r = max + 1;
        long ok = max + 1L;
        System.out.println("max + 1  (int)  = " + r);
        System.out.println("max + 1L (long) = " + ok);
        byte b = 127;
        b++;
        System.out.println("byte 127 + 1    = " + b);
 
        // 2. Precisión de punto flotante
        System.out.println("0.1 + 0.2       = " + (0.1 + 0.2));
        System.out.println("0.1f + 0.2f     = " + (0.1f + 0.2f));
        float grande = 16777217;          // 2^24 + 1
        System.out.println("16777217 float  = " + grande);
        System.out.println("1.0 / 0         = " + (1.0 / 0));
        System.out.println("0.0 / 0         = " + (0.0 / 0));
 
        // 3. Detectar el desbordamiento (paso 3: quitar los //)
        // int seguro = Math.addExact(max, 1);
        // System.out.println("Esta línea no se imprime: " + seguro);
    }
}
