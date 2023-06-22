package primer_Proyecto;

import java.util.Scanner;

public class DivideNumeros {

	public static void main(String[] arg) {
		
		Scanner escribe = new Scanner(System.in);
		
		int numero = 17;
		int numero2 = 3;
		
		double result_ejemplo = (double)  17/3;
		
		int cociente_ejemplo = 17/3;
		
		int ejem_resto = numero % numero2;
		
		
		System.out.println("Resultado de la división (17/3) = " + result_ejemplo);
		System.out.println(" el cociente es: " + cociente_ejemplo);
		System.out.println(" el resto es: " + ejem_resto);
		
		System.out.print("Anota un numero para dividir): ");
		short num1 = (short) escribe.nextShort();	
		
		System.out.print("Anota un divisor: ");
		short num2= (short) escribe.nextShort();
		
		double respreal = (double)  num1/num2;
		int cociente = num1/num2;
		int resto = num1 % num2;
		
		 System.out.println("Cociente: " + cociente);
	     System.out.println("Resto de la separacion: " + resto);
	     System.out.println("Respuesta Real: " + respreal);
		
	}
}