
public class Reparación {

	Electrodomestico aparato;
	Repuesto [] partes;
	Empleado [] tecnicos;

	// b) En la clase Reparacion
	public boolean tieneExp(int x) {
	   for (Empleado e : tecnicos) {
	      if (e.antiguedad > x ) {
	          return true;
	      }
	   }
	   return false;
	}

	// c) En la clase Reparacion
	public boolean esHomologada() {
	   for (Repuesto rep : partes) {
	      if ( ! rep.marca.equals(aparato.marca) ) {
	          return false;
	      }
	   }
	   return true;
	}
}
