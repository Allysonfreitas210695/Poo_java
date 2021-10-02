package operadoresLogico;

import java.util.Scanner;

public class ModulosDesafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o Segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		String op = entrada.next();
		
		double result = "+".equals(op) ? num1 + num2 : 0;
		result = "-".equals(op) ? num1 - num2 : result;
		result = "*".equals(op) ? num1 * num2 : result;
		result = "/".equals(op) ? num1 / num2 : result;
		result = "%".equals(op) ? num1 / num2 : result;
		System.out.println(result);
		entrada.close();
	}

}
