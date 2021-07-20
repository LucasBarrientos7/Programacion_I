
public class Ejercicio34 {

//	Escribir una función que tome una cadena como parámetro y la imprima por consola intercalando un  ’∗’ entre cada letra.

	public static void main(String[] args) {

		System.out.println(intercalarAsterisco("Batman"));

	} //Cierre del Main

	/** Ejercicio 34 P0: Intercala un asterisco entre letra y letra */

	static String intercalarAsterisco(String cadena) {
		if (cadena.equals("")) {
			return cadena;
		}
		if (cadena.length() == 1) {
			return cadena;
		} else {
			return cadena.charAt(0) + "*" + intercalarAsterisco(restoString(cadena));
		}
	}

	/** Elimina la primera letra de una cadena */

	static String restoString(String cadena) {
		String nuevo = "";
		for (int i = 1; i < cadena.length(); i++) {
			nuevo += cadena.charAt(i);
		}
		return nuevo;
	}

} //Cierre total del programa
