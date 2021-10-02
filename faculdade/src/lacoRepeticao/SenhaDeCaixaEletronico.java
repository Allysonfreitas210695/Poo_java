package lacoRepeticao;

import java.util.Scanner;

public class SenhaDeCaixaEletronico {
	private int senha;
	
	public SenhaDeCaixaEletronico(int senha) {
	  this.setSenha(senha);
	}
	
	public void verificationAcess() {
		int contAcess = 0, senha = 0;
		Scanner leitor = new Scanner(System.in);
		
		
		while(senha != this.senha && contAcess < 3) {
			System.out.print("Senha da sua Conta: ");
			senha = leitor.nextInt();
			if(senha != this.senha) {
				if(contAcess < 2) {
					System.out.println("Senha invalida!!, digite novamente, por favor");
				    contAcess++;
				}else {
					System.out.println("SISTEMA BLOQUEADO!!");
					contAcess++;
				}
			}
			if(contAcess == 3 || this.senha == senha){
				System.out.println((this.senha == senha ? "Senha Valida!" : (contAcess == 3 ? "Sua Senha foi bloqueada" : "Senha Valida!")));
			}
			System.out.println("");
		}
		
		leitor.close();
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
