
public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	/** Obtener el dia */

	public int getDia() {
		return dia;
	}

	/** Modificar el dia */

	public void setDia(int dia) {
		int diasMes = 0;
		int aux = this.mes;
		if (this.mes == 2) {
			diasMes = 28 + this.esBisiesto();
		} else {
			if (aux > 7) {
				aux--;
			}
			diasMes = 30 + aux % 2;
		}
		if (dia<1 || dia >diasMes) {
			throw new RuntimeException("El día "+ dia + " no es valido para el mes de " + this.mes);
		}
		this.dia = dia;
	}

	/** Obtener el mes */

	public int getMes() {
		return mes;
	}

	/** Modificar el mes */

	public void setMes(int mes) {
		if (mes < 1 || mes > 12) {
			throw new RuntimeException("No es un mes valido. El valor tiene que ser entre 1 al 12");
		}
		this.mes = mes;
	}

	/** Obtener el año */

	public int getAnio() {
		return anio;
	}

	/** Modificar el año */

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Fecha(String cadena) {
		if (cadena.equals("navidad")) {
			this.setAnio(2020);
			this.setMes(12);
			this.setDia(25);
		} else {
			this.setAnio(2000);
			this.setMes(1);
			this.setDia(1);
		}
	}

	/** el objeto Fecha no recibe parametros */

	public Fecha() {
		this.setAnio(2000);
		this.setMes(1);
		this.setDia(1);
	}

	/** el objeto Fecha recibe dos parametros */

	public Fecha(int dia, int mes) {
		this.setAnio(2000);
		this.setMes(mes);
		this.setDia(dia);
	}

	/** el objeto Fecha recibe tres parametros */

	public Fecha(int dia, int mes, int año) {
		this.setAnio(año);
		this.setMes(mes);
		this.setDia(dia);
	}

	/** Imprime en pantalla la fecha */

	void imprimir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
	}

	/** Verifica si la fecha es coherente */

	boolean fechaValida() {
		return false;
	}

	/** Avanza un dia */

	void avanzarDia() {
		if (this.dia < this.esBisiesto())
			this.dia++;
		else {
			this.dia = 1;
			if (this.mes < 12)
				this.mes++;
			else {
				this.mes = 1;
				this.anio++;
			}
		}
	}

	/** Calcula la diferencia entre dos fechas */

	int diasDeDiferenciaCon(Fecha otra) {
		Fecha f1, f2;
		if (this.esAntesQue(otra)) {
			f1 = new Fecha(this.dia, this.mes, this.anio);
			f2 = new Fecha(otra.dia, otra.mes, otra.anio);
		} else {
			f2 = new Fecha(this.dia, this.mes, this.anio);
			f1 = new Fecha(otra.dia, otra.mes, otra.anio);
		}
		int cantidad = 0;
		while (f1.esAntesQue(f2)) {
			cantidad++;
			f1.avanzarDia();
		}
		return cantidad;
	}

	/** Compara si una fecha es antes que otra fecha */

	boolean esAntesQue(Fecha otra) {
		if (this.anio < otra.anio)
			return true;
		if (this.anio == otra.anio && this.mes < otra.mes)
			return true;
		if (this.anio == otra.anio && this.mes == otra.mes)
			return this.dia < otra.dia;

		return false;
	}

	/** Determina si una fecha es un dia de Verano */

	boolean esVerano() {
		if (this.mes == 1 && this.mes == 2)
			return true;
		else if (this.mes == 12 && this.dia >= 21)
			return true;
		else if (this.mes == 3 && this.dia <= 21)
			return true;
		else
			return false;
	}

//	/** Ingresando el mes, determina cuantos dias tiene */
//
//	static int diasDelMes(int mes, int año) {
//		if (mes < 1 || mes > 12)
//			throw new RuntimeException("Valor de mes inválido!");
//		if (mes == 2) {
//			if (esBisiesto())
//				return 29;
//			else
//				return 28;
//		}
//		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
//			return 30;
//		return 31;
//	}

	/** Determina si un año es bisiesto */

	public int esBisiesto() {
		if (this.anio % 4 == 0 || this.anio % 100 != 0) {
			return 1;
		} else if (this.anio % 400 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

} // Cierre total del programa
