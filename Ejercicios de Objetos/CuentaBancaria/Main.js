
public class Main {

	public static void main(String[] args) {

		/** Objeto Cuenta */

//		Cuenta c1 = new Cuenta("Jose");
//		Cuenta c2 = new Cuenta("Pepe",38483726,200000,'h'); // No sale en pantalla el numero de cuenta
//
//		c1.setTipoCuenta('c');
//		c1.setNumeroCuenta(170000);
//		c1.ingresar(5000);
//
//		c1.imprimirSaldo();
//		c2.imprimirSaldo();

		/** Objeto Persona */

		Persona p1= new Persona("Bruce",28,40400000,'m');
		Persona p2= new Persona("Selina",25,38483726,'f');

		System.out.println(p1);
		System.out.println(p1.calcularIMC() + ", " + p1.traducirIMC());
		System.out.println("auto"+1+"izq"=="auto1izq");



		System.out.println(p2);


	} // Cierre del Main

} // Cierre total del programa
