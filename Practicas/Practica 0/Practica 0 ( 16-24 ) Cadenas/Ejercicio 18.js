
public class Ejercicio18 {

	// Escribir un método static int cantidadVocales(String s) que dada una cadena que contiene
	// sólo letras minúsculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
	// utilizar el método definida en el ejercicio anterior.

	public static void main(String[] args) {

		System.out.println(cantidadVocales("batman"));
	}

	/** Cuenta la cantidad de vocales de una palabra */

	static int cantidadVocales(String palabra) {
		int contador = 0;
		contador = contador + cantidadApariciones(palabra, 'a') + cantidadApariciones(palabra, 'e')
				+ cantidadApariciones(palabra, 'i') + cantidadApariciones(palabra, 'o')
				+ cantidadApariciones(palabra, 'u');
		return contador;

	}

	/** Cuenta la cantidad de apariciones de una letra */

	public static int cantidadApariciones(String s, char c) {
		int cantidad = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				cantidad++;
		}
		return cantidad;
	}
}
