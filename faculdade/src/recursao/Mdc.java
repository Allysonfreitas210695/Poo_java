package recursao;

public class Mdc {
	public static int mdcRec(int n, int m) {
		if(m == 0) {
			return n;
		}else {
			return mdcRec(m, n%m);
		}
	}
}
