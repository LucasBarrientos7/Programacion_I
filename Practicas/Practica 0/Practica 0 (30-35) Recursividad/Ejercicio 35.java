
public class Ejercicio35 {

//	Escribir una función que tome una cadena como par´ametro y devuelva otra sin caracteres repetidos contiguos.

	public static void main(String[] args) {

		System.out.println(quitarRepetidosContiguos("bbaattmmaann"));

	} //Cierre del Main

	/** Ejercicio 35 P0: Quita las letras repetidas contiguas de una palabra */

	static String quitarRepetidosContiguos(String cadena) {
		if (cadena.length() <= 1) {
			return cadena;
		} else {
			if (cadena.charAt(0) == cadena.charAt(1)) {
				return quitarRepetidosContiguos(restoString(cadena));
			} else {
				return cadena.charAt(0) + quitarRepetidosContiguos(restoString(cadena));
			}
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
