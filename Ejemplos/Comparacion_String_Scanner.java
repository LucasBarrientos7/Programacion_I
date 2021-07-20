import java.util.Scanner;

public class Comparacion_String_Scanner {

	public static void main(String[] args) {

		// Abre el teclado
		Scanner scn = new Scanner (System.in);

		System.out.println("Ingrese el primer nombre"); // Imprime un mensaje en pantalla
		String nombre1;									// Crea una variable
		nombre1 = scn.nextLine();						// Guarda la primera palabra en una variable

		System.out.println("Ingrese el segundo nombre");
		String nombre2;
		nombre2 = scn.nextLine();

		//Compara las 2 palabras
		if (nombre1.contentEquals(nombre2));
		System.out.println("Los nombres son iguales");

		// Cierra el teclado
		scn.close();
	}
}
