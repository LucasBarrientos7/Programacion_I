import java.util.Scanner;

public class Ejercicio11 {

	//Escribir un método static int sumatoriaPares(int n) que devuelve la sumatoria de los números pares desde 2 hasta n.


	/** Consola principal */

	public static void main(String[] args) {
		int num = pedirNumero();
		System.out.print ("La suma de los numeros pares desde el número 1 hasta el número " + num +" es de " + sumatoriaPar(num));
}


	/** Funciones */


	// Funcion que abre el teclado para ingresar un numero

	public static int pedirNumero(){
		Scanner pedir = new Scanner (System.in);
		System.out.print("Ingrese un numero: ");
		return pedir.nextInt();
	}


	// Funcion que suma desde el numero 1 hasta un n numero

	public static int sumatoriaPar(int n) {
		int suma = 0;

		for (int i = 1; i<=n; i++) {

			if (i%2==0) {
				suma= suma+i;
			}

		}
		return suma;

	}



}//cierra todo el bloque
