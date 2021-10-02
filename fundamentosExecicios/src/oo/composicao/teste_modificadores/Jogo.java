package oo.composicao.teste_modificadores;

import oo.composicao.heranca.Heroi;
import oo.composicao.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		System.out.println("Vida do jogador Heroi: "+heroi.vida);
		System.out.println("Vida do jogador Monstro: "+monstro.vida);
	}
}
