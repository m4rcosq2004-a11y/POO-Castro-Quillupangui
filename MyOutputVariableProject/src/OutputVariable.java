import java.text.*;
import java.util.Locale;

public class OutputVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long numero = 123098;
        double pi = Math.PI;
        String status = "";
        int grade = 8;
        
        MyOutputVariableProjectBackup
        
        System.out.println("Gestion de Formatos para impresion en Pantalla");
        System.out.printf("%d %n",numero);
        System.out.printf("%08d %n",numero);
        System.out.printf("%+d %n",numero);
        Locale.setDefault(Locale.US);
        DecimalFormat formato1 = new DecimalFormat("###,###.##");
        String valorFormateado1 = formato1.format(numero);
        System.out.printf("%s %n",valorFormateado1);
        
        System.out.println("Manejo de operador condicional");
        status = (grade >=7 ) ? "Passed" : "Fail";
        System.out.println(status);
	}

}
