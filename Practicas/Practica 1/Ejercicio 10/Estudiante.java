
public class Estudiante {

	// Variables de Instancia:
	private String nombre;
	private int legajo;

	/** Constructor Objeto Estudiante */

	public Estudiante(String nombre, int legajo) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
	}

	/** Permite obtener el nombre */

	public String getNombre() {
		return nombre;
	}

	/** Permite cambiar el nombre si cumple la validación */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Permite obtener el legajo */

	public int getLegajo() {
		return legajo;
	}

	/** Permite cambiar el legajo si cumple la validación */

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

} // Cierre total del Programa
