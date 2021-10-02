package oo.composicao;

public class Carro {
	Motor motor = new Motor();
	
	void acelerar() {
		if(this.motor.fatorInjecao < 2.6) {
			this.motor.fatorInjecao += 0.4;
		}
	}
	
	void freiar() {
		if(this.motor.fatorInjecao > 0.5) {
			this.motor.fatorInjecao -= 0.5;
		}
		
	}
	
	void ligar() {
		this.motor.ligado = true;
	}
	
	void desligar() {
		this.motor.ligado = false;
	}
	
	public boolean isLigado() {
		return this.motor.ligado;
	}
}
