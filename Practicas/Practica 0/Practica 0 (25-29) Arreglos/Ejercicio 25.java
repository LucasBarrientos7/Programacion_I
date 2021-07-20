
public class Ejercicio25 {

//	Escribir un método static int maximo(int[] a) que dado un arreglo de enteros no vacío, devuelve
//	el valor más alto que aparece

	public static void main(String[] args) {

		int [] arreglo = {1,2,3,4,5,6,7};
		System.out.println(maximo(arreglo));

	} //Cierre del Main

	/** Devuelve el maximo de un arreglo */

	static int maximo(int[] arreglo) {
		int max =  arreglo[0];
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i]>max) {
				max = arreglo[i];
			}
		}
		return max;
	}

} //Cierre total del programa
