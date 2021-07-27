
public class NodoInt {
	
	// Variables de Instancia:
	
	NodoInt siguiente; // La referencia al puntero de memoria en donde esta el siguiente
	int elemento;
	
	// Metodos de Instancia:
	
	public NodoInt(){
		this.elemento = elemento;
		this.siguiente = null;
	}

	public NodoInt getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoInt siguiente) {
		this.siguiente = siguiente;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	
	
	
} // Cierre total del programa