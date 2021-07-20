
public class Ejercicio31 {

//	La sucesión de Fibonacci:
//	a) usando recursividad, con la siguiente signatura: static int fibrec(int n)
//	b) usando un ciclo, con la siguiente signatura: static int fibiter(int n)

//	Responder:
//	a) Comparar los tiempos entre una implementación y otra. ¿Cuál es el término más grande que
//	puede calcular cada una de las implementaciones en un tiempo menor a 10 segundos? ¿Hay
//	diferencia? ¿Te imaginás por qué?
//	b) ¿Cuánto vale f47? Interpretá este resultado.

	public static void main(String[] args) {

		System.out.println(fibRec(3));

	} //Cierre del Main

	static int fibRec(int numero) {
		return numero<2? numero: fibRec (numero-1)+fibRec(numero-2);
	}

} //Cierre total del programa
