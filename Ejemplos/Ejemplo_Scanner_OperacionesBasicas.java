import java.util.Scanner;

public class Ejemplo_Scanner_OperacionesBasicas {

	static Scanner scan = new Scanner(System.in);

	static int sumar(int a, int b) {
		return a + b;
	}

	static int restar(int a, int b) {
		return a - b;
	}

	static int multiplicar(int a, int b) {
		return a * b;
	}

	static double dividir(int a, int b) {
		return a / b;
	}

	static void calcularOperaciones(int a, int b) {
		System.out.println("La suma es:" + sumar(a, b));
		System.out.println("La resta es:" + restar(a, b));
		System.out.println("La multiplicacion es:" + multiplicar(a, b));
		System.out.println("La division es:" + dividir(a, b));
	}

	static int ingresarNumero() {
		System.out.println("Ingrese un nro");
		return scan.nextInt();
	}

	public static void main(String[] args) {
		int n1, n2;
		n1 = ingresarNumero();
		n2 = ingresarNumero();
		calcularOperaciones(n1, n2);
	}
}
