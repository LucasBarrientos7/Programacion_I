import java.util.Random;

public class FuncionesArreglos {

	/** Imprime en pantalla un arreglo */

	static void mostrarArreglo(int[] arreglo) {

		int i;
		System.out.print("[");
		for (i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		}
		System.out.println("]");
	}

	/** Imprime en pantalla un arreglo */

	static void mostrarArreglo2(int arreglo[]) {
		System.out.print("[ ");
		for (int i = 0; i < arreglo.length - 1; i++) {
			System.out.print(arreglo[i] + " , ");
		}
		System.out.print(arreglo[arreglo.length - 1]);

		System.out.println(" ] ");
	}

	/** Imprime en pantalla los elementos del arreglo */

	static void imprimir(int[] arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		}
		System.out.println("]");
	}

	/** ?????????????????????????????????????????????????????? */

	static int[] rango(int n, int m) {

		if (m < n) {
			return new int[0];
		}
		int i; // ?????????????????????????????????????????????????
		int[] a = new int[m - n + 1];
		for (i = 0; i < a.length; i++) {
			a[i] = n + i;
		}
		return a;
	}

	/** Ejercicio 28 P0: Revisa si los elementos de un arreglo estan ordenados */

	public static boolean estaOrdenado(int[] arreglo) {
		boolean resultado = true;
		int i = 0;
		while (resultado && i < arreglo.length - 1) {
			if (arreglo[i] > arreglo[i + 1]) {
				resultado = false;
			}
			i++;
		}
		return resultado;
	}

	/** Revisa si los elementos de un arreglo estan ordenados */

	static boolean estaOrdenado2(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i]) {
				return false;
			}
		}
		return true;
	}

	/** Revisa si los elementos de un arreglo estan ordenados */

	static boolean estaOrdenado3(int[] a) {
		boolean ordenado = true;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i]) {
				ordenado = false;
			}
		}
		return ordenado;
	}

	/** Ejercicio 29 P0: Devuelve el promedio del arreglo */

	public static int promedio(int[] arreglo) {
		int suma = 0;
		for (int i = 0; i < arreglo.length; i++) {
			suma += arreglo[i];
		}
		return (suma / arreglo.length);
	}

	/** Agrega un elemento al final del arreglo */

	public static int[] agregarAtras(int[] arreglo, int num) {
		int[] nuevoarreglo = new int[arreglo.length + 1];
		for (int i = 0; i < arreglo.length; i++) {
			nuevoarreglo[i] = arreglo[i];
		}
		nuevoarreglo[nuevoarreglo.length - 1] = num;
		return nuevoarreglo;
	}

	/** Quita un elemento del arreglo */

	public static int[] quitar(int[] arreglo, int posicion) {
		int[] nuevoarreglo = new int[arreglo.length - 1];
		for (int i = 0; i < posicion; i++) {
			nuevoarreglo[i] = arreglo[i];
		}
		for (int i = posicion + 1; i < arreglo.length; i++) {
			nuevoarreglo[i - 1] = arreglo[i];
		}
		return nuevoarreglo;
	}

	/** Cambia de signo a los elementos de un arreglo */

	public static void oponer(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = arreglo[i] * (-1);
		}
	}

	/**
	 * Determina si cada uno de los elementos de un arreglo son divisores de un
	 * numero
	 */

	public static boolean sonTodosDivisores(int[] arreglo, int num) {
		for (int i = 0; i < arreglo.length; i++) {
			if (num % arreglo[i] != 0) {
				return false;
			}
		}
		return true;
	}
	
	/** Devuelve cuántas veces aparece el elemento ubicado en pos dentro del arreglo */
	
	static int cuantasVeces(int[ ] vec, int pos) {
	      int cont=0;
	      for (int i=0; i<vec.length; i++ )
	            if (vec[i] == vec[pos])
	                 cont++;
	      return cont;
	 }
	
	/** Devuelve un arreglo pero sin duplicados */

	static int [] eliminaDuplicados(int[ ] vec) {
	      int[] aux = new int[vec.length];
	      int j=0;
	      for (int i=0; i<vec.length; i++ ) {
	            if (cuantasVeces(vec, i)==1) {
	                 aux[j] = vec[i];
	                 j++;
	            }
	      }
	      return aux;
	 }

	/** Crea un Arreglos con elementos de valores random */

	static int[] arregloAzar(int n) {
		Random azar = new Random();
		int[] datos = new int[n];
		for (int i = 0; i < n; i++)
			datos[i] = azar.nextInt(20);
		return datos;
	}

	/** Una funcion que intercala la cantidad de elementos de dos arreglos */

	static int[] combinaArreglos(int[] datos1, int[] datos2, int n) {

		// combina dos arreglos en un tercer arreglo con un numero de cada arreglo
		int[] salida = new int[datos1.length + datos2.length]; // Crea un arreglo de la cantidad de la suma de los
																// elementos de los dos arreglos

		for (int i = 0; i < n; i++) {
			salida[2 * i] = datos1[i]; // Guarda el elemento del arreglo 1 en una posicion del arreglo combinado
			salida[2 * i + 1] = datos2[i]; // Guarda el elemento del arreglo 2 en una posicion del arreglo combinado
		}
		return salida;
	}

	/** Una segunda forma de una funcion que combina elementos de un arreglo */

	static int[] combinaArreglos2(int[] datos1, int[] datos2) {
		// combina dos arreglos en un tercero elemento a elemento
		int k = 0;
		int[] salida = new int[datos1.length + datos2.length];
		for (int i = 0; i < datos1.length; i++) {
			salida[k] = datos1[i];
			salida[k + 1] = datos2[i];
			k = k + 2;
		}
		return salida;
	}

	/** Intercala los elementos de 2 arreglos */

	static int[] intercalar(int[] a, int[] b) {
		int nuevo[] = new int[a.length + b.length];

		for (int i = 0; i < Math.min(a.length, b.length) * 2; i++) {
			if (i % 2 == 0) {
				if (i / 2 <= a.length - 1) {
					nuevo[i] = a[i / 2];
				}
			} else {
				if (i / 2 <= b.length - 1)
					nuevo[i] = b[i / 2];
			}
		}

		if (a.length < b.length) {
			int j = a.length;
			for (int i = a.length * 2; i < nuevo.length; i++) {
				nuevo[i] = b[j];
				j++;
			}
		} else {
			int j = b.length;
			for (int i = b.length * 2; i < nuevo.length; i++) {
				nuevo[i] = a[j];
				j++;
			}
		}
		return nuevo;
	}

	/** Concatena dos arreglos para que salga uno solo */

	static String concatenar(String[] arreglo) {

		String s = "";
		for (int i = 0; i < arreglo.length; i++) {
			if (i == arreglo.length - 1)
				s = s + arreglo[i];
			else
				s = s + arreglo[i] + ",";
		}
		return s;
	}

	/** Saca elementos de un arreglo */

	static int[] sacarElementos(int[] a) {
		int[] aux = new int[a.length - 2];

		for (int i = 1; i < a.length - 1; i++) {
			aux[i - 1] = a[i];
		}
		return aux;
	}

	/** Cuenta la cantidad de repetidos dentro de un arreglo */

	static int cantRepetidos1(int[] a) {
		int cont = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					cont++;
					System.out.println("cont: " + cont + " i: " + i + " j: " + j);
					break;
				}
			}
		}
		return cont;
	}

	/** Devuelve un arreglo sin repetidos */

	static int[] sinrepetidos(int[] a) {

		int[] nuevo = new int[a.length - cantRepetidos1(a)];
		nuevo[0] = a[0];

		int k = 1;

		for (int i = 1; i < a.length; i++) {
			boolean repetido = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					repetido = true;
				}
			}
			if (!repetido) {
				nuevo[k] = a[i];
				k++;
			}
		}
		return nuevo;
	}

	/** Resto de un arreglo */

	static int[] resto(int[] a) {
		int[] nuevo = new int[a.length - 1];
		for (int i = 1; i < a.length; i++) {
			nuevo[i - 1] = a[i];
		}
		return nuevo;
	}

	/** Ejercicio 25 P0: Devuelve el maximo de un arreglo */

	static int maximo(int[] arreglo) {
		int max = arreglo[0];
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i] > max) {
				max = arreglo[i];
			}
		}
		return max;
	}

	/** Ejercicio 26 P0: Devuelve la posicion del valor maximo de un arreglo */

	static int maximoIndice(int[] arreglo) {
		int max = arreglo[0];
		int posicion = 0;
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i] > max) {
				posicion = i;
			}
		}
		return posicion;
	}

	/** Ejercicio 27 P0: Devuelve la suma de todos los elementos de un arreglo */

	public static int sumaArreglo(int[] arreglo) {
		int suma = 0;
		for (int i = 0; i < arreglo.length; i++) {
			suma += arreglo[i];
		}
		return suma;
	}

	/** Revertir una lista en un arreglo nuevo */

	public static int[] reverso(int[] arreglo) {
		int[] arregloreverso = new int[arreglo.length];
		int p = arreglo.length - 1;
		for (int i = 1; i < arreglo.length; i++) {
			arregloreverso[i] = arreglo[p];
			p--;
		}
		return arregloreverso;
	}

	/** Revertir que no devuelve nada */

	public static void revertir(int[] arreglo) {
		int i = 0;
		int j = arreglo.length;
		int arreglonuevo;
		while (i > j) {
			arreglonuevo = arreglo[i];
			arreglo[i] = arreglo[j];
			arreglo[j] = arreglonuevo;
			i++;
			j--;
		}
	}

	/** Copiar arreglo */

	static int[] copiarArreglo(int[] a) {
		int[] clon = a.clone();
		return clon;
	}

	/** Busca un determinado valor y devuelve la posición */

	static int buscarValor(int[] arreglo, int numero) {
		for (int posicion = 0; posicion < arreglo.length; posicion++) {
			if (arreglo[posicion] == numero) {
				return posicion;
			}
		}
		return -1;
	}

	/** Busca un determinado valor y devuelve un valor booleano */

	boolean buscar(int[] arreglo, int numero) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == numero) {
				return true;
			}
		}
		return false;
	}
	
	/** Busqueda binaria */

	boolean busquedaBinaria(int[] a, int b) {
		int izq = 0;
		int der = (a.length - 1);
		while (izq + 1 < der) {
			int m = (izq + der) / 2;
			if (a[m] == b)
				return true;

			if (a[m] < b)
				izq = m;
			else
				der = m;
		}
		return a[izq] == b || a[der] == b;
	}

/////////////////////////////////////// M A I N ///////////////////////////////////////

	public static void main(String[] args) {

		System.out.println();
	}

} // Cierre del Programa
