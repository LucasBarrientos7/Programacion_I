
public class Capitulo {
	// Variables de Instancia:
	String titulo;
	int numPagina;
	Autor autor;

	/** Constructor Objeto Capitulo */

	public Capitulo(String titulo, int numPagina, Autor autor) {
		this.titulo = titulo;
		this.numPagina = numPagina;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPagina() {
		return numPagina;
	}

	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Capitulo [titulo=" + titulo + ", numPagina=" + numPagina + ", autor=" + autor + "]";
	}

} // Cierre total del programa
