package primer_Proyecto;

public class Calcular {

	public static void main(String[] args) {
	//-16 + 32 / 4 (48 - 7)% 11 (18 + 2) / (17 - 12) 17 - 18 / 6 * 3 + 11% 4
	
	int calculo = -16 + 32 / 4 * (48 - 7)% 11;
	int calculo2 = (18 + 2) / (17 - 12);
	int calculo3 = 17 - 18 / 6 * 3 + 11% 4;
	
	System.out.println( "Calculo de: -16 + 32 / 4 * (48 - 7)% 11 es: " + calculo);
	System.out.println( "Calculo de: (18 + 2) / (17 - 12) es: " + calculo2);
	System.out.println( "Calculo de: 17 - 18 / 6 * 3 + 11% 4 es: " + calculo3);
}
}