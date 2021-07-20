public class Ejemplo_RemplazarLetraString {

	/**
	 * Devuelve un string que es igual a la palabra recibida
	 * salvo que donde habia un caracter c1 ahora hay un
	 * caracter c2.
	 */
	static String reemplazar(String palabra, char c1, char c2)
	{
		String nueva = "";
		for (int i = 0; i < palabra.length(); i++)
		{
			if (palabra.charAt(i) == c1)
				nueva = nueva + c2;
			else
				nueva = nueva + palabra.charAt(i);
		}

		return nueva;
	}

	public static void main(String[] args)
	{
		System.out.println(reemplazar("banana", 'a', 'o'));
	}

}
