
public class Ejercicio29 {

//	Escribir un método static double promedio(double[] a) que dado un arreglo de números con
//	coma, devuelve el valor del p

	public static void main(String[] args) {

		int [] arreglo = {1,2,3,4,5,6,7};
		System.out.println(promedio(arreglo));


	} //Cierre del Main

	/** Devuelve el promedio del arreglo */

	public static int promedio(int[] arreglo) {
		int suma = 0;
		for (int i = 0; i < arreglo.length; i++) {
			suma += arreglo[i];
		}
		return (suma / arreglo.length);
	}

} //Cierre total del programa
