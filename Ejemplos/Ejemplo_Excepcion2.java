
public class Ejemplo_Excepcion2 {

	public static void main(String[] args) {

		try
		{
			System.out.println(caracterMasRepetido(""));

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static int cantidadApariciones(String s, char c)
	{
		int cantidad = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c)
				cantidad++;
		}

		return cantidad;
	}

	public static char caracterMasRepetido(String s)
	{
		if(s.length() == 0)
			throw new RuntimeException("La cadena no puede ser vacÃ­a!");

		char masRepetido = s.charAt(0);
		int max = cantidadApariciones(s, s.charAt(0));;

		for (int i = 1; i < s.length(); i++) {
			int cantidad = cantidadApariciones(s, s.charAt(i));
			if(max < cantidad)
			{
				masRepetido = s.charAt(i);
				max = cantidad;
			}
		}

		return masRepetido;
	}

}
