package br.com.devbru.cm;

import br.com.devbru.cm.modelo.Tabuleiro;
import br.com.devbru.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
	}
}
