import java.util.Scanner;

public class Ejemplo_Exepcion {
	public static void main(String[] args) {
		String abc = "abcdef";
		boolean ok = false;
		while (!ok) {

			try {
				Scanner scan = new Scanner(System.in);

				System.out.println("Ingrese el numero de letra del abecedef " + "que quiere consultar:");
				int i = scan.nextInt();
				System.out.println("La letra numero " + i + " es " + abc.charAt(i - 1));
				scan.close();
				ok = true;
			}

			catch (StringIndexOutOfBoundsException ex) {
				System.out.println("El numero debe estar entre 1 y " + abc.length());
				ok = false;
			}

			catch (Exception ex) {
				System.out.println("Se produjo un error con el valor ingresado" + ex);
				ok = false;
			}
		}
	}
}
