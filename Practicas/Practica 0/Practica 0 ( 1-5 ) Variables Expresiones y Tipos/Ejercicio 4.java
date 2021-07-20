
public class Ejercicio4 {
	//Imprimir desde Java las siguientes expresiones e interpretar el valor que arrojan.
		//   1/2
		//   1.0/2.0
		//   1.0/2
		//   1/2.0
		//  ”1”/”2”
		//   1+2
		//  ”1”+”2”
		//  16/2∗4
		//  16/(2∗4)

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		float c = 1;
		float d = 2;
		String e = "1";
		String f = "2";
		int g = 16;
		int h = 4;

		System.out.println("1/2: " + a/b);
		System.out.println("1.0/2.0: " + c/d);
		System.out.println("1.0/2: " + c/b);
		System.out.println("1/2.0: " + a/d);
		//System.out.print(e/f); No puede realizar operaciones matematicas con cadenas de letras.
		System.out.println("1+2: " + (a+b)); //Al sacar los parentesis de la cuenta lo lee como caracteres
		System.out.println("”1”+”2”: " + e+f);
		System.out.println("16/2∗4: " + g/b*h);
		System.out.println("16/(2∗4): " + g/(b*h));

	} // Cierre del Main

} // Cierre total del Programa
