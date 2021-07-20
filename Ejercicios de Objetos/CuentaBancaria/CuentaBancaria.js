
public class Cuenta {

	// Variables de Instancia:
	private String titular;
	private double saldo;
	private int numeroCuenta;
	private char tipoCuenta;

	/** Constructor Objeto Cuenta con un solo parametro */

	public Cuenta(String titular) {
		this.setTitular(titular);
		this.setSaldo(0);
		this.setTipoCuenta('h');
	}

	/** Constructor Objeto Cuenta */

	public Cuenta(String titular,  int numeroCuentadouble, double saldo, char tipoCuenta) {
		this.setTitular(titular);
		this.setSaldo(saldo);
		this.setNumeroCuenta(numeroCuenta);
		this.setTipoCuenta(tipoCuenta);
	}

	// Metodos de Instancia:

	/** Permite obtener nombre del Titular */

	public String getTitular() {
		return titular;
	}

	/** Permite cambiar el nombre del titular si cumple la validación */

	public void setTitular(String titular) {
		if (titular.length() < 3) {
			throw new RuntimeException("Error! nombre Invalido");
		}
		this.titular = titular;
	}

	/** Permite obtener el saldo */

	public double getSaldo() {
		return saldo;
	}

	/** Permite cambiar el saldo si cumple la validación */

	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	/** Permite obtener el numero de Cuenta */

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/** Permite cambiar el numero de Cuenta si cumple la validación */

	public void setNumeroCuenta(int numeroCuenta) {
		if (numeroCuenta >= 10000000 && numeroCuenta <= 99999999) {
			this.numeroCuenta = numeroCuenta;
		}
	}

	/** Permite obtener el tipo de cuenta */

	public char getTipoCuenta() {
		return tipoCuenta;
	}

	/** Permite cambiar el tipo de cuenta si cumple la validación */

	public void setTipoCuenta(char tipoCuenta) {
		if (tipoCuenta == 'c' || tipoCuenta == 'h') {
			this.tipoCuenta = tipoCuenta;
		}
	}

	/** Metodo que ingresa una cantidad de dinero a la cuenta */

	public void ingresar(double cantidad) {
		if (cantidad>0) {
			this.saldo += cantidad;
		}
	}

	/** Metodo que retira una cantidad de dinero a la cuenta */

	public void retirar(double cantidad) {
		if ((this.saldo- cantidad)>0) {
			this.saldo -= cantidad;
		}
	}

	/** Muestra el saldo de la cuenta */

	public double mostrarSaldo() {
		return this.getSaldo();
	}

	/** Imprime en pantalla todo lo referido a la cuenta */

	public void imprimirSaldo() {
		System.out.println("Estimado " + this.getTitular()+ ", el saldo de su " + (this.getTipoCuenta()=='h'? "Caja de ahorro" : "Cuenta Corriente") + " N°: " + this.getNumeroCuenta() + ", es de $" + this.getSaldo() + " pesos.");
	}

} // Cierre total del programa
