
public class MainPrueba {

	public static void main(String[] args) {

		UNGS uni= new UNGS();
		uni.agregarComision("Programacion 1", 3);
		uni.agregarComision("Programacion 2", 1);
		uni.agregarComision("Programacion 3", 2);

//		uni.comisiones[0].agregarDocente("Leonardo", 25);
//		uni.comisiones[0].agregarDocente("Cesar", 23);
//
//		uni.comisiones[0].agregarEstudiante("Pepe", 123, 8);
//		uni.comisiones[0].agregarEstudiante("Jose", 456, 7);
//		uni.comisiones[0].agregarEstudiante("Ivan", 678, 6);

		uni.comisiones[2].agregarDocente("Javier", 23);
		uni.comisiones[2].agregarEstudiante("Pppp", 123, 8);
		uni.comisiones[2].agregarEstudiante("Jjjj", 456, 7);
		uni.comisiones[2].agregarEstudiante("Iiii", 678, 6);

		Docente d = new Docente("Ivo",1234);
		Docente f = uni.comisiones[2].getDocentes()[0];


		Estudiante e = uni.comisiones[2].getInscriptos()[2];

		System.out.println(uni.cursaCon(e, f));








	} // Cierre del Main

} // Cierre total del Programa
