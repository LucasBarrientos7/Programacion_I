
public class Comision {

	// Variables de Instancia:
	private String materia;
	private int numero;
	private Docente[] docentes;
	private Estudiante[] inscriptos;
	private int[] calificaciones;

	/** Constructor Objeto Comision */

	public Comision(String materia, int numero) {
		this.materia = materia;
		this.numero = numero;
		this.docentes = new Docente[3];
		this.inscriptos = new Estudiante[10];
		this.calificaciones = new int[10];
	}

	/** Permite obtener la materia */

	public String getMateria() {
		return materia;
	}

	/** Permite cambiar la materia si cumple la validación */

	public void setMateria(String materia) {
		this.materia = materia;
	}

	/** Permite obtener el numero */

	public int getNumero() {
		return numero;
	}

	/** Permite cambiar el numero si cumple la validación */

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/** Permite obtener el Docente */

	public Docente[] getDocentes() {
		return docentes;
	}

	/** Permite cambiar el Docente si cumple la validación */

	public void setDocentes(Docente[] docentes) {
		this.docentes = docentes;
	}

	/** Permite obtener el Inscripto */

	public Estudiante[] getInscriptos() {
		return inscriptos;
	}

	/** Permite cambiar el Inscripto si cumple la validación */

	public void setInscriptos(Estudiante[] inscriptos) {
		this.inscriptos = inscriptos;
	}

	/** Permite obtener la calificacion */

	public int[] getCalificaciones() {
		return calificaciones;
	}

	/** Permite cambiar la calificacion si cumple la validación */

	public void setCalificaciones(int[] calificaciones) {
		this.calificaciones = calificaciones;
	}

	/** Permite agregar un docente a la lista */

	public void agregarDocente(String nombre, int dni) {
		for (int i = 0; i < this.docentes.length; i++) {
			if (this.docentes[i] == null) {
				this.docentes[i] = new Docente(nombre, dni);
				break; // Esto sirve para que solo lo haga una sola vez y no agregue infinitamente
			}
		}
	}

	/** Permite agregar un estudiante a la lista */

	public void agregarEstudiante(String nombre, int legajo, int calificacion) {
		for (int i = 0; i < this.inscriptos.length; i++) {
			if (this.inscriptos[i] == null) {
				this.inscriptos[i] = new Estudiante(nombre, legajo);
				this.calificaciones[i] = calificacion;
				break; // Esto sirve para que solo lo haga una sola vez y no agregue infinitamente
			}
		}
	}

} // Cierre total del Programa
