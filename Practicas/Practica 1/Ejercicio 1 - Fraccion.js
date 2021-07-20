
public class Fraccion {
	private int numerador;
	private int denominador;

	/** Imprime en pantalla la fraccion */

	void imprimir() {
		if (this.denominador == 1) {
			System.out.println(this.numerador);
		} else {
			System.out.println(this.numerador + "/" + this.denominador);
		}
	}

	/** Para acceder al numerador */

	public int getNumerador() {
		return numerador;
	}

	/** Sirve para cambiar el valor de un numerador */

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	/** Para acceder al denominador */

	public int getdenominador() {
		return denominador;
	}

	/** Sirve para cambiar el valor de un denominador */

	public void setDenominador(int denominador) {
		if (denominador == 0) {
			throw new RuntimeException("El Denominador no puede ser cero");
		}
		this.denominador = denominador;
	}

	/** Objeto Fraccion sin ningun parámetro */

	public Fraccion() {
		this.numerador = 1;
		this.denominador = 1;
	}

	public double aDouble() {
		return this.numerador/this.denominador;
	}

	/** Objeto Fraccion con un parámetro */

	public Fraccion(int entero) {
		this.numerador = entero;
		this.denominador = 1;
		validarSigno();
	}

	/** Objeto Fraccion dos parámetros */

	public Fraccion(int numerador, int denominador) {
		this.setNumerador(numerador);
		this.setDenominador(denominador);
		validarSigno();
	}

	/** Objeto Fraccion tres parámetros */

	public Fraccion(int entero, int numerador, int denominador) {
		this.numerador = entero * denominador + numerador;
		this.denominador = denominador;
		this.validarSigno();
	}

	/** Invierte el signo a la fracción */

	void invertirSigno() {
		this.numerador = this.numerador * (-1);
	}

	/** Invierte el numerador con el denominador de una fracción */

	void invertir() {
		int aux = this.numerador;
		this.numerador = this.denominador;
		this.denominador = aux;
	}

	/** Verifica que el denominador no sea negativo */

	void validarSigno() {
		if (this.denominador < 0) {
			this.denominador = this.denominador * (-1);
			this.numerador = this.numerador * (-1);
		}
	}

	/** Simplifica una fracción */

	void reducir() {
		int aux = maximoComunDivisor(this.numerador, this.denominador);
		this.numerador = this.numerador / aux;
		this.denominador = this.denominador / aux;
	}

/////////////////////////////////////// FUNCIONES AUXILIARES ///////////////////////////////////////

	/** Suma entre dos fracciones */

	static Fraccion suma(Fraccion q1, Fraccion q2) {
		Fraccion nueva = new Fraccion();
		nueva.denominador = q1.denominador * q2.denominador;
		nueva.numerador = q2.denominador * q1.numerador + q1.denominador * q2.numerador;
		nueva.reducir();
		return nueva;
	}

	/** Producto de una fracción */

	static Fraccion producto(Fraccion q1, Fraccion q2) {
		Fraccion nueva = new Fraccion();
		nueva.setNumerador(q1.numerador * q2.numerador);
		nueva.setDenominador(q1.denominador * q2.denominador);
		nueva.reducir();

		return nueva;
	}

	/** Ejercicio 33 P0: Denomina el maximo comun divisor entre 2 numeros */

	static int maximoComunDivisor(int numero1, int numero2) {
		if (numero2 == 0) {
			return numero1;
		}
		return (maximoComunDivisor(numero2, numero1 % numero2));
	}

} // Cierre total del programa
