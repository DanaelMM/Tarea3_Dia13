package primer_Proyecto;

import java.util.Scanner;

public class Entero {
	
	//Vamos a calcular el producto de 3 enteros
	
	public static void main(String[] arg) {
		
		Scanner leer = new Scanner(System.in);
				
		System.out.print("anota el numero entero");
		short num1 = (short) leer.nextShort();	
		
		System.out.print("anota el numero entero");
		short num2 = (short) leer.nextShort();	
		
		System.out.print("anota el numero entero");
		short num3 = (short) leer.nextShort();	
		
		int producto = num1 * num2 * num3;
		
		System.out.print("el producto de los 3 enteros es: " + producto);
		
}
}
