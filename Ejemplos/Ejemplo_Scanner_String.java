import java.util.Scanner;

public class Ejemplo_Scanner_String {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese el nombre");
		String nombre;
		nombre = scn.nextLine();
		System.out.println("el nombre es " + nombre);
		scn.close();

	}

}
