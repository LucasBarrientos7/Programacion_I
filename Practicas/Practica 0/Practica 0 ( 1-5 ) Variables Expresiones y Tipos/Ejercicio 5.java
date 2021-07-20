import java.util.Scanner;

public class Ejercicio5 {
	// Escribir un programa que te pregunte por dos números, y a continuación
	// imprima
	// un mensaje del estilo “El promedio es: ” y el valor del promedio de ambos
	// números.

	public static void main(String[] args) {
		int num1 = pedirNumero();
		int num2 = pedirNumero();
		System.out.print("El promedio la suma de " + num1 + " + " + num2 + " es: " + promedio(num1, num2));
	}

	public static int pedirNumero() {
		Scanner pedir = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		return pedir.nextInt();
	}

	public static float promedio(int a, int b) {
		return (a + b) / 2;

	} // Cierre del Main

} // Cierre total del Programa
