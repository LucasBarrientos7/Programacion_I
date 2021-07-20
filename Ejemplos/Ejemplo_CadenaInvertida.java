import java.util.Scanner;

public class Ejemplo_CadenaInvertida {

	static Scanner sc = new Scanner(System.in);

    public static String pedirString(){
    	System.out.println("Ingrese una texto");
    	return sc.nextLine();
    }

    public static String invertir(String s){
    	String nueva="";
    	for (int i=s.length()-1;i >= 0;i-- ){
    		nueva=nueva+s.charAt(i);
    	}
    	return nueva;
    }

	public static void main(String[] args) {
		String cadena=pedirString();
		String invertida=invertir(cadena);
		System.out.println("La cadena "+ '"'+cadena+'"'+" invertida es "+'"'+invertida+'"');
	}
}
