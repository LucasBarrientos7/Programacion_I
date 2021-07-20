import java.util.Date; // Importa la fecha del dia

public class Carta {

	// Variables de Instancia:
	private int palo;
	private int numero;

	/** Constructor Objeto Cartas */

	public Carta(int palo, int numero) {
		this.setPalo(palo);
		this.setNumero(numero);
	}

	// Metodos de Instancia:

	/** Permite obtener el palo */

	public int getPalo() {
		return palo;
	}

	/** Permite cambiar el palo si cumple la validación */

	public void setPalo(int palo) {
		if (palo <1 || palo >4) { // Validación
			throw new RuntimeException ("Error! palo Invalido");
		}
		this.palo = palo;
	}

	/** Permite obtener el número */

	public int getNumero() {
		return numero;
	}

	/** Permite cambiar el número si cumple la validación */

	public void setNumero(int numero) {
		if (palo <1 || palo >12) { // Validacion
			throw new RuntimeException ("Error! número Invalido");
		}
		this.numero = numero;
	}

	/** Le otorga a cada carta su numero y palo (Imprime en pantalla) */

	public String toString() {
		String[] palos = {"Espada", "Oro", "Copa", "Basto"};
		String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "Sota", "Caballo", "Rey"};
		return valores[this.numero-1] + " de " + palos[this.palo-1]; // -1 para que de la posición exacta
	}

} // Cierre total del programa
