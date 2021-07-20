import java.util.Scanner;

public class Ejemplo_Scanner_RadioString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // crea un objeto

		String nombre;

		double radio;

		int n;

		System.out.println("Introduzca su nombre:");

		nombre = sc.nextLine();

		System.out.println("Hola " + nombre + "!!!");

		System.out.println("Introduzca el radio:"); // con comas

		radio = sc.nextDouble();

		System.out.println("La circunferencia es: " + 2 * 3.1416 * radio);

		System.out.println("Introduzca un entero:");

		n = sc.nextInt();

		System.out.println("El cuadrado de n es: " + n * n);

		sc.close();
	}

}
