
public class Main {

	public static void main(String[] args) {

		/** Objeto Fecha */
//		Fecha f = new Fecha(1, 5, 2000); // Constructor
//		f.imprimir();
//		System.out.println(f.esBisiesto());

		/** Objeto Fracción */
//		Fraccion j = new Fraccion(3, 9); // Constructor
//		j.getNumerador();

		/** Objeto Punto */
//		Punto p = new Punto(240, 240); // Constructor
//		Punto o = new Punto(290, 290);
//		p.imprimir('a');

		/** Objeto Circulo */
//		Circulo c = new Circulo(100, 300, 300); // Constructor
//		c.imprimir();

		/** Objeto Dibujador */
//		Dibujador dib1 = new Dibujador(600, 800);
//		Circulo c1 = new Circulo(300, 300, 50);
//		Circulo c2 = new Circulo(0, 0, 250);
//		dibujarCirculos(dib1, 100, 100, 100);

		/** Objeto Imagen */
//		Imagen foto = new Imagen("bm.jpg");  // Crea un objeto tipo imagen
//		Dibujador.dibujar(foto);				//imprime la imagen en pantalla
//		//foto.aumentarBrillo(-100);;
//		foto.girarDerecha();
//		Dibujador.dibujar(foto);

//		System.out.println(foto.pixels[20][25].rojo);	// Imprimimos el color del pixel de la posicion
//		System.out.println(foto.pixels[20][25].azul);	// Imprimimos el color del pixel de la posicion
//		System.out.println(foto.pixels[20][25].verde);	// Imprimimos el color del pixel de la posicion

		/** Objeto Persona */
//		Persona grupo[] = new Persona[4];
//		grupo[0] = new Persona("Batman", 28);
//		grupo[1] = new Persona("BATMAN", 28);
//		grupo[2] = new Persona("Wonder Woman", 25);

//		System.out.println(grupo[2].masJovenQue(grupo[1]));
//		System.out.println(grupo[0].tocayo(grupo[1]));
//		System.out.println(grupo[0].mismaPersona(grupo[1]));
//		System.out.println(grupo[2]);
//		System.out.println(masJovenGrupo(grupo));
//		grupo[2].setNombre("Hawkgirl");
//		System.out.println(grupo[2]);

	} // Cierre del Main

////////////////////////////// METODOS ESTATICOS //////////////////////////////

	/** Realiza un patrón de circulos */

	public static void dibujarCirculos(Dibujador dib, int x, int y, int r) {
		if (r <= 10) {
			return;
		}
		Circulo c = new Circulo(x, y, r);
		dib.dibujar(c);
		dibujarCirculos(dib, x + r, y, r / 2);
		dibujarCirculos(dib, x + r, y, r / 2);
		dibujarCirculos(dib, x, y - r, r / 2);
		dibujarCirculos(dib, x, y - r, r / 2);
	}

	/** Determina la persona más joven dentro de un arreglo de objetos tipo Persona */

	public static Persona masJovenGrupo(Persona[] arreglo) {
		Persona masjoven= arreglo[0];
		for (int i=1; i<arreglo.length;i++) {
			if (arreglo[i].getEdad()> masjoven.getEdad()) {
				masjoven =arreglo[i];
			}
		}
		return masjoven;
	}

} // Cierre total del programa
