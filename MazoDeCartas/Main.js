import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		 Carta c = new Carta (1,1); // Palo Invalido

//		System.out.println(c);

		Mazo mazo = new Mazo();
		mazo.mezclar();
		mazo.imprimirInicial();

		System.out.println("----------------");
		System.out.println("La carta dada es: " + mazo.darCarta());
		System.out.println("La carta dada es: " + mazo.darCarta());
		System.out.println("----------------");

		mazo.imprimirRepartida();

	} // Cierre del Main

} // Cierre total del programa
