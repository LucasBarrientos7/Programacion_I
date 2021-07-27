import java.util.Scanner;

public class Funciones_StringChar {

	/** Pide un String en pantalla */

	public static String pedirString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una texto");
		return sc.nextLine();
	}

	/** Revisa si el Caracter esta dentro de una cadena */

	static boolean estaElCaracter(String cadena, char letra) {

		for (int i = 0; i < cadena.length(); i++)
			if (cadena.charAt(i) == letra)
				return true;
		return false;
	}

	/** Ejercicio 20 P0 Verifica si en una cadena toda la palabra es capicua */

	public static boolean esCapicua(String cadena) {
		String capicua = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			capicua += cadena.charAt(i);
		}

		return capicua.equals(cadena);
	}

	/** Ejercicio 24 P0: Verifica si en una cadena se encuantran dos capicua */

	public static boolean esCapicuaDos(String cadena) {
		int i = cadena.length() / 2;
		int j = 1;
		System.out.println(i);
		boolean bandera = true;

		while (i > 0 && bandera) {
			if (cadena.charAt(j - 1) != cadena.charAt(cadena.length() - j)) {
				bandera = false;
			}
			i--;
			j++;
		}
		return bandera;
	}

	/** Ejercicio 24 P0: Verifica si en una cadena se encuantran dos capicua */

	public static boolean esDobleteCapicua(String cadena) {
		if ((esCapicua(cadena.substring(0))) && esCapicua(cadena.substring(cadena.length()))) {
			return true;
		}
		return false;
	}

	/** Ejercicio 19 P0: Verifica si una cadena es abecedaria */

	static boolean esAbecedaria(String s) {

		for (int i = 0; i < s.length() - 2; i++) {
			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	/** Invierte una cadena */

	public static String invertir(String s) {
		String nueva = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			nueva = nueva + s.charAt(i);
		}
		return nueva;
	}

	/** Cuenta la cantidad de apariciones de una letra en una palabra */

	static int cuantasVeces(String S, char c) {
		int cont = 0;
		for (int i = 0; i < S.length(); i++)
			if (S.charAt(i) == c)
				cont++;
		return cont;
	}

	/** Devuelve la letra con mas apariciones de una palabra */

	static char caracterMasRepetido(String S) {
		int cont = 0, maxcont = 0, n;
		char maxchar = '\0', c;
		for (int i = 0; i < S.length(); i++) {
			c = S.charAt(i);
			cont = 0;
			n = cuantasVeces(S, c);
			if (n > maxcont) {
				maxcont = n;
				maxchar = c;
			}
		}
		return maxchar;
	}

	/** Devuelve la letra con mas apariciones de una palabra */

	public static char caracterMasRepetido2(String s) {
		//
		// Completar tirando una excepcion si el String s es vacío
		//
		char masRepetido = s.charAt(0);
		int max = cantidadApariciones(s, s.charAt(0));
		;
		try {
			for (int i = 1; i < s.length(); i++) {
				int cantidad = cantidadApariciones(s, s.charAt(i));
				if (max < cantidad) {
					masRepetido = s.charAt(i);
					max = cantidad;
				}
			}
		} catch (Exception ex) {
			System.out.println("Se produjo un error con el valor ingresado" + ex);
			s = "";
		}
		return masRepetido;
	}

	/**
	 * Esta funcion verifica si una palabra contiene todas sus silabas con letras
	 * dobles e iguales
	 */

	public static boolean esDuodroma(String palabra) {

		if (palabra.length() % 2 != 0) { // Si la longitud d ela palabra es impar devuelve false
			return false;
		}

		for (int i = 0; i < palabra.length(); i = i + 2) {
			if (palabra.charAt(i) != palabra.charAt(i + 1)) { // Recorre la palabra dos en dos verificando
				return false; // que las letras sean iguales
			}

		}
		return true;
	}

	/** Reemplaza una letra de una cadena1 por una cadena2 */

	static String reemplazarLetraPorCadena(String s1, String s2, char c) {
		if (s1.length() == 0) {
			return s1;
		}
		if (s1.charAt(0) == c)
			return s2 + reemplazarLetraPorCadena(resto(s1), s2, c);
		else
			return "" + s1.charAt(0) + reemplazarLetraPorCadena(resto(s1), s2, c);
	}

	/** Elimina la primer letra de una palabra (Usar en recursion) */

	static String resto(String s) {

		String aux = "";
		for (int i = 1; i < s.length(); i++) {
			aux = aux + s.charAt(i);
		}
		return aux;
	}

	/** Revisa si un caracter es una letra es una Vocal */

	public static boolean esVocal(char letra) {
		letra = Character.toLowerCase(letra);
		if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u') || (letra == 'á')
				|| (letra == 'é') || (letra == 'í') || (letra == 'ó') || (letra == 'ú') || (letra == 'ü')) {
			return true;
		}
		return false;
	}

	/** Verifica si una palabra tiene vocales */

	static boolean tieneVocales(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'i')
					|| (palabra.charAt(i) == 'o') || (palabra.charAt(i) == 'u')) {
				return true;
			}
		}
		return false;
	}

	/** Duplica las vocales */

	static String duplicarVocal(String s) {
		if (s.length() == 0) {
			return s;
		}
		if (esVocal(s.charAt(0))) {
			return "" + s.charAt(0) + s.charAt(0) + duplicarVocal(resto(s));
		} else {
			return "" + s.charAt(0) + duplicarVocal(resto(s));
		}
	}

	/** Ejercicio 18 P0: Cuenta la cantidad de vocales de una palabra */

	static int cantidadVocales(String palabra) {
		int contador = 0;
		contador = contador + cantidadApariciones(palabra, 'a') + cantidadApariciones(palabra, 'e')
				+ cantidadApariciones(palabra, 'i') + cantidadApariciones(palabra, 'o')
				+ cantidadApariciones(palabra, 'u');
		return contador;

	}

	/**  */

	static String quitarElPatron(String s, String p) {
		if (s.length() < p.length()) {
			return s;
		}

		if (s.length() == 0)
			return s;
		else {
			if (s.substring(0, p.length()).equals(p)) {
				return quitarElPatron(s.substring(p.length(), s.length()), p);
			} else {
				return s.charAt(0) + quitarElPatron(resto(s), p);
			}
		}
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

	/** Devuelve un booleano si todas las letras de una palabra son "e" */

	static boolean todasE(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != 'e' && cadena.charAt(i) != 'E') {
				return false;
			}
		}
		return true;
	}

	/** Verifica si dos palabras son iguales */

	static boolean sonIguales(String cadena1, String cadena2) {
		if (cadena1.contentEquals(cadena2)) {
			return true;
		}
		return false;
	}

	/** Toma una palabra y devuelve la palabra con espacio entre las letras */

	public static String espaciado(String palabra) {
		if (palabra.length() <= 1) {
			return palabra;
		} else {
			return palabra.charAt(0) + " " + espaciado(resto(palabra));
		}
	}

	/** Recursividad con posiciones impares */

	public static String restoimpar(String s) {
		String salida = "";
		int i = 1;
		while (i < s.length()) {
			salida += s.charAt(i);
			i++;
		}
		return salida;
	}

	/** Función que solo devuelve las posiciones impares de una palabra */

	public static String substringimpares(String s) {
		if (s.length() <= 1)
			return "";

		String salida = resto(s);
		return salida.charAt(0) + substringimpares(restoimpar(salida));
	}

	/** Indica en que posicion se encuenta una letra en una cadena */

	static int indiceDe(String cadena, char letra) {
		if (cadena.isEmpty()) {
			return -1;
		} else {
			if (cadena.charAt(0) == letra) {
				return 0;
			} else {
				return 1 + indiceDe(resto(cadena), letra);
			}
		}
	}

	/** Codigo Ascii es el valor numerico de cada char */

	static void mostrarAscii(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println((cadena.charAt(i) + " : " + (cadena.charAt(i) * 1)));
		}
	}

	/** Quitar acentos de una palabra */

	static String quitarAcentos(String cadena) {
		String nueva = "";
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'á') {
				nueva = nueva + 'a';
			} else if (cadena.charAt(i) == 'é') {
				nueva = nueva + 'e';
			} else if (cadena.charAt(i) == 'í') {
				nueva = nueva + 'i';
			} else if (cadena.charAt(i) == 'ó') {
				nueva = nueva + 'o';
			} else if (cadena.charAt(i) == 'ú') {
				nueva = nueva + 'u';
			} else {
				nueva = nueva + cadena.charAt(i);
			}
		}
		return nueva;
	}

////////////////////////////////////////////////////////////////////////

	/** Devuelve una cadena sin letras repetidas */

	public static String sinRepetidos(String s) {
		String nuevaCadena = "";
		for (int i = 0; i < s.length(); i++) {
			if (cantidadApariciones(s, s.charAt(i))<2) {
				
				nuevaCadena = nuevaCadena + s.charAt(i);
			}
		}
		return nuevaCadena;
	}
	
////////'e'/////////////////////////////// M A I N ///////////////////////////////////////

	public static void main(String[] args) {

		System.out.println(sinRepetidos("bbaajjaa"));
	}

} // Cierre total del Programa
