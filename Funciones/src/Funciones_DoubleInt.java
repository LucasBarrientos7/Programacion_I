import java.lang.Math;
import java.util.Scanner;

public class Funciones_DoubleInt {

	/** Mediante Scanner pide un numero por pantalla */

	public static int pedirNumero() {
		Scanner pedir = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		return pedir.nextInt();
	}

	/** Verifica si un numero es par */
	
	public static boolean esPar(int n) {
		return n%2==0;
	}
	
	/** Suma dos numeros */

	static int suma(int a, int b) {
		return a + b;
	}

	/** Suma tres numeros */

	static int dobleSuma(int a, int b, int c) {
		int d = suma(a, b);
		int e = suma(c, d);
		return e;
	}

	/** Resta dos numeros */

	static int restar(int a, int b) {
		return a - b;
	}

	/** Multiplica dos numeros */

	static int multiplicar(int a, int b) {
		return a * b;
	}

	/** Divide dos numeros */

	static double dividir(int a, int b) {
		return a / b;
	}

	/** Hace la suma desde el numero 0 hasta el numero elegido */

	public static int sumatoria(int n) {
		int suma = 0;

		for (int i = 1; i <= n; i++) {
			suma = suma + i;
		}
		return suma;
	}

	/** Devuelve el valor booleano si un numero es divisible por otro */

	public static boolean esDivisible(int n, int m) {

		boolean a;
		if (n % m == 0) {
			a = true;
		} else {
			a = false;
		}
		return a;
	}

	/** Devuelve una cantidad de divisores */

	static int cantDivisores(int numero) {
		int cantidad = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	/** Verifica si un numero es primo */
	
	static boolean primo(int n){
		int cont=0;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
				cont++;
		}
		return (cont==0);
	}

	/** Indica si un numero es primo */

	static boolean esPrimo(int numero) {
		return cantDivisores(numero) == 2;
	}

	/** Indica el siguiente de un numero primo */

	static int siguientePrimo(int numero) {
		int n = numero + 1;
		while (!esPrimo(numero)) {
			numero++;
		}
		return numero;
	}
	
	/** Indica el anterior de un numero primo */
	
	static int primoAnterior(int numero){
		int i=numero-1;
		while (!esPrimo(i))
			i--;
		return i;
	}

	/** Suma los numeros pares desde el 0 hasta el numero elegido */

	public static int sumatoriaPar(int n) {

		int suma = 0;
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				suma = suma + i;
			}
		}
		return suma;
	}

	/** Devuelve la potencia de un numero elevado a otro numero */

	public static int potencia(int a, int x) {

		int potencia = (int) Math.pow(a, x);
		return potencia;
	}

	/** Devuelve el promedio entre dos numeros */

	static double promedio(double a, double b) {
		return ((a + b) / 2);
	}

	/** Dividir con Excepciones */

	public static double dividir(double a, double b) {
		if (a == 0 && b == 0) {
			throw new UnsupportedOperationException("Division indeterminada");
		}
		if (b == 0) {
			throw new ArithmeticException("El dividendo no puede ser cero");
		}
		double c = a / b;
		return c;
	}
	
	/** Suma los cuadrados desde el 1 hasta el numero elegido */
	
	static int sumaDeCuadrados(int n){
		int suma=0;
		for (int i=0;i<=n;i++){
			suma +=i*i;
			suma=suma+i*i;
		}
		
		return suma;
	}
	
	/** Ejercicio 13 P0: Cuenta la cantidad de cifras de un numero */
	
	static int cantCifras(int n){
		int cont=1;
		while (n/10 != 0){
			cont++;
			n=n/10;
		}
		return cont;
	}
	
/** Funcion McCarthy (un numero menor a 100 siempre da 91) */
	
	static int mcCarthy(int numero) {
		if (numero>100) {
			return numero -10;
		} else {
			return mcCarthy(mcCarthy(numero + 11));
		}
	}

/////////////////////////////////////// M A I N ///////////////////////////////////////

	public static void main(String[] args) {

		System.out.println(siguientePrimo(6));
	}

} // Cierre del Programa
