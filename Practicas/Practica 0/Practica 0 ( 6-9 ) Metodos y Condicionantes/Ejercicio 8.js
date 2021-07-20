import java.util.Scanner;

public class Ejercicio8 {

		// Escribir un método static void ponerNota(double x, double y) que toma dos números decimales y
		// los promedia. En caso que el promedio sea mayor o igual a 7, deberá imprimir
		// ‘‘Promocionado’’, si es mayor o igual a 4 pero menor que 7, imprime ‘‘Aprobado’’ y si es menor
		// que 4 imprime ‘‘Debe recuperar’’. Probarla llamándola desde el main con distintos números.
		// Luego, pedirle ambos números al usuario (usando nextFloat() del Scanner) para pasárselos aponerNota.

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);

			System.out.println("Ingrese la primer nota:");
			double a=sc.nextDouble();

			System.out.println("Ingrese la segunda nota:");
			double b=sc.nextDouble();

			ponerNota(a,b);

			int n=sc.nextInt();
			System.out.println("La cantida de cifras es "+cantCifras(n));
			System.out.println("Suma cuadrados "+sumaDeCuadrados(n));
			sc.close();
		}
		static void ponerNota(double n1, double n2){
			double res=(n1+n2)/2;// calculo
			if (res >=7 && n1 >= 6 && n2 >= 6){
				System.out.println("Promicionado con " +res);}
			else {
				if(res >=4){
					System.out.println("Aprobado con "+res);}
				else {
					System.out.println("Debe recursar "+res);}
			}
		}

		static int cantCifras(int n){
			int cont=1;
			while (n/10 != 0){
				cont++;
				n=n/10;
			}
			return cont;
		}

		static int sumaDeCuadrados(int n){
			int suma=0;
			for (int i=0;i<=n;i++){
				suma +=i*i;
				suma=suma+i*i;
			}

			return suma;
		}
	}
