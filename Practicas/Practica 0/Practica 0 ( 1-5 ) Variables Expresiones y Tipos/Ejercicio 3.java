import java.util.Scanner;

public class Ejercicio3 {
	// Escribir un programa que te pregunte por dos números, y a continuación
	// imprima
	// un mensaje del estilo “La suma es: ” y el valor de la suma de ambos números.

	public static void main(String[] args) {
		int num1 = pedirNumero();
		int num2 = pedirNumero();
		System.out.print("La suma de " + num1 + " + " + num2 + " es: " + suma(num1, num2));
	}

	/** Pide un numero por pantalla */

	public static int pedirNumero() {
		Scanner pedir = new Scanner(System.in); 	// Se llama al contructor del objeto y se le asigna una variable
		System.out.print("Ingrese un numero: ");	// Imprime en pantalla y abre el teclado
		return pedir.nextInt();		// La variable toma lo que se ingresó por teclado
	}

	/** Suma entre 2 numeros */

	public static int suma(int a, int b) {
		return a + b;

	} // Cierre del Main

} // Cierre total del Programa
