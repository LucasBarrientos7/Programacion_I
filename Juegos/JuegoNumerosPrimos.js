import java.util.Scanner;

public class Juego_Primos {

	// para numeros de entrada >= 2
	// modificar para numero = 1 (debe devolver 2)
	// si la distancia entre anterior y siguiente es la misma devuelve el primo siguiente

	static boolean esPrimo(int n)
	{
		int cont=0;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
				cont++;
		}

		return (cont==0);
	}

	static int primoAnterior(int n)
	{

		int i=n-1;
		while (!esPrimo(i))
			i--;
		return i;
	}

	static int primoSiguiente(int n)
	{
		int i=n+1;
		while (!esPrimo(i))
			i++;
		return i;
	}

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		int numero = lector.nextInt();
		int a = numero - primoAnterior(numero);
		System.out.println("Primo anterior es: " + primoAnterior(numero));
		int b = primoSiguiente(numero) - numero;
		System.out.println("Primo siguiente es: " + primoSiguiente(numero));
		if ( a < b)
			System.out.println("El mas cercano es: "  + primoAnterior(numero));
		else
			System.out.println("El mas cercano es: "  + primoSiguiente(numero));

		lector.close();
	}
