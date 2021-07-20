
import java.util.Random;
import java.util.Scanner;

public class Juego_AdivinarUnNumero {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Random generador = new Random();

		int escondido = generador.nextInt(10)+1;
		//System.out.println(escondido); Muestra en pantalla el numero
		int intentos = 3;
		int i = 1;
		System.out.println("Ingrese un numero:");
		int jugador = lector.nextInt();

		while ((intentos > i ) && (jugador !=escondido))
		{
			if (jugador<escondido){
				System.out.println("Numero buscado mas grande");
			}else{
				System.out.println("Numero buscado mas chico");
			}
			i ++;
			System.out.println("Ingrese un numero:");
			jugador = lector.nextInt();
		}
		if (jugador == escondido)
			System.out.println("GANO !!!");
		else
			System.out.println("PERDIO !!! el numero era el " + escondido);
		lector.close();
	}
}
