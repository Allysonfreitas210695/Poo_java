package arrayList;

import java.util.Scanner;

public class CompanhiaArea {
	public static void main(String[] args) {
		boolean poltrona[] = new boolean[10];
		String classe[] = new String[10];
		int contPrimeira = 0, verificarPrimeiro = 0;
		int contEconomica = 0, verificarEconomico = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0;i < poltrona.length; i++) {
			poltrona[i] = false;
		}
		
		int op;
		opcaoDeVoo();
		op = ler.nextInt();
		
		while(op == 1 || op == 2) {
			if(op == 1) {
				int opcaoPoltrona;
				System.out.println("Digite a Poltrona de 1 a 5: ");
				opcaoPoltrona = ler.nextInt();
				for(int i = 0;i <= 4; i++) {
					if(!poltrona[i] && (i == opcaoPoltrona-1)) {
						poltrona[i] = true;
						classe[i] = "Primeira classe";
						System.out.println("Poltrona vendida com sucesso!");
						contPrimeira++;
					}
				}
				
				verificarPrimeiro++;
				
				if(contPrimeira == 5 && !verificarPosicoes(poltrona, 0, 4) && verificarPrimeiro > 5) {
					System.out.println("voce deseja ir para classe economica? ");
					ler.nextLine();
					String res = ler.nextLine();
					if(res.equalsIgnoreCase("Sim")) {
						for(int j = 5; j <= 9; j++ ) {
							if(!poltrona[j]) {
							poltrona[j] = true;
							System.out.println("Voce foi colocado na poltrona "+(j+1));
							classe[j] = "Primeira classe";
							break;
							}
						}
					}
					if(!verificarPosicoes(poltrona, 5, 9)) {
						System.out.println("O próximo voo parte em 3 horas");
					}
				}
			}
			if(op == 2) {
				int opcaoPoltrona;
				System.out.println("Digite a Poltrona de 6 a 10: ");
				opcaoPoltrona = ler.nextInt();
				for(int i = 5;i <= 9; i++) {
					if(!poltrona[i] && (i == opcaoPoltrona-1)) {
						poltrona[i] = true;
						classe[i] = "Classe Econômica";
						System.out.println("Poltrona vendida com sucesso!");
						contEconomica++;
					}
				}
				
				verificarEconomico++;
				
				if(contEconomica == 5 && !verificarPosicoes(poltrona, 0, 4) && verificarEconomico > 5) {
					System.out.println("voce deseja ir para Primeira Classe? ");
					ler.nextLine();
					String res = ler.nextLine();
					if(res.equalsIgnoreCase("Sim")) {
						for(int j = 0; j <= 4; j++ ) {
							if(!poltrona[j]) {
							poltrona[j] = true;
							System.out.println("Voce foi colocado na poltrona "+(j+1));
							classe[j] = "Primeira classe";
							break;
							}
						}
					}
					if(!verificarPosicoes(poltrona, 0, 4)) {
						System.out.println("O próximo voo parte em 3 horas");
					}
					
				}
				
			}
			if(contEconomica == 5 && contPrimeira == 5) {
				System.out.println("Nao há mais vagas!!");
			}

			opcaoDeVoo();
			op = ler.nextInt();
		}
		
		System.out.println();
		
		imprimirPosicoes(poltrona, classe);
		
		System.out.println("Programa Encerrado!!");
		
		ler.close();
	}
	
	public static void imprimirPosicoes(boolean[] p,String[] s ) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(int i = 0; i < 10; i++) {
		  System.out.printf("Passageiro %d\n",i+1);
		  System.out.println(s[i]);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	public static boolean verificarPosicoes(boolean[]v, int inicio, int fim) {
		boolean res = false;
		for(int i = inicio; i <= fim; i++) {
			if(!v[i]) {
				res = true;
			}
		}
		return res;
	}
	
	public static void opcaoDeVoo() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("              Opcao de voo           ");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("1- Primeira Classe");
		System.out.println("2- Classe Econômica");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
}
