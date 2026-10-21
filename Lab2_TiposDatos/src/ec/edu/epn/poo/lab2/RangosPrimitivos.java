package ec.edu.epn.poo.lab2;
 
public class RangosPrimitivos {
    public static void main(String[] args) {
        String e = "%-8s %-5d %-21s %s%n";   // formato de cada fila
        System.out.printf("%-8s %-5s %-21s %s%n",
                "Tipo", "Bits", "Mínimo", "Máximo");
        System.out.printf(e, "byte", Byte.SIZE,
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf(e, "short", Short.SIZE,
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf(e, "int", Integer.SIZE,
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf(e, "long", Long.SIZE,
                Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf(e, "float", Float.SIZE,
                Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf(e, "double", Double.SIZE,
                Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf(e, "char", Character.SIZE,
                (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
    }
}
