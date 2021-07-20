
	import java.util.Scanner;

	public class Juego_Par_Impar {

		public static boolean esPar(int n) {
			return n%2==0;
		}

		public static int cuantosDivisores(int n){
			int cont =2 ;
			for (int i = 2; i<=n/2; i++){
				if (n%i==0){
					cont ++;
				}
			}
			return cont;
		}

		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			System.out.println("Ingrese un Número: ");
			int dato = lector.nextInt();
			if(esPar(dato))
			{
				System.out.println("Es par");
			}else{
				System.out.println("Es impar");
			}

			lector.close();
			System.out.println("Los divisores que tiene el número " + dato + " son ");
			System.out.println(cuantosDivisores(dato));

			//AGREGAR EL CODIGO QUE DIGA SI DATO ES O NO PRIMO

		}

	}
