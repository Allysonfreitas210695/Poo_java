package oo.composicao.heranca;

public class Jogador {
	public int x;
	public int y;
	public int vida = 100;
	
	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(this.x  - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);
		
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		}else {
			return true;
		}
	}
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
		break;
		case LESTE:
			x++;
		break;
		case SUL:
			y++;
		break;
		case OESTE:
			x--;
		break;
		default:
			System.out.println("Invalido!!!");
		break;
		}
		return true;
	}
}
