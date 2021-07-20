
public class Ejercicio30 {

//	Escribir las versiones recursivas de los siguientes métodos de la Sección 3:
//		a) sumatoria: static int sumatoriaRec(int n)
//		b) sumatoriaPares: static int sumatoriaParesRec(int n)
//		c) potencia: static int potenciaRec(double x, int n)
//		d) factorial: static int factorialRec(int n)

	public static void main(String[] args) {

		System.out.println("Sumatoria: " + sumatoriaRec(4));
		System.out.println("Sumatoria de pares: " + sumatoriaParesRec(4));
		System.out.println("Potencia: " + potenciaRec(4, 2));
		System.out.println("Factorial: " + factorialRec(4));

	} // Cierre del Main

	/** Sumatoria */

	static int sumatoriaRec(int numero) {
		if (numero == 0) {
			return 0;
		} else {
			return numero + sumatoriaRec(numero - 1);
		}
	}

	/** Sumatoria de pares */

	static int sumatoriaParesRec(int numero) {
		if (numero == 0) {
			return 0;
		} else {
			if (numero% 2 == 0) {
				return numero + sumatoriaParesRec(numero - 2);
			} else {
				return numero;
			}
		}
	}

	/** Potencia */

	static int potenciaRec(int base, int exponente) {
		if (exponente == 0) {
			return 1;
		} else {
			return base * potenciaRec(base, exponente - 1);
		}
	}

	/** Factorial */

	static int factorialRec(int numero) {
		if (numero == 1) {
			return 1;
		} else {
			return numero*factorialRec(numero-1);
		}
	}


} // Cierre total del programa
