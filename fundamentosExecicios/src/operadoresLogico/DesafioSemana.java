package operadoresLogico;

import java.util.Scanner;

public class DesafioSemana {

	public static void main(String[] args) {
//		final String se = "segunda";
//		final String tr = "Terça";
//		final String qua = "quarta";
//		final String qui = "quinta";
//		final String sex = "sexta";
//		final String sab = "sabado";
//		final String dom = "domingo";
//		
		Scanner leitor = new Scanner(System.in);
//		System.out.println("Digite o dia da semana: ");
//		String entrada = leitor.next();
//		
//		if(se.toUpperCase().equals(entrada.toUpperCase())) {
//			System.out.println('2');
//		}else if(tr.toUpperCase().equals(entrada.toUpperCase())) {
//			System.out.println('3');
//		}else if(qua.toUpperCase().equals(entrada.toUpperCase())) {
//			System.out.println('4');
//		}else if(qui.toUpperCase().equals(entrada.toUpperCase())) {
//			System.out.println('5');
//		}else if(sex.toUpperCase().equals(entrada.toUpperCase())) {
//			System.out.println('6');
//		}else if(sab.toUpperCase().equals(entrada.toUpperCase())) {
//			System.out.println('7');
//		}else if(dom.toUpperCase().equals(entrada.toUpperCase())) {
//			System.out.println('1');
//		}else {
//			System.out.println("dia invalido!!!");
//		}

		int count = 0;
		double total = 0.0;
		
		double inc = 0;
		
		while(inc != 1.0) {
			System.out.println("digite a noto por favor: ");
			inc = leitor.nextDouble();
			if(inc >= 0 && inc <= 10) {
				count++;
			    total += inc;
			}
			
		}
		System.out.println("total das notas: "+total);
		System.out.println("Programa finalizado!"+count);
		
		
		leitor.close();
	}

}
