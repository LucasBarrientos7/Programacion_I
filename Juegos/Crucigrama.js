
public class Juego_Crucigrama {

	static boolean puedenColocarse(String a, String b, String c){
		int i=0;
		while (i < b.length())
		{	//analizar a
			if ( a.indexOf(b.charAt(i))==-1){
				i++;
				}
				else
				{
					i+=2;
					//analizar c
					while (i < b.length()){
						if(c.indexOf(b.charAt(i))==-1){
							i++;
						}
						else
							return true;
					}
				}
		}
		return false;
	}

	public static void main(String[] args) {
		String a="jugo";
		String b="bueno";
		String c="anana";
		System.out.println(puedenColocarse(a,b,c) );
		String aa="pepe";
		String bb="pepito";
		String cc="pepa";
		System.out.println(puedenColocarse(aa,bb,cc) );
		aa="meme";
		bb="pepe";
		cc="pipa";
		System.out.println(puedenColocarse(aa,bb,cc) );
	}
