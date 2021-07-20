import java.util.Scanner;

public class Ejercicio14 {

	// Escribir un método static int cantCifras(int n) que devuelve la cantidad de
	// cifras de n.
	// Probarlo adecuadamente llamandola desde el main

	public static void main(String[] args) {
		int num = pedirNumero();
		System.out.print("La suma desde el número 1 hasta el número " + num + " es de " + cantCifras(num));
	} // Cierre del Main

	/** Funciones */

	// Funcion que abre el teclado para ingresar un numero

	public static int pedirNumero() {
		Scanner pedir = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		return pedir.nextInt();
	}

	// Funcion que suma desde el numero 1 hasta un n numero

	static int cantCifras(int n) {
		int cont = 1;
		while (n / 10 != 0) {
			cont++;
			n = n / 10;
		}
		return cont;
	}

} // Cierre
