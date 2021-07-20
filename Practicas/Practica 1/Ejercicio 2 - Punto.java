
public class Punto {
	double x;
	double y;

	/** Imprime en pantalla un Punto */

	void imprimir(char letra) {
		if (letra == 'a') {
			System.out.println("Punto x: " + this.x);
			System.out.println("Punto y: " + this.y);
		}
		if (letra == 'b') {
			System.out.println("(" + this.x + "," + this.y + ")");
		}
	}

	/** Objeto punto sin parametros */

	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	/** Objeto punto con dos parametros */

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/** Desplaza la cordenada (x,y) tantos numeros como lo indica el parametro */

	void desplazar(double desp_x, double desp_y) {
		this.x += desp_x;
		this.y += desp_y;
	}

	/** Calcula una distancia entre dos puntos */

	static double distancia(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

} // Cierre total del programa
