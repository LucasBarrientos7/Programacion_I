
public class Circulo {
	double radio;
	Punto centro;

	public Circulo(double radio, double centrox, double centroy) {
		this.radio = radio;
		this.centro = new Punto(centrox, centroy);
	}

	/** Imprime las variables de un circulo en pantalla */

	void imprimir() {
	System.out.print ("Radio: "+ this.radio);
	System.out.print ("Centro: x = "+ this.centro + ("Centro: y = "+ this.centro));
	}

	/** Calcula el perimetro de un circulo */

	double perimetro() {
		return Math.PI * 2 * this.radio;
	}

	/** Calcula la superficie de un circulo */

	double superficie() {
		return Math.pow(this.radio, 2) * Math.PI;
	}

	/** Desplaza las coordenadas del centro del circulo */

	void desplazar(double x, double y) {
		this.centro.desplazar(x, y);
	}

	/** Multiplica el radio */

	void escalar(double factor) {
		this.radio = this.radio * factor;
	}

	/** Calcula la distancia entre dos circulos */

	static double distancia(Circulo c1, Circulo c2) {
		 double d = Punto.distancia(c1.centro, c2.centro) - (c1.radio + c2.radio);
		if (d <= 0) {
			d = 0;
		}
		return d;
	}

	/** Determina si un circulo esta en su totalidad dentro de otro */

	 boolean loContiene(Circulo otrocirculo){
		double distancia = distancia(this, otrocirculo); // This hace refecencia al objeto con el cual es llamado (c1.loContiene(c2))
		double diferencia = this.radio - otrocirculo.radio;
		return distancia <= diferencia;
	}

} // Cierre total del programa
