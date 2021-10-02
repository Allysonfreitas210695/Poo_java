package operadoresLogico;

public class DesafioAritmetrico {

	public static void main(String[] args) {
		double p1 = Math.pow(6*(3+2), 2) / (double) 6;
		double p2 = Math.pow(((1-5)*(2-7)/2), 2);
		double resultado = Math.pow((p1 - p2), 3) / Math.pow(10,3);
		
		System.out.println(resultado);
	}

}
