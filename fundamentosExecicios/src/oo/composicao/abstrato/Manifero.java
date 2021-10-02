package oo.composicao.abstrato;

public abstract class Manifero extends Animal{
	@Override
	public String respirar() {

		return "pela agua!";
	}
	
	@Override
	public String mover() {
		
		return "Usando as patas";
	}
	
	public abstract String mama();
	
}
