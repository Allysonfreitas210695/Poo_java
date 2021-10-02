package oo.composicao.desafio_heranca;

public class Mercedez extends Carro{
	
	public Mercedez() {
		super(300);
	}
	
	@Override
	public void acelerar() {
		if(this.velocidadeAtual > 0) {
			this.velocidadeAtual += 10;
		}else {
			this.velocidadeAtual = 0;
		}
	}
	
	@Override
	public void frear() {
		if(this.velocidadeAtual > 0 || this.velocidadeAtual <= 10) {
			this.velocidadeAtual -= 10;
		}else {
			this.velocidadeAtual = 0;
		}
	}
	
}
