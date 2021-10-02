package fundamentos;


public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double temp = 32;
		final double div = 5 / 9.0f;
	    final double fahrenheit = 86;
		
		double Celsius = (fahrenheit - temp) * div;
		
		System.out.println("O resultado é "+Celsius+"C°");
	}

}
