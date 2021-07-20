import java.util.Random;

public class Mazo {

	private Carta[] cartas;
	private int repartidas;

	/** Construye un mazo de 40 cartas */

	public Mazo() {
		this.cartas = new Carta[40];
		int j = 0;
		for (int p = 1; p <= 4; ++p) {
			for (int i = 1; i <= 7; ++i) {
				cartas[j++] = new Carta(p, i);
			}
			for (int i = 10; i <= 12; i++) {
				cartas[j++] = new Carta(p, i);
			}
		}
		this.repartidas = 0;
	}

	/** Imprime en pantalla la carta */

	public void imprimirInicial() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println("Carta N° " + (i + 1) + ": " + this.cartas[i]);
		}
	}

	/** Imprime en pantalla la carta repartida */

	public void imprimirRepartida() {
		for (int i = this.repartidas; i < cartas.length; i++) {
			System.out.println("Carta N° " + (i + 1) + ": " + this.cartas[i]);
		}
	}

	/** Copia un mazo exactamente igual a otro */

	public Mazo copiar() {
		Mazo mazo = new Mazo();
		for (int i = 0; i < this.cartas.length; i++) {
			mazo.cartas[i] = this.cartas[i];
		}
		return mazo;
	}

	/** Copia un mazo con sus cartas originales */

	public Mazo copiar2() {
		Mazo mazo = new Mazo();
		for (int i = 0; i < this.cartas.length; i++) {
			if (this.cartas[i] == null) {
				mazo.cartas[i] = null;
			} else {
				mazo.cartas[i] = new Carta(this.cartas[i].getNumero(), this.cartas[i].getPalo());
			}
		}
		return mazo;
	}

	/** Mezcla un mazo */

	public void mezclar() {
		Random r = new Random();

		for (int i = 0; i < 200; i++) {
			int j = r.nextInt(this.cartas.length);
			int k = r.nextInt(this.cartas.length);
			if (!(j <= this.repartidas || k <= this.repartidas)) {
				Carta aux = this.cartas[j];
				this.cartas[j] = this.cartas[k];
				this.cartas[k] = aux;
			}
		}
	}

	public Carta darCarta() {
		if (!this.quedanCartas()) {
			return null;
		}
		Carta c = this.cartas[this.repartidas];
		this.repartidas++;
		return c;
	}

	public boolean quedanCartas() {
		return this.repartidas < this.cartas.length;
	}

}// Cierre total del programa
