
public class UNGS {

	// Variables de Instancia:
	Comision[] comisiones;

	/** Constructor Objeto UNGS */

	public UNGS() {
		this.comisiones = new Comision[3];
	}

	/** Agrega una comision a la lista */

	public void agregarComision(String materia, int numero) {
		for (int i = 0; i < this.comisiones.length; i++) {
			if (this.comisiones[i] == null) {
				this.comisiones[i] = new Comision(materia, numero);
				return;
			}
		}
	}

	/** Verifica si un alumno cursa con un docente */

	public boolean cursaCon(Estudiante e, Docente d) {
		for (int i = 0; i < this.comisiones.length; i++) {
			for (int j = 0; j < this.comisiones[i].getInscriptos().length; j++) {
				if (this.comisiones[i].getInscriptos()[j] == e) {
					for (int k = 0; k < this.comisiones[i].getDocentes().length; k++) {
						if (this.comisiones[i].getDocentes()[k] == d) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

} // Cierre total del Programa
