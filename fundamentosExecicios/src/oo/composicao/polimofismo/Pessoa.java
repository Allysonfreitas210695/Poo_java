package oo.composicao.polimofismo;

public class Pessoa {
   private double peso;
	
	public Pessoa(double peso) {
		this.setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;	
		}
	}
}