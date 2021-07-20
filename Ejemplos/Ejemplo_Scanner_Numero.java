import java.util.Scanner;

public class Ejemplo_Scanner_Numero {

	static Scanner pedir = new Scanner (System.in);
	public static void main(String[] args) {
		int num1=pedirNumero();
		int num2=pedirNumero();
		System.out.print ("La suma de " +num1 +" + " +num2+ " es: "+suma(num1,num2));
	}

	public static int pedirNumero(){
		System.out.print("Ingrese un numero: ");
		return pedir.nextInt();
	}

	public static int suma(int a,int b){
		return a+b;
	}
}
