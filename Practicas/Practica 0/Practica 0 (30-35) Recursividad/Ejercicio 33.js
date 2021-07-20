
public class Ejercicio33 {

//	Escribir, utilizando recursividad, un método int mcd(int a, int b) que calcula el máximo
//	común divisor entre a y b.

	public static void main(String[] args) {

		System.out.println(maximoComunDivisor(300,600));

	} //Cierre del Main

	/** Denomina el maximo comun divisor entre 2 numeros */

	static int maximoComunDivisor(int numero1, int numero2) {
		if (numero2 == 0) {
			return numero1;
		}
		return (maximoComunDivisor(numero2, numero1 % numero2));
	}

} //Cierre total del programa
