
public class Cliente {

	// Variables de Instancia:
	private String nombre;
	private int edad;
	private int dni;
	private double peso;
	private double altura;
	private char sexo;

	/** Constructor Objeto Persona sin parametros */

	public Persona() {
		this.setNombre("Humano 01");
		this.setEdad(17);
		this.setDni(10000001);
		this.setAltura(1.50);
		this.setPeso(100);
		this.setSexo('m');
	}

	/** Constructor Objeto Persona con cuatro parametros */

	public Persona(String nombre, int edad, int dni, char sexo) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setDni(dni);
		this.setAltura(1.75);
		this.setPeso(100);
		this.setSexo(sexo);
	}

	// Metodos de Instancia:

	/** Permite obtener el nombre */

	public String getNombre() {
		return nombre;
	}

	/** Permite cambiar el nombre si cumple la validación */

	public void setNombre(String nombre) {
		if (nombre.length() > 3 || nombre.length() <= 100) {
			this.nombre = nombre;
		}
	}

	/** Permite obtener la edad */

	public int getEdad() {
		return edad;
	}

	/** Permite cambiar la edad si cumple la validación */

	public void setEdad(int edad) {
		if (edad >= 0 || edad <= 130) {
			this.edad = edad;
		}
	}

	/** Permite obtener el DNI */

	public int getDni() {
		return dni;
	}

	/** Permite cambiar el DNI si cumple la validación */

	public void setDni(int dni) {
		if (dni >= 10000000 && dni <= 99999999) {
			this.dni = dni;
		}
	}

	/** Permite obtener el peso */

	public double getPeso() {
		return peso;
	}

	/** Permite cambiar el peso si cumple la validación */

	public void setPeso(double peso) {
		if (peso > 0 && peso < 600) {
			this.peso = peso;
		}
	}

	/** Permite obtener la altura */

	public double getAltura() {
		return altura;
	}

	/** Permite cambiar la altura si cumple la validación */

	public void setAltura(double altura) {
		if (altura > 0.50 && altura < 3) {
			this.altura = altura;
		}
	}

	/** Permite obtener el sexo */

	public char getSexo() {
		return sexo;
	}

	/** Permite cambiar el sexo si cumple la validación */

	public void setSexo(char sexo) {
		if (Character.toLowerCase(sexo) == 'm' || Character.toLowerCase(sexo) == 'f') {
			this.sexo = sexo;
		}
	}

	/** Calcula el promedio de la altura con el peso */

	public int calcularIMC() {
		double imc = this.getPeso() / this.getAltura() / this.getAltura();
		if (imc < 20) {
			return -1;
		} else if (imc >= 20 && imc <= 25) {
			return 0;
		} else {
			return 1;
		}
	}

	/** Traduce el valor IMC de una persona */

	public String traducirIMC() {
		if(this.calcularIMC()==-1) {
			return "Bajo Peso";
		} else if (this.calcularIMC()==0) {
			return "Peso Normal";
		} else {
			return "Sobrepeso";
		}
	}


	/** Retorna un valor booleano si es mayor de edad */

	public boolean esMayorEdad() {
		return this.getEdad() >= 18;
	}

	/** Imprime todos los datos del Objeto Persona */

	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", altura=" + altura
				+ ", sexo=" + sexo + "]";
	}

	/** Devuelve el correspondiente CUIL de un DNI */

	public String generarCUIL() {
		String aux;
		if (this.getSexo()=='m') {
			aux ="20-";
		} else {
			aux = "27-";
		}
		return aux + this.getDni()+ "-" + this.getDni()%10;
	}

} // Cierre total del programa
