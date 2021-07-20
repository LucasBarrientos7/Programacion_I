
import java.util.Scanner;
public class Juego_AproboRecurso {
	public static void imprimirPromedio(int a, int	b){
		double promedio=(a+b)/2.0;
		System.out.println("El promedio de "+a +" y "+b+" es= "+promedio );
	}
	public static int pedirNumero(){
		Scanner sca=new Scanner(System.in);
		System.out.println("Ingrese un numero entero ");
		return sca.nextInt();

	}
	public static void calificar(double x, double y){
		double nota=(x+y)/2;
		if(nota < 4){
			System.out.println("Debe recursar");
		}
		if((nota >= 4) && (nota < 7)){
			System.out.println("Aprobo");
		}
		if (nota >=7){
			System.out.println("Promociono");

		}
	}
	public static void main(String[] args) {
		int a=pedirNumero();
		int b=pedirNumero();
		imprimirPromedio(a,b);
		calificar(a,b);

	}

}
