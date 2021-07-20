
public class Ejercicio24 {

//	Decimos que una cadena de caracteres es un doblete capicúa si la cadena es la concatenación
//	de dos cadenas capicúas.

	public static void main(String[] args) {

		System.out.println(esDobleteCapicua("battab"));

	} //Cierre del Main

	/** Verifica si en una cadena se encuantran dos capicua */

	public static boolean esDobleteCapicua(String cadena) {
		if( (esCapicua(cadena.substring(0))) && esCapicua(cadena.substring(cadena.length()))  ) {
			return true;
		}
		return false;
	}

	/** Verifica si en una cadena toda la palabra es capicua */

	public static boolean esCapicua(String cadena) {
		String capicua = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			capicua += cadena.charAt(i);
		}

		return capicua.equals(cadena);
	}

} //Cierre total del programa
