
public class Ejercicio28 {

//	Escribir un método static boolean estaOrdenado(int[] a) que dado un arreglo de enteros,
//	devuelve verdadero si el arreglo está ordenado crecientemente de menor a mayor, y falso en caso
//	contrario.

	public static void main(String[] args) {

		int [] arreglo = {1,2,3,4,5,6,7};
		System.out.println(estaOrdenado(arreglo));

	} //Cierre del Main

	/** Revisa si los elementos de un arreglo estan ordenados */

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

} //Cierre total del programa
