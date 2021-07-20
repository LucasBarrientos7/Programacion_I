
public class Ejemplo_SumaPilaDeEjecucion
{
	static int suma(int a, int b)
	{
		int c = a + b;
		return c;
	}

	static int dobleSuma(int a, int b, int c)
	{
		int d = suma(a,b);
		int e = suma(c,d);
		return e;
	}

	public static void main(String[] args)
	{
		int a = 1;
		int b = 3;
		int c = 2;

		int s = dobleSuma(a, b, c);
		System.out.println(s);
	}

}
