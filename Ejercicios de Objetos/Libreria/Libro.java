import java.util.Arrays;

public class Libro {
	// Variables de Instancia:
	Autor autor;
	String titulo;
	Capitulo[] capitulos;

	/** Constructor Objeto Libro */

	public Libro(Autor autor, String titulo, Capitulo[] capitulos) {
		this.autor = autor;
		this.capitulos = capitulos;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String titulo) {
		this.titulo = titulo;
	}

	public Capitulo[] getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(Capitulo[] capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", capitulos=" + Arrays.toString(capitulos) + "]";
	}

} // Cierre total del programa
