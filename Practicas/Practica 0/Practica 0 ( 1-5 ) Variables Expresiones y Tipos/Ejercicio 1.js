import java.awt.GraphicsEnvironment;
public class Ejercicio1 {

	// Ejercicio 1: Escribir el programa “¡Hola, mundo!”.

	public static void main(String[] args) {

		System.out.println("¡Hola, mundo!");

	    String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

	    for (int i = 0; i < fonts.length; i++)
	    {
	     System.out.println('"' + fonts[i] + '"');
	    }

	}

}
