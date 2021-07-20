
public class Autor {
	// Variables de Instancia:
	String nombre;
	String apellido;
	String email;
	char categoria;

	/** Constructor Objeto Autor */

	public Autor(String nombre, String apellido, String email, char categoria) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEmail(email);
		this.setCategoria(categoria);
	}

	/** Permite obtener el Nombre */

	public String getNombre() {
		return nombre;
	}

	/** Permite darle un valor al Nombre si cumple la validación */

	public void setNombre(String nombre) {
		if(nombre.length()<3 || nombre.length()>40) {
			throw new RuntimeException ("El nombre es invalido!");
		}
		this.nombre = nombre;
	}

	/** Permite obtener el Apellido */

	public String getApellido() {
		return apellido;
	}

	/** Permite darle un valor al Apellido si cumple la validación */

	public void setApellido(String apellido) {
		if(nombre.length()<2 || nombre.length()>40) {
			throw new RuntimeException ("El apellido es invalido!");
		}
		this.apellido = apellido;
	}

	/** Permite obtener el Email */

	public String getEmail() {
		return email;
	}

	/** Permite darle un valor a el Email si cumple la validación */

	public void setEmail(String email) {
		email= email.toLowerCase();
		String validador = "abcdefghijklmnopqrstuvwxyz.1234567890._-";
		int posArroba=email.indexOf('@');
		if (posArroba==-1) {
			throw new RuntimeException ("Email no valido: No tiene @");
		}
		String inicial = email.substring(0,posArroba);
		String fin = email.substring(posArroba+1, email.length());

		for (int i=0; i<inicial.length();i++) {
			if (validador.indexOf(inicial.charAt(i))==-1) {
				throw new RuntimeException ("Error: Contiene un caracter invalido");
			}

			if (validador.indexOf(fin.charAt(i))==-1) {
				throw new RuntimeException ("Error: Contiene un caracter invalido");
			}
		}
		if (inicial.charAt(0) == '*' || inicial.charAt(inicial.length()-1) == '*' || fin.charAt(0) == '*' || fin.charAt(inicial.length()-1) == '*') {
			throw new RuntimeException ("Error: El primer caracter no puede ser un punto");
		}
		this.email = email;
	}

	/** Permite obtener la Categoria */

	public char getCategoria() {
		return categoria;
	}

	/** Permite darle un valor a la Categoria si cumple la validación */

	public void setCategoria(char categoria) {
		if (categoria != 'f' &&categoria !=  'i'&&categoria != 'l') {
			throw new RuntimeException ("Error: La Categoria seleccionada no existe.");
		}
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", categoria=" + categoria
				+ "]";
	}

} // Cierre total del programa
