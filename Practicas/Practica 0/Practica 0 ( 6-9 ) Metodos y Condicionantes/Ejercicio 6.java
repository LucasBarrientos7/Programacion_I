import java.util.Scanner;
public class Ejercicio6 {

		// Escribir un método static void imprimirSuma(int a, int b) que al igual que el ejercicio 3 imprima
		//	la suma de los dos parámetros. Modificar el programa de dicho ejercicio para que utilice este método.

	static int imprimirSuma(int a, int b) {
		return a+b;
	}


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		int n1 = teclado.nextInt();

		System.out.println("Ingrese otro numero: ");
		int n2 = teclado.nextInt();

		int n = imprimirSuma(n1,n2);
		System.out.println("La suma de " + n1 + " + " + n2 + " es: " + n);

		teclado.close();
	}

}
