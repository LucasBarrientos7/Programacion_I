import java.util.LinkedList;

public class Taller {

	Reparación [] reparaciones;

	// a) Escribir un método int reparacionesComplicadas(int p, int e) que calcule la cantidad
	// de reparaciones del taller que involucraron al menos a p partes y al menos a e empleados.

	public int reparacionesComplicadas(int p, int e) {
	   int cont = 0;
	   for (Reparación r : reparaciones) {
	      if (r.partes.length > p && r.tecnicos.length > e ) {
	          cont++;
	      }
	   }
	   return cont;
	}

	// b) Escribir un método int reparacionesConExperiencia(int x) que calcule la cantidad de
	// reparaciones del taller que contaron con al menos un empleado con x años de antigüedad o más.

	public int reparacionesConExperiencia(int x) {
	   int cont = 0;
	   for (Reparación r : reparaciones) {
	      if (r.tieneExp(x) ) {
	          cont++;
	      }
	   }
	   return cont;
	}


	//c) Escribir un método LinkedList<Reparacion> reparacionesHomologadas() que
	// devuelve el conjunto de reparaciones del taller que se hayan reparado con
	// todos repuestos de la misma marca que el Electrodomestico en cuestion.

	public LinkedList<Reparación> reparacionesHomologadas() {
	   LinkedList<Reparación> homologadas = new LinkedList<Reparación> () ;
	   for (Reparación r : reparaciones) {
	      if (r.esHomologada() ) {
	          homologadas.add(r);
	      }
	   }
	   return homologadas;
	}
}
