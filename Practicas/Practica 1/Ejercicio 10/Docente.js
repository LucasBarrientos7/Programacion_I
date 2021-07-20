
public class Docente {

	// Variables de Instancia:
	private String nombre;
	private int dni;

	/** Constructor Objeto Docente */

	public Docente(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	/** Permite obtener el nombre */

	public String getNombre() {
		return nombre;
	}

	/** Permite cambiar el nombre si cumple la validación */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Permite obtener el DNI */

	public int getDni() {
		return dni;
	}

	/** Permite cambiar el DNI si cumple la validación */

	public void setDni(int dni) {
		this.dni = dni;
	}

} // Cierre total del Programa
