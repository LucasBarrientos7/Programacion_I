import java.util.Scanner;

public class Juego_PonerNota {
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
