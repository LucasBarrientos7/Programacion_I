
public class Ejercicio15 {

	// Escribir un método static boolean esDivisible(int n, int m) que devuelve true
	// si n es divisible por m y false en caso contrario.
	// Probarlo adecuadamente llamándola desde el main.

	public static boolean esDivisible(int n, int m) {

		boolean a;
		if (n % m == 0) {
			a = true;
		} else {
			a = false;
		}
		return a;

	}

	public static void main(String[] args) {
		System.out.println(esDivisible(1, 3));

	}

}
