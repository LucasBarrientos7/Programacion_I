
public class Funciones_Matrices {

	/** imprime en pantalla una matriz por filas */
	
	static void mostrarMatrizPorFilas(int [][] mat) {
		for (int fila = 0; fila < mat.length; fila++) {
			for (int columna = 0; columna < mat[fila].length; columna++) {
				System.out.print(mat[fila][columna] + " ");
			}
			System.out.println();
		}
	}
	
	/** imprime en pantalla una matriz por columnas */
	
	static void mostrarMatrizPorColumnas(int [][] mat) {
		for (int columna = 0; columna < mat[0].length; columna++) {
			for (int fila = 0; fila < mat.length; fila++) {
				System.out.print(mat[fila][columna] + "  ");
			}
			System.out.println();
		}
	}
	
	/** Realiza una matriz con numeros aleatorios */
	
	//////////////// NO TERMINADO ////////////////
	
	static int [][] matrizRandom(int cantFil, int cantCol) {
		int [][] newMat = new int[cantFil][cantCol];
		for (int fila = 0; fila < newMat.length; fila++) {
			for (int columna = 0; columna < newMat[fila].length; columna++) {
				newMat[cantFil][cantCol] = newMat[cantFil+2][cantCol+3];
			}
		}
		return newMat;
	}
	
}
