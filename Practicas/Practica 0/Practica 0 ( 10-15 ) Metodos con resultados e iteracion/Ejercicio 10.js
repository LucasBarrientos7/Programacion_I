import java.util.Scanner;

public class Ejercicio10 {
	//Escribir un método static int sumatoria(int n) que devuelve la sumatoria de los números desde 1 hasta n.


	/** Consola principal */

	public static void main(String[] args) {
		int num2 = pedirNumero();
		System.out.print ("La suma desde el número 1 hasta el número " + num2 +" es de " + sumatoria(num2));
}


	/** Funciones */


	// Funcion que abre el teclado para ingresar un numero

	public static int pedirNumero(){
		Scanner pedir = new Scanner (System.in);
		System.out.print("Ingrese un numero: ");
		return pedir.nextInt();
	}


	// Funcion que suma desde el numero 1 hasta un n numero

		public static int sumatoria(int n){
			int suma = 0;

			for (int i = 1; i<=n; i++){
				suma= suma+i;
			}
		return suma;
		}

} //cierra todo el bloque
