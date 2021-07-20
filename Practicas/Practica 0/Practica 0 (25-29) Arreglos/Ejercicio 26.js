
public class Ejercicio26 {

//	Escribir un método static int maximoIndice(int[] a) que dado un arreglo de enteros no vacío,
//	devuelve el índice del valor más alto que aparece.

	public static void main(String[] args) {

		int [] arreglo = {1,2,3,4,5,6,7};
		System.out.println(maximoIndice(arreglo));

	} //Cierre del Main

	/** Devuelve la posicion del valor maximo de un arreglo */

	static int maximoIndice(int[] arreglo) {
		int max =  arreglo[0];
		int posicion = 0;
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i]>max) {
				posicion = i;
			}
		}
		return posicion;
	}

} //Cierre total del programa
