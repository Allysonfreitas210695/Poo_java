package excecao;

import streamAPI.Aluno;

public class Basico {
	
	public static void main(String[] args) {
		Aluno a1 = null;
		
		try {
			imprimirNomeAluno(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro aqui " + e);
		}
		
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro aqui " + e);
		}
		
		System.out.println("Fim :)");
	}
	
	public static void imprimirNomeAluno(Aluno a) {
		System.out.println(a.getNome());
	}
}
