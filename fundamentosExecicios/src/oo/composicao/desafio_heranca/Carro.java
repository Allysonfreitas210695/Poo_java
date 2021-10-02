package oo.composicao.desafio_heranca;

public class Carro {
	public double velocidadeAtual;
	final int VELOCIDADE_MAX;
	int delta = 5;
	
	protected Carro(int velocidade){
		this.VELOCIDADE_MAX = velocidade;
	}
	
	public void acelerar() {
		if(this.velocidadeAtual + delta > VELOCIDADE_MAX) {
			this.velocidadeAtual = VELOCIDADE_MAX;
		}else {
			this.velocidadeAtual += delta;
		}
	}

	public void frear() {
		if(this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		}else {
			this.velocidadeAtual = 0;
		}
		
	}

	@Override
	public String toString() {
		return "velocidadeAtual = " + velocidadeAtual + "";
	}
	
	
}
