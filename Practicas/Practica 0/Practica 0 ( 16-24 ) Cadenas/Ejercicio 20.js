
public class Ejercicio20 {

//	Escribir el método static boolean esCapicua(String s) que dada una cadena, devuelve true
//	si la cadena es igual de atrás hacia adelante o de adelante hacia atrás. En caso contrario, devuelve
//	false.
//
	public static void main(String[] args) {

		System.out.println(esCapicua("battab"));

	} // Cierre del Main

	/** Verifica si en una cadena toda la palabra es capicua */

	public static boolean esCapicua(String cadena) {
		String capicua = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			capicua += cadena.charAt(i);
		}
		return capicua.equals(cadena);
	}

} // Cierre total del programa
