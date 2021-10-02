package arraysCollections;

import java.util.Scanner;

public class DesafioNotas {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o total de nota: ");
		int qtd = leitor.nextInt();
		
		double[] vet = new double[qtd];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite a nota "+(i+1)+": ");
			vet[i] = leitor.nextDouble();
		}
		
		System.out.println("");
		
		for(double nota : vet) {
			System.out.print(nota + " ");
		}
		
		leitor.close();
	}

}
