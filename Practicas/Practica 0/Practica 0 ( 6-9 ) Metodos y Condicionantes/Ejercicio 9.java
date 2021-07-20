import java.util.Scanner;
public class Ejercicio9 {

		// Escribir un método static void imprimirFecha(int dia, int mes, int anio) que imprime la
		// fecha pasada como parámetro en formato del estilo “5 de Julio de 2030”.


	public static int pedirDia(){
		Scanner pedir = new Scanner (System.in);
		System.out.print("Ingrese un dia: ");
		return pedir.nextInt();
	}


	public static int pedirMes(){
		Scanner pedir = new Scanner (System.in);
		System.out.print("Ingrese un mes: ");
		return pedir.nextInt();
	}

	public static int pedirAnio(){
		Scanner pedir = new Scanner (System.in);
		System.out.print("Ingrese un año: ");
		return pedir.nextInt();
	}

	public static void main(String[] args) {

		int dia = pedirDia();
		int mes = pedirMes();{
		int anio = pedirAnio();


        String mesString; //Intercambia el numero ingresado por un nuevo valor de tipo String

         // instrucción switch con tipo de datos int
        switch (mes)
        {
            case 1:  mesString = "Enero";
                     break;
            case 2:  mesString = "Febrero";
                     break;
            case 3:  mesString = "Marzo";
                     break;
            case 4:  mesString = "Abril";
                     break;
            case 5:  mesString = "Mayo";
                     break;
            case 6:  mesString = "Junio";
                     break;
            case 7:  mesString = "Julio";
                     break;
            case 8:  mesString = "Agosto";
            		break;
            case 9:  mesString = "Septiembre";
            		break;
            case 10:  mesString = "Octubre";
            		break;
            case 11:  mesString = "Noviembre";
            		break;
            case 12:  mesString = "Diciembre";
            		break;
            default: mesString = "Mes inválido";
                     break;

		}

        System.out.println("La fecha es: " + dia + " de " + mesString + " de " + anio);

        }
		}
	}
