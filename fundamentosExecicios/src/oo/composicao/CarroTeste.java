package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Carro();
		
		c.ligar();
		System.out.println(c.isLigado());
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		System.out.println(c.motor.giros());
		
		c.freiar();
		c.freiar();
		c.freiar();
		c.freiar();
		
		System.out.println(c.motor.giros());
	}
	
	
}
