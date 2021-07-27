
public class Ordenamiento {

	/** Ordenamiento por Seleccion */

//	Buscar el menor elemento del arreglo y ponerlo al principio del mismo (intercambiándolo con el primer elemento).

//	Buscar el menor elemento de lo que queda del arreglo y ponerlo en la segunda posición del arreglo.

//	Buscar el menor elemento del resto del arreglo y ponerlo en la tercera posición.
//	Seguimos con este procedimiento hasta que hallamos llenado todas las posiciones del arreglo con los elementos correspondientes.

	static void ordenarPorSeleccion(int a[]) {
		for (int i = 0; i < a.length - 1; i++) { // Recorre el entero
			int menor = i;
			for (int j = i + 1; j < a.length; j++) { // Recorre lo que queda del arreglo
				if (a[j] < a[menor])
					menor = j;
			}

			swap(a, i, menor);
		}
	}

	/** Intercambia una posicion de un arreglo por un numero */

	static void swap(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	/** Ordenamiento por Insercion */

//	Si el segundo elemento del arreglo es más chico que el primero los intercambiamos.

//	Teniendo estos dos elementos ordenados, tomamos el tercer elemento y lo “insertamos” en la posición que corresponda con respecto a los dos primeros elementos.

//	Teniendo estos tres ordenados, tomamos el cuarto y hacemos lo mismo.

//	Teniendo los cuatro primeros ordenados, tomamos el quinto elemento y lo insertamos entre los primeros, donde corresponda.

//	Seguimos con este proceso hasta el último elemento del arreglo.

	static void ordenarPorInsercion(int arreglo[]) {
		for (int i = 1; i < arreglo.length; i++) { // Recorre el arreglo entero
			int pos = 0;
			while (pos < i && arreglo[pos] < arreglo[i]) // Recorre y comprueba que los elementos son menores
				pos++; // sigue avanzando

			int temp = arreglo[i]; // Elemento que se inserta
			for (int j = i - 1; j >= pos; j--) // Corro todos los demas valores
				arreglo[j + 1] = arreglo[j];

			arreglo[pos] = temp; // Inserto el valor en la posicion libre
		}
	}

	/** Ordenamiento por Burbujeo */

//	Comparar los dos primeros elementos y dejar el más grande a la derecha.

//	Comparar ahora el segundo y el tercer elemento y hacer lo mismo.

//	Luego el tercer y el cuarto elemento, y así hasta el final del arreglo.

//	De esta manera seguro que el mayor elemento quedará al final del arreglo.

//	Volvemos a repetir el proceso, pero llegando sólo hasta el anteúltimo elemento, es decir, no comparamos el último (pues ya era el más grande).

//	Repetir este mismo proceso hasta que hayamos ordenado todos los elementos del arreglo.

	static void ordenarPorBurbujeo(int a[]) {
		for (int i = a.length - 1; i > 0; i--) { // Recorre desde el final (Elemento mas grande a la posicion final)
			for (int j = 0; j < i; j++) { // Recorre desde el primero
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
			}
		}
	}

	/** Ordenamiento por Mergesort */

	static void mergesort(int a[]) {
		if (a.length > 1) {
			int medio = (a.length - 1) / 2;
			int[] izq = subarreglo(a, 0, medio);
			int[] der = subarreglo(a, medio + 1, a.length - 1);
			mergesort(izq);
			mergesort(der);
			mostrar(der);
			mostrar (izq);
			mezclar(a, izq, der);
			mostrar(a);
			
		}
	}

	static void mezclar(int a[], int izq[], int der[]) {
		int i = 0, j = 0;
		for (int k = 0; k < a.length; k++) {
			if (i == izq.length)
				a[k] = der[j++];
			else if (j == der.length)
				a[k] = izq[i++];
			else if (izq[i] < der[j])
				a[k] = izq[i++];
			else
				a[k] = der[j++];
		}
	}

	static int[] subarreglo(int[] a, int desde, int hasta) {

		int[] r = new int[hasta - desde + 1];
		int k = desde;
		for (int i = 0; i < r.length; i++) {
			r[i] = a[k++];
		}

		return r;
	}

	/** Ordenamiento por Quicksort */

	static void quicksort(int a[]) {
		quicksortEntre(a, 0, a.length - 1);
	}

	static int acomodar(int a[], int desde, int hasta, int p) {
		int i = desde, j = hasta;
		while (i < j) {
			while (a[i] <= p && i < j)
				i++;
			while (a[j] > p && i < j)
				j--;

			if (i < j)
				swap(a, i, j);
		}

		return (a[i] < p ? i : i - 1);
	}

	static void quicksortEntre(int a[], int desde, int hasta) {
		if (desde < hasta) {
			int p = a[desde]; // Usamos el valor del primer elemento para p
			int medio = acomodar(a, desde, hasta, p);
			swap(a, desde, medio);
			quicksortEntre(a, desde, medio - 1);
			quicksortEntre(a, medio + 1, hasta);
		}
	}

	static void mostrar(int [] arreglo) {
		for (int i = 0; i < arreglo.length - 1; i++) {
			System.out.print(arreglo[i] + ", ");
		}
		System.out.println(arreglo[arreglo.length-1]);
	}

}
