
public class Main {

	public static void main(String[] args) {
		Autor a1 = new Autor("Isabel", "Allende", "isabela@gmail.com", 'l');
		Autor a2 = new Autor("Mary", "Shelley", "joaneee@gmail.com", 'i');
		Autor a3 = new Autor("Victor", "Hugo", "hugooo@gmail.com", 'f');

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		Capitulo c1 = new Capitulo("Capitulo 1",25,a2);
		Capitulo c2 = new Capitulo("Capitulo 2",25,a2);
		Capitulo c3 = new Capitulo("Capitulo 3",25,a2);
		Capitulo [] capitulos = {c1,c2,c3};

		Libro book = new Libro (a2,"Amante",capitulos);

	} // Cierre del Main

} // Cierre total del programa
