
//Dada una string ver si existen 2 substring capicuas
public class Juego_StringCapicua {

	static boolean doblete(String s){
		int cantIni=cantApariciones(s, s.charAt(0));
		int contLet=1;
		String subS1="";
		subS1=subS1+s.charAt(0);
		String subS2="";
		int i=1;
		boolean marca=false;
		if (cantIni == 1){
			i=0;
			marca=true;
		}
		if (!marca){
			for( i=1;i<s.length();i++){
				if (s.charAt(i)==s.charAt(0) ){
					contLet++;
					subS1=subS1+s.charAt(i);
					if (esCapicua(subS1) && contLet == cantIni){
						marca=true;
						break;
					}
				}
				subS1=subS1+s.charAt(i);
			}
		}
		// continuo si encontre ya una substring capicua
		if (marca){
			for(int j= i+1;j<s.length();j++){
				subS2=subS2+s.charAt(j);
			}
			if  (!esCapicua(subS2) ){
				marca=false;
			}
		}
		return marca;
	}

	static boolean esCapicua(String c){
		String nueva="";
		for (int i=c.length()-1; i>=0;i--){
			nueva +=c.charAt(i);
		}
		return (c.equals(nueva));
	}

	static int cantApariciones(String a, char b){
		int cont=0;
		for (int i=0; i < a.length();i++){
			if (a.charAt(i)==b){
				cont++;
			}
		} return cont;
	}

	public static void main(String[] args) {
		String s="anana";
		String o="oro";
		s+=o;
		System.out.println(s+" "+doblete(s));
		s="banana";
		System.out.println(s+" "+doblete(s));
		s="eter";
		System.out.println(s+" "+doblete(s));
		s="sanas";
		System.out.println(s+" "+doblete(s));
		s="nunca";
		System.out.println(s+" "+doblete(s));
	}
}
