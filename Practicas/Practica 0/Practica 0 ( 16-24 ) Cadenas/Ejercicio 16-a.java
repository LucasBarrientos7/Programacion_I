import java.util.Scanner;

public class Ejercicio16_A {


	// Escribir un programa que pida por pantalla un texto y a continuación lo imprima de atrás para
	// adelante. Para obtener las letras de una cadena de caracteres pueden utilizar el método charAt
	// de String. Por ejemplo, cadena.charAt(0) devuelve el primer caracter del String cadena

	public static void main(String[] args) {

		String cadena=pedirString();
		String invertida=invertir(cadena);
		System.out.println("La cadena "+ '"'+cadena+'"'+" invertida es "+'"'+invertida+'"');

	}

	/** Funciones */

	public static String invertir(String s){
    	String nueva="";
    	for (int i=s.length()-1;i >= 0;i-- ){
    		nueva=nueva+s.charAt(i);
    	}
    	return nueva;
    }
	
    public static String pedirString(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Ingrese una texto");
    	return sc.nextLine();
    }

}//cierre
