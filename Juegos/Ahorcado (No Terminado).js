
public class Ahorcado {
	//variables de instancia
	int intentos;
	String palabraSecreta;
	char[] palabraOculta;

	//constructor
	Ahorcado(String palabraSecreta){
		this.intentos = 5;
		this.palabraSecreta = palabraSecreta;
		this.palabraOculta = new char[this.palabraSecreta.length()];
		//recorrer el arreglo y asignar a cada posicion '_'
	}

	boolean arriesgarLetra(char l) {
		return false;
	}

	public void mostrar() {

	}

	public void arriesgarPalabra(String p) {

	}

	public boolean terminado() {
		return false;
	}

	public boolean ganado() {
		return false;
	}

}
