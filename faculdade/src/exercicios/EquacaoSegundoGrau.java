package exercicios;

public class EquacaoSegundoGrau {
	
	private double delta(double a, double b, double c) {
		double resultDelta = Math.pow(b, 2) - (4*a*c);
		if(resultDelta < 0) {
			return -1;
		}else {
			return resultDelta;
		}
	}
	
	
	public void bhaskara(double a, double b, double c) {
		if(delta(a, b, c) != -1 && a != 0) {
			double delta = Math.sqrt(delta(a, b, c));
			double x1 = (-b + delta) / (2*a);
			double x2 = (-b -delta) / (2*a);
			System.out.printf("X1 = %.5f\nX2 = %.5f",x1,x2);
		}else {
			System.out.println("Nao é possivel calcular as rais devido o Delta ser menor que 0!");
		}
	}
	
	
}
