import java.util.Scanner;

public class Ejercicio2 {

	// Escribir un programa que te pregunte tu nombre y a continuación imprima un saludo”.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Se llama al contructor del objeto y se le asigna una variable
		String nombre;
		System.out.print("Ingrese su nombre: ");	// Imprime en pantalla y abre el teclado
		nombre = scan.nextLine();	// La variable toma lo que se ingresó por teclado
		System.out.print( "Hola " + nombre);
		scan.close();	// Cierra el comando de Scanner

	} // Cierre del Main



} // Cierre total del Programa
