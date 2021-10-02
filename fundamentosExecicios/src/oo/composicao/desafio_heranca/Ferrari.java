package oo.composicao.desafio_heranca;

public class Ferrari extends Carro{
	
	public Ferrari(){
		this(350);
	}
	
	public Ferrari(int velocidade){
		super(velocidade);
		this.delta = 15;
	}
	
//	@Override
//	public void acelerar() {
//		if(this.velocidadeAtual > 0) {
//			this.velocidadeAtual += 15;
//		}else {
//			this.velocidadeAtual = 0;
//		}
//	}
//	
//	@Override
//	public void frear() {
//		if(this.velocidadeAtual > 0 || this.velocidadeAtual <= 15) {
//			this.velocidadeAtual -= 15;
//		}else {
//			this.velocidadeAtual = 0;
//		}
//	}
}
