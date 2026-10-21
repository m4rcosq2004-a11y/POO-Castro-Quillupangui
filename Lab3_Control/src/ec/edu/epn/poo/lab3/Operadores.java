package ec.edu.epn.poo.lab3;
 
public class Operadores {
    public static void main(String[] args) {
        int i = 5;
        int j = i++ + 2;
        byte b = 10;
        b += 300;
        String s1 = "POO";
        String s2 = new String("POO");
        String vacio = null;
 
        System.out.println("1) 17 / 5         = " + (17 / 5));
        System.out.println("2) 17 % 5         = " + (17 % 5));
        System.out.println("3) 17 / 5.0       = " + (17 / 5.0));
        System.out.println("4) j, i           = " + j + ", " + i);
        System.out.println("5) b += 300       = " + b);
        System.out.println("6) s1 == s2       = " + (s1 == s2));
        System.out.println("7) s1.equals(s2)  = " + s1.equals(s2));
        System.out.println("8) cortocircuito  = "
                + (vacio != null & vacio.length() > 0));
        System.out.println("9) 2 + 3 + \"x\" + 2 + 3 = " + (2 + 3 + "x" + 2 + 3));
    }
}
