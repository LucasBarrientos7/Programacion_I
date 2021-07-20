
public class Ejercicio19 {

	//	Una palabra se dice que es "abecedaria" si las letras en la palabra aparecen en orden alfabético.

	public static void main(String[] args) {

		System.out.println(esAbecedaria("abcd"));

	} // Cierre del Main

	/** Verifica si una cadena es abecedaria */

	static boolean esAbecedaria(String s) {

		for (int i = 0; i < s.length() - 2; i++) {
			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

} // Cierre total del programa
