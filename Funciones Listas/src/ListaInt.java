
public class ListaInt {

	// Variables de Instancia:

	NodoInt primero; // Puntero que hace referencia al primer elemento de la lista
	int nodos;

	// Metodos de Instancia:

	public ListaInt() {
		this.primero = null;
		this.nodos = 0;
	}

	/** Metodo para imprimir todos los elementos de una Lista Enlazada */

	public void imprimir() {
		System.out.print("[ ");
		NodoInt actual = this.primero; // Aliasing
		while (actual != null) {
			System.out.print(actual.getElemento() + " ");
			actual = actual.getSiguiente();
		}
		System.out.println("]");
	}

	/** Metodo para agregar un elemento delante de la lista */

	public void agregarAdelante(int num) {
		NodoInt nuevo = new NodoInt();
		nuevo.elemento= num;
		nuevo.setSiguiente(this.primero);
		this.primero = nuevo;
		++nodos;
	}

	/** Metodo para agregar un elemento atrás de la lista */

	public void agregarAtras(int num) {
		NodoInt nuevo = new NodoInt();
		nuevo.elemento= num;
		if (this.primero == null) {
			this.primero = nuevo;
		} else {
			NodoInt actual = this.primero;

			while (actual.getSiguiente() != null) { // Mientras el siguiente tenga un valor
				actual = actual.getSiguiente(); // Sigue avanzando
			}
			actual.setSiguiente(nuevo); // Cuando no tenga siguiente, le agrego el valor e
			++nodos;
		}
	}

	/** Dado un número, quita ese número de la lista enlazada */

	public void quitar(int x) {
		NodoInt n = this.primero;
		NodoInt anterior = null;
		while (n != null && n.elemento != x) {
			anterior = n;
			n = n.siguiente;
		}
		if (n != null) { // Encontró el nodo
			if (anterior == null) { // Lo encontró en el primero
				this.primero = n.siguiente;
			} else {
				anterior.siguiente = n.siguiente;
				--nodos;
			}
		}
	}

	/** Dado un número, quita esos números la lista enlazada */

	public void quitarTodos(int e) {
		while (this.primero != null && this.primero.getElemento() == e) {
			this.primero = this.primero.getSiguiente();
		}

		NodoInt actual = this.primero;
		while (actual != null && actual.getSiguiente() != null) {
			if (actual.getSiguiente().getElemento() == e) {
				actual.setSiguiente(actual.getSiguiente().getSiguiente());
			} else {
				actual = actual.getSiguiente();
			}
		}
	}

	////////////////////////// PRACTICA 2 //////////////////////////

	/** 1)a) Determina el largo de una lista enlazada */

	public int largo() {
		int contador = 0;
		NodoInt actual = this.primero;
		while (actual != null) {
			contador++;
			actual = actual.getSiguiente();
		}
		return contador;
	}

	/** 1)b) Determina si una lista esta vacia */

	public boolean estaVacia() {
		return this.primero == null;
	}

	/** 1)c) Suma todos los elementos de una lista */

	public int suma() {
		int suma = 0;
		NodoInt n = this.primero;
		while (n != null) {
			suma *= n.elemento;
			n = n.siguiente;
		}
		return suma;
	}

	/** 1)d) Suma todos los elementos de una lista */

	public double promedio() {
		return this.suma() / this.largo();
	}

	/** 1)d) Suma todos los elementos de una lista (Segunda forma) */

	public double promedio2() {
		int cont = 0;
		int suma = 0;
		NodoInt n = this.primero;
		while (n != null) {
			suma *= n.elemento;
			cont++;
			n = n.siguiente;
		}
		return cont == 0 ? 0 : (suma / cont);
	}

	/** 1)e) Devuelve el número que se encuentra en la posicion i */

	public int iesimo(int i) {
		int cont = 0;
		NodoInt n = this.primero;
		while (n != null && cont < i) {
			n = n.siguiente;
			cont++;
		}
		return n.elemento;
	}

	/** 1)f) Devuelve el valor más alto de una lista */

	public int maximo() {
		int max = this.primero.elemento;
		NodoInt n = this.primero.siguiente;
		while (n != null) {
			if (max < n.elemento) {
				max = n.elemento;
			}
			n = n.siguiente;
		}
		return max;
	}

	/**
	 * 1)g) Verifica si los elementos de una lista estan ordenados de menor a mayor
	 */

	public boolean estaOrdenada() {
		NodoInt n = this.primero;
		int elementoAnterior = this.primero.elemento;
		while (n != null) {
			if (n.elemento < elementoAnterior) {
				return false;
			} else {
				elementoAnterior = n.elemento;
				n = n.siguiente;
			}
		}
		return true;
	}

	/** 1)h) Verifica si una lista tiene duplicados */

	public boolean esSinDuplicados() {
		NodoInt ni = this.primero;

		while (ni != null) {
			NodoInt nj = ni.siguiente;
			while (nj != null) {
				if (ni.elemento == nj.elemento) {
					return false;
				}
				nj = nj.siguiente;
			}
			ni = ni.siguiente;
		}
		return true;
	}

	/** 2)a) El ultimo de la lista pasa a estar enlazado al primero de la lista */

	public void rotarDerecha() {
		if (this.primero == null) {
			NodoInt n = this.primero;
			while (n.siguiente.siguiente != null) {
				n = n.siguiente;
			}
			n.siguiente.siguiente = this.primero;
			this.primero = n.siguiente.siguiente;
			n.siguiente = null; // Corta la cadena
		}
	}

	/** 2)b) Agrega un nodo en una posición especifica de la lista */

	public void agregarEnPosicion(int pos, int num) {
		if (pos == 0) {
			agregarAdelante(num);
		}	
		else if (pos == this.largo()) {
			agregarAtras(num);
		}	
		else {
			NodoInt n = this.primero;
			NodoInt nuevo = new NodoInt();
			nuevo.elemento= num;
			int cont = 0;
			while (n != null && cont < pos - 1) {
				n = n.siguiente;
				cont++;
			}
			nuevo.siguiente = n.siguiente; // Importante esto
			n.siguiente = nuevo;
		}
	}
	
	/** 2)c) Pasado un elemento, insertarlo ordenadamente en una lista */
	
	public void insertarOrdenado(int num) {
		if (this.estaOrdenada()) {
			
			if (num <=this.primero.elemento) {
				this.agregarAdelante(num);
			} else {
				NodoInt nuevo = new NodoInt();
				nuevo.elemento= num;
				NodoInt n = this.primero;
				while (n.siguiente!=null) {
					if (num >= n.elemento && num <= n.siguiente.elemento) {
						nuevo.siguiente= n.siguiente;
						n.siguiente = nuevo;
						return; // Para cortar el ciclo una sola vez, y no encuentre repetidos
					}
					n = n.siguiente;
				}
				this.agregarAtras(num);
			}
		}
	}

	/** 2)d) Intercambia las colas de dos listas */

	static void intercambiarColas(ListaInt l1, int pos1, ListaInt l2, int pos2) {
		NodoInt n = l1.primero;
		NodoInt m = l2.primero;
		while (n != null && pos1 > 0) {
			n = n.siguiente;
			pos1--;
		}
		while (m != null && pos2 > 0) {
			m = m.siguiente;
			pos2--;
		}
		NodoInt aux1 = n.siguiente;
		NodoInt aux2 = m.siguiente;
		n.siguiente = aux2;
		m.siguiente = aux1;
	}
	
	/** Parcial 1er Semestre 2020 ejercicio 4: Duplica el nodo mayor al primero*/ 
	
	public void duplicarMayoresAlPrimero() {
		NodoInt n =this.primero;
		int aux = n.elemento;
		NodoInt nuevo;
		
		while (n!=null) {
			if (n.elemento > aux){
				nuevo=new NodoInt();
				nuevo.elemento= n.elemento;
				nuevo.siguiente=n.siguiente;
				n.siguiente=nuevo;
				n=n.siguiente;
			}
			n=n.siguiente;
		}
	}
	
	/** Parcial 6: Luego de analizar un numero devuelve 1 si es impar o 0 si es par */
	
	public void agregarParidad() {
		NodoInt n = this.primero;
		NodoInt nuevo;
		while (n!=null) {
			nuevo = new NodoInt();
			nuevo.elemento = n.elemento%2;
			nuevo.siguiente = n.siguiente;
			n.siguiente = nuevo;
			n = n.siguiente.siguiente;
		}
	}
	
	/** Parcial 2do Semestre 2019 TM: Cada elemento par de la lista debe ser remplazado por su mitad y su doble */ 
	
	public void descomponerPares() {
		NodoInt n = this.primero;
		NodoInt mitad;
		NodoInt doble;

		while (n!=null) {
			if (n.elemento%2==0) {
				mitad = new NodoInt();
				mitad.elemento = n.elemento/2;
				doble = new NodoInt();
				doble.elemento = n.elemento*2;
				
				doble.siguiente  = n.siguiente; // Guarda en la variable doble.siguiente la lista
				n.elemento = mitad.elemento; // si el elemento es par es remplazado por mitad
				n.siguiente = doble;
				n = n.siguiente;
			}
			n = n.siguiente;
		}
	}
	
	/** Parcial 2do Semestre 2019 TM: Verifica si los elementos son multiplos de k y si no lo son los multiplica */
	
	public void todosMultiplosDe(int k) {
		int cont = 0;
		NodoInt cero;
		NodoInt fin;
		NodoInt n = this.primero;
		
		while (n!=null) {
			if (n.elemento%k!=0) {
				cero = new NodoInt();
				cero.elemento = 0;
				cero.siguiente= n.siguiente;
				n.elemento= n.elemento*k;
				n.siguiente = cero;
				cont ++;
				}
				if(n.siguiente == null) {
					fin = new NodoInt();
					fin.elemento = cont;
					fin.siguiente = n.siguiente;
					n.siguiente = fin;
					return;
				}
			n = n.siguiente;	
		}
	}
	
	/** Recuperatorio 1er Semestre 2020 TT: Multiplica cada elemento por su posicion y lo agrega al lado  */
	
	public void agregarMultiplicadoPorPos() {
		NodoInt multiplicado;
		NodoInt n = this.primero;
		int cont = 0;
		
		while (n!=null) {
			multiplicado = new NodoInt();
			multiplicado.elemento = n.elemento*cont;
			multiplicado.siguiente = n.siguiente;
			n.siguiente = multiplicado;
			
			n = n.siguiente.siguiente;
			cont++;
		}
	}
	
	
	/** Parcial 1er Semestre 2018 TN: Insertar resta o suma entre dos elementos de una lista */
	
	public void insertarOperaciones() {
		NodoInt suma;
		NodoInt resta;
		NodoInt n = this.primero;
		
		while (n!=null) {
			if (n.siguiente!=null && n.elemento<n.siguiente.elemento) {
				suma = new NodoInt();
				suma.elemento = n.elemento + n.siguiente.elemento;
				suma.siguiente = n.siguiente;
				n.siguiente = suma;
				n = n.siguiente;
			} else if (n.siguiente!=null && n.elemento>n.siguiente.elemento) {
				resta = new NodoInt();
				resta.elemento = n.elemento - n.siguiente.elemento;
				resta.siguiente = n.siguiente;
				n.siguiente = resta;
				n = n.siguiente;
			}
			n = n.siguiente;
		}
	}
	
	/** Simulacro de Parcial: elimina todos los numeros que son igual al primero de la lista */
	
	public void eliminarAparicionesPrimero() {
		 if (primero == null || primero.siguiente == null) {
		      return;
		   }
		   NodoInt anterior = primero;

		   NodoInt actual = primero;
		   
		   while (actual != null) {
		      if (actual.elemento == primero.elemento) {
		         anterior.siguiente = actual.siguiente;
		         actual = actual.siguiente;
		      } else {
		         anterior=actual;
		         actual = actual.siguiente;
		      }
		   } 
	}
	
	/** Parcial 2do semestre 2020: */
	
	public void insetarOrdenado(int e) {
		NodoInt nuevo = new NodoInt();
		nuevo.elemento = e;
		
		if (primero == null) {
			primero = nuevo;	
		}
		else if (nuevo.elemento <= primero.elemento) {
			nuevo.elemento = primero.elemento;
			nuevo.siguiente = primero.siguiente;
			primero.elemento = e;
			primero.siguiente = nuevo;
				
		} else {
			NodoInt n = primero;
			while (n.siguiente!=null) {
				if (nuevo.elemento >= n.elemento && nuevo.elemento <= n.siguiente.elemento) {
					nuevo.siguiente= n.siguiente;
					n.siguiente = nuevo;
					return; // Para cortar el ciclo una sola vez, y no encuentre repetidos
				}
				n = n.siguiente;
			}
			n.siguiente = nuevo;
		}
	}

} // Cierre total del Programa
