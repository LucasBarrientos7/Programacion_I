
public class Ejercicio27 {

//	Escribir un método static int suma(int[] a) que dado un arreglo de enteros, devuelve el valor
//	de la suma de todos sus elementos.

	public static void main(String[] args) {

		int [] arreglo = {1,2,3};
		System.out.println(sumaArreglo(arreglo));

	} //Cierre del Main

	/** Devuelve la suma de todos los elementos de un arreglo */

	public static int sumaArreglo(int[] arreglo) {
		int suma = 0;
		for (int i = 0; i < arreglo.length; i++) {
			suma += arreglo[i];
		}
		return suma;
	}

} //Cierre total del programa
