package oo.composicao.polimofismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.5);
		
		Feijao ingrediente1 = new Feijao(0.100);
		Arroz ingrediente2 = new Arroz(1.500);
		
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente1);
		
		System.out.println(convidado.getPeso());
	}
	
}
