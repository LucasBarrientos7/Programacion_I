import java.util.Scanner;
import java.lang.Math;
public class Ejercicio12 {

	//Escribir un método static double potencia(double x, int a) que toma un número racional x y un entero a y calcula X elevado a la a.

	/**Consola principal */

	public static void main(String[] args) {
		int x = pedirNumero();
		int a = pedirNumero();
		System.out.println("La potencia de " + x  + " elavado a la " + a + " es " + potencia(x, a));

	}

	// Funciones

	public static int pedirNumero(){
	Scanner pedir = new Scanner (System.in);
	System.out.print("Ingrese un numero: ");
	return pedir.nextInt();
	}

	public static int potencia(int a, int x) {

		int potencia = (int) Math.pow(a,x);
		return potencia;

	}

}// Cierra todo
