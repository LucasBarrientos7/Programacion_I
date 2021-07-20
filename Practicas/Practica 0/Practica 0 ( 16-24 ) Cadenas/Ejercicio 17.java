
public class Ejercicio17 {

	// Escribir un método static int cantidadApariciones(String s, char c) que dada una cadena
	// y un caracter, cuenta la cantidad de veces que aparece c en s.

	public static void main(String[] args) {
		System.out.println(cuantasVeces("banana",'a'));

	}

	static int cuantasVeces(String S, char c){
		int cont = 0;
		for(int i=0; i< S.length(); i++)
			if ( S.charAt(i) == c)
				cont++;
		return cont;
	}
}
