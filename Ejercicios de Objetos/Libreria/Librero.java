import java.util.Arrays;

public class Librero {

	Libro [] libros;

	public Librero(Libro[] libros) {
		super();
		this.libros = libros;
	}

	public Libro[] getLibros() {
		return libros;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Librero [libros=" + Arrays.toString(libros) + "]";
	}

}
