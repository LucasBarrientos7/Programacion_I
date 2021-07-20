import java.util.Scanner;

public class Ejercicio7 {

		// Análogamente al ejercicio anterior, escribir un método static void imprimirPromedio(int a, int b)
		//	que imprima el promedio de los dos parámetros.

	static double imprimirPromedio(double a, double b) {
		return ((a+b)/2);
	}


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		double n1 = teclado.nextInt();

		System.out.println("Ingrese otro numero: ");
		double n2 = teclado.nextInt();

		double n = imprimirPromedio(n1,n2);
		System.out.println("La el promedio de " + n1 + " + " + n2 + " es: " + n);

		teclado.close();
	}

}
