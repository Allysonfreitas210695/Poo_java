package oo.composicao.heranca;

public class Heroi extends Jogador {
	
	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataca1 = super.atacar(oponente);
		boolean ataca2 = super.atacar(oponente);
		boolean ataca3 = super.atacar(oponente);
		
		return ataca1 || ataca2 || ataca3;
	}
}
