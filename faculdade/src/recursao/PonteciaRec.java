package recursao;

public class PonteciaRec {
	public static int potenciaRec(int base, int potencia ) {
//		if(potencia == 0)return 1;
//		else if(base == 0) return 0;
//		else return base * potenciaRec(base, potencia - 1);
		return ( potencia == 0 ?  1 : (base == 0 ?  0 :  base * potenciaRec(base, potencia - 1)));
	}
}
