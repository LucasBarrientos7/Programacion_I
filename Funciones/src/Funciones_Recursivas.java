
public class Funciones_Recursivas {

	/** Imprime números hasta llegar al 1 */

	public static void imprimirHasta(int numero) {
		if (numero == 1) {
			System.out.println(1);
		} else {
			System.out.println(numero);
			imprimirDesde(numero - 1);
		}
	}
	
	/** Imprime por pantalla los nÃºmeros entre 1 y n (en orden descendente) */
	
	public static void imprimirDesde(int numero) {
		if (numero == 1)
			System.out.println(1);
		else {
			System.out.println(numero);
			imprimirDesde(numero - 1);
		}
	}

	/** Devuelve la suma de cuadrados desde el 1 hasta el numero elegido */

	public static int sumaDeCuadradosHasta(int numero) {
		if (numero == 1) {
			return 1;
		} else {
			return numero * numero + sumaDeCuadradosHasta(numero - 1);
		}
	}
	
	/** Ejercicio 30 P0: Sumatoria */

	public static int sumatoriaRec(int numero) {
		if (numero == 0) {
			return 0;
		} else {
			return numero + sumatoriaRec(numero-1);
		}
	}
	
		/** Ejercicio 30 P0: Sumatoria de pares */

	public static int sumatoriaParesRec(int numero) {
		if (numero == 0) {
			return 0;
		} else {
			if (esPar(numero)) {
				return numero + sumatoriaParesRec(numero - 2);
			} else {
				return numero;
			}
		}
	}
	
	/** Ejercicio 30 P0: Potencia */

	public static int potenciaRec(int base, int exponente) {
		if (exponente == 0) {
			return 1;
		} else {
			return base * potenciaRec(base, exponente - 1);
		}
	}
	
	/** Ejercicio 30 P0: Factorial */
	
	public static int factorialRec(int numero) {
		if (numero == 1) {
			return 1;
		} else {
			return numero*factorialRec(numero-1);
		}
	}
	
	/** Ejercicio 31 P0: Funcion que devuelve el fibonacci de un numero */

	public static int fibonacci(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		} else {
			return fibonacci(numero - 1) + fibonacci(numero - 2);
		}
	}
	
	/** Ejercicio 31 P0: Funcion que devuelve el fibonacci de un numero (2da forma) */
	
	public static int fibRec (int n) {
		return n<2? n: fibRec(n-1)+ fibRec(n-2);
	}

	/** Suma dos numeros hasta que el valor del segundo numero llegue a 1 */

	public static int sumaEntre(int numero1, int numero2) {
		if (numero1 == numero2) {
			return numero1;
		} else {
			return numero2 + sumaEntre(numero1, numero2 - 1);
		}
	}

	/** Cuenta los numeros primos que hay entre 2 numeros */

	public static int cantPrimosEntre(int numero1, int numero2) {
		if (numero1 == numero2) {
			if (esPrimo(numero1)) {
				return 1;
			} else {
				return 0; // si no es primo, no contaria al final del recorrido
			}
		} else {
			if (esPrimo(numero1)) {
				return 1 + cantPrimosEntre(numero1 + 1, numero2); // Va contando durante el recorrido
			} else {
				return 1 + cantPrimosEntre(numero1 + 1, numero2); // Si no es primo, sigue ejecutando
			}
		}
	}

	/** Determina si un numero es par usando recursión */

	public static boolean esPar(int numero) {
		if (numero == 0) {
			return true;
		}
		if (numero == 1) {
			return false;
		}
		return esPar(numero - 2);
	}

	/** Devuelve la longitud de una cadena utilizando recursión */

	public static int longitud(String cadena) {
		if (cadena.equals("")) {
			return 0;
		} else {
			return longitud(restoString(cadena));
		}
	}

	/** Imprime una palabra con espacio entre sus letras */

	public static void imprimirEspaciado(String cadena) {
		if (cadena.length() == 0) {
			System.out.print(cadena);
			;
		}
		System.out.print(cadena.charAt(0) + " ");
		imprimirEspaciado(restoString(cadena));
	}

	/** Indica el valor maximo de un arreglo usando recursion */

	public static int[] maximo(int[] arreglo) {
		if (arreglo.length == 1) {
			return arreglo;
		}
		if (arreglo[0] > arreglo[1]) {
			arreglo[1] = arreglo[0];
		}
		return maximo(restoarreglo(arreglo));
	}

	/** Devuelve el elemento mas alto de un arreglo */

	public static int maximoDesde(int[] arreglo, int pos) {
		if (pos == arreglo.length - 1) {
			return arreglo[pos];
		}
		if (arreglo[pos] > maximoDesde(arreglo, pos + 1)) {
			return arreglo[pos];
		} else {
			return maximoDesde(arreglo, pos + 1);
		}
	}

	/**
	 * Devuelve el elemento mas alto de un arreglo desde una posicion hasta otra
	 * posicion
	 */

	public static int maximoDesdeHasta(int[] arreglo, int pos1, int pos2) {
		if (pos1 == pos2) {
			return arreglo[pos1];
		}
		if (arreglo[pos1] > maximoDesdeHasta(arreglo, pos1 + 1, pos2)) {
			return arreglo[pos1];
		} else {
			return maximoDesdeHasta(arreglo, pos1 + 1, pos2);
		}
	}

	/** Retorna la cantidad de divisores de un numero */

	public static int cantidadDivisores(int numero) {
		return cantidadDivDesde(numero, 1);
	}

	/**
	 * Retorna la cantidad de divisores de un numero desde un numero hasta otro
	 * numero
	 */

	public static int cantidadDivDesde(int numero1, int numero2) {
		if (numero1 == numero2) {
			return 1;
		}
		if (numero1 % numero2 == 0) {
			return 1 + cantidadDivDesde(numero1, numero2 + 1);
		} else {
			return 0 + cantidadDivDesde(numero1, numero2 + 1);
		}
	}

	/** Decimal a binario */

	public static String decimalABinario(int n) {
		if (n < 2) {
			return "" + n;
		} else {
			return "" + decimalABinario(n / 2) + (n % 2);
		}
	}

	/** Torre de Hanoi */

	public static void hanoi(int n, char origen, char temporal, char destino) {
		if (n == 1) {
			System.out.println("Mover disco " + n + " desde " + origen + " a " + destino);
		} else {
			hanoi(n - 1, origen, destino, temporal);
			System.out.println("Mover disco " + n + " desde " + origen + " a " + destino);
			hanoi(n - 1, temporal, origen, destino);
		}
	}

	/** Ejercicio 32 P0: Funcion Collatz */

	public static void collatz(int numero) {
		System.out.println(numero);
		if (numero == 1) {
			return;
		} else if (numero % 2 == 0) {
			collatz(numero / 2);
		} else {
			collatz((3 * numero) + 1);
		}
	}

	/** Ejercicio 33 P0: Denomina el maximo comun divisor entre 2 numeros */

	public static int maximoComunDivisor(int numero1, int numero2) {
		if (numero2 == 0) {
			return numero1;
		}
		return (maximoComunDivisor(numero2, numero1 % numero2));
	}

	/** Ejercicio 34 P0: Intercala un asterisco entre letra y letra */

	public static String intercalarAsterisco(String cadena) {
		if (cadena.equals("")) {
			return cadena;
		}
		if (cadena.length() == 1) {
			return cadena;
		} else {
			return cadena.charAt(0) + "*" + intercalarAsterisco(restoString(cadena));
		}
	}

	/** Ejercicio 35 P0: Quita las letras repetidas contiguas de una palabra */

	public static String quitarRepetidosContiguos(String cadena) {
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

	/**
	 * Funcion que repite las consonantes seguida de otra consonante y repite las
	 * vocales seguidas de otra vocal
	 */

	public static String repetirLetras1(String cadena) {
		if (cadena.length() <= 1) {
			return cadena;
		}
		if (esVocal(cadena.charAt(0)) && esVocal(cadena.charAt(1))) {
			return "" + cadena.charAt(0) + cadena.charAt(0) + repetirLetras(restoString(cadena));
		}
		if (!esVocal(cadena.charAt(0)) && !esVocal(cadena.charAt(1))&& Character.isLetter(0)&&Character.isLetter(1)) {
			return "" + cadena.charAt(0) + cadena.charAt(0) + cadena.charAt(0) + repetirLetras(restoString(cadena));
		} else {
			return "" + cadena.charAt(0) + repetirLetras(restoString(cadena));
		}
	}
	
	/** Toma una palabra y devuelve esapalabra concatenada a la misma palabra inversa */
	
	public static String espejar(String cadena) {
		if (cadena.isEmpty()) {
			return cadena;
		} else {
			return cadena.charAt(0)+ espejar(restoString(cadena))+ cadena.charAt(0);
		}
	}
	
	/** Parcial 1er semestre 2018 Punto 2: en un string ordenado alfabeticamente, insertar un char donde corresponda */
	
	public static String insertarOrdenado(String s, char a) {
		if (s.isEmpty()) {
			return "" + a;
		} else {
			if (s.charAt(0)<a) { // TRUE: A ES MENOR A E
				return s.charAt(0) + insertarOrdenado(restoString(s), a)  ;
			} else {
				return "" + a + s;
			}
		}
	}
	
	/** Parcial 1er semestre 2020 Punto 2: Devuelve las posiciones impares */
	
	public static String subStringImpares(String s) {
		if (s.isEmpty() || s.length()==1) {
			return "";
		} else { 
			return s.charAt(1) + subStringImpares(restoString(restoString(s))); //toma la posicion impar
		}
	}

	/** Parcial 6: devuelve las 10 ultimas letras de una palabra */
	
	public static String recortarA10(String s) {
		if(s.isEmpty() /* || s.length()==0 */){
			return "Esta vacía";
		}
		if (s.length()==10) {
			return s;
		}
		if (s.length()<10) {
			return recortarA10(s.charAt(0)+s);
		} else {
			return recortarA10(restoString(s));
		}
	}
	
	/** Parcial 2do semestre 2019 TM: agrupa las consonantes adelante y las vocales atrás */
	
	public static String separarVocales(String s) {
		if(s.isEmpty()) {
			return "";
		} else {
			if (esVocal(s.charAt(0))) {
				return separarVocales(restoString(s)) + s.charAt(0);
			} else {
				return s.charAt(0) + separarVocales(restoString(s));
			}
		}
	}
	
	/** Parcial 2do semestre 2019 TN: Elimina las vocales e invierte el string restante */
	
	public static String eliminarVocalesYRevertir(String s) {
		if(s.isEmpty()) {
			return "";
		} else {
			if (esVocal(s.charAt(0))) {
				return eliminarVocalesYRevertir(restoString(s));
			} else {
				return eliminarVocalesYRevertir(restoString(s)) + s.charAt(0);
			}
		}
	}
	
	/** Recuperatorio 1er semestre 2020 TT: Remplaza las vocales del string s por el char c */
	
	public static String cambiarVocales(String s, char c) {
		if(s.isEmpty()) {
			return "";
		} else {
			if (esVocal(s.charAt(0))) {
				return c + cambiarVocales(restoString(s), c);
			} else {
				return s.charAt(0) + cambiarVocales(restoString(s), c);
			}
		}
	}
	
	/** Simulacro de Parcial: Remplaza las vocales del string s por el char c */
	
	public static String repetirLetras(String s) {
		if (s.length()<=1) {
			return s;
		}
		if (esVocal(s.charAt(0)) && esVocal(s.charAt(1))){
			return "" + s.charAt(0) + s.charAt(0) + repetirLetras(resto(s));
		}
		if (!esVocal(s.charAt(0)) && !esVocal(s.charAt(1))) {
			return "" + s.charAt(0) + s.charAt(0) + s.charAt(0) + repetirLetras(resto(s));
		} else {
			return "" + s.charAt(0) + repetirLetras(resto(s));
		}
	}
	
	/** Parcial 2do Semestre 2020: si se encuentran dos letras juntas las invierte */
	
	public static String invertirLetras(String s, char a, char b) {
		if (s.length() < 2) {
			return s;
		}
		if (s.charAt(0) == a && s.charAt(1)== b) {
			return "" + s.charAt(1) + s.charAt(0) + invertirLetras(resto(resto(s)), a, b);
		} else {
			return s.charAt(0) + invertirLetras(resto(s), a, b);
		}
	}
	
/////////////////////////////////////// FUNCIONES AUXILIARES ///////////////////////////////////////

	/** Elimina la primera letra de una cadena */
	
	static String resto(String s) {
		String aux = "";
		for (int i = 1; i < s.length(); i++) {
			aux = aux + s.charAt(i);
		}
		return aux;
	}
	
	/** Elimina la primera letra de una cadena */

	static String restoString(String cadena) {
		String nuevo = "";
		for (int i = 1; i < cadena.length(); i++) {
			nuevo += cadena.charAt(i);
		}
		return nuevo;
	}

	/** Elimina el primer elemento de un arreglo */

	static int[] restoarreglo(int[] arreglo) {
		int[] nuevoarreglo = new int[arreglo.length - 1];
		for (int i = 1; i < arreglo.length; i++) {
			nuevoarreglo[i - 1] = arreglo[i];
		}
		return nuevoarreglo;
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

	/** Indica si un numero es primo */

	static boolean esPrimo(int numero) {
		return cantDivisores(numero) == 2;
	}

	/** Revisa si un caracter es una letra es una Vocal */

	public static boolean esVocal(char letra) {
		letra = Character.toLowerCase(letra);
		if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')
			|| (letra == 'á') || (letra == 'é') || (letra == 'í') || (letra == 'ó') || (letra == 'ú') || (letra == 'ü')) {
			return true;
		}
		return false;
	}

////////////////////////////////////////////// M A I N //////////////////////////////////////////////

	public static void main(String[] args) {
		System.out.println(repetirLetras("bcd"));
//		System.out.println('a'<'e');
	}

} // Cierre total del Programa
