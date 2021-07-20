
public class Ejercicio32 {

//	Escribir un método static void collatz(int n) que toma un natural n e imprime, en líneas
//	separadas, los números de la sucesión.

	public static void main(String[] args) {
		int numero = 10;
		collatz(numero);

	} //Cierre del Main

	/** Funcion Collatz */

	static void collatz(int numero) {
		System.out.println(numero);
		if (numero == 1) {
			return;
		} else if (numero % 2 == 0) {
			collatz(numero / 2);
		} else {
			collatz((3 * numero) + 1);
		}
	}

} //Cierre total del programa
