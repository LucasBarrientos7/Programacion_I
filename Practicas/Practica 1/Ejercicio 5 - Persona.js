
public class Persona {

	// Variables de Instancia:

	private String nombre;
	private int edad;

	/** Constructor Objeto Cartas */

	public Persona(String nombre, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	// Metodos de Instancia:

	/** Permite obtener el nombre */

	public String getNombre() {
		return nombre;
	}

	/** Permite cambiar el nombre si cumple la validación */

	public void setNombre(String nombre) {
		if (nombre.length() < 3 || nombre.length() > 80) { // Validación
			throw new RuntimeException("El nombre ingresado es invalido");
		}
		this.nombre = nombre;
	}

	/** Permite obtener la edad */

	public int getEdad() {
		return edad;
	}

	/** Permite cambiar la edad si cumple la validación */

	public void setEdad(int edad) {
		if (edad < 0 || edad > 140) { // Validación
			throw new RuntimeException("La edad ingresada es invalida");
		}
		this.edad = edad;
	}

	/** Determina si una persona es más joven que otra persona */

	boolean masJovenQue(Persona otro) {
		return this.edad < otro.edad;
	}

	/** Determina si dos personas tienen el mismo nombre */

	boolean tocayo(Persona otro) {
		return this.nombre.equalsIgnoreCase(otro.nombre);
	}

	/** Determina si dos personas son la misma persona */

	boolean mismaPersona(Persona otro) {
		return this.tocayo(otro) && this.edad == otro.edad;
	}

	public String toString() {
		return "Persona [Nombre: "+nombre + ", edad: " + edad + "]";
	}

} // Cierre total del programa
