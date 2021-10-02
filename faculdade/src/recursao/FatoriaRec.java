package recursao;

public class FatoriaRec {

	public static int verificarNumero(int num) {
		int r = 1;
		
		for(int i = num;i >= 1;i--) {
			r *= i;
		}
		
		return r;
	}
	
	public static int fatoriaRec(int numero) {
		String ver = "";
		if(numero == 0) {
			return 1;
		}else {
			int r = verificarNumero(numero);
			ver += "\n Fatorial de "+numero+" é " + String.valueOf(r);
			System.out.println(ver);
			return numero * fatoriaRec(numero - 1);
		}
	}
	
}
