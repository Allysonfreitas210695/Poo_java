package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		
		c1.nomeCliente = "Allyson Bruno";
		c1.itens.add(new Item("Arroz", 10, 9.00));
		c1.itens.add(new Item("Carne", 1, 32.00));
		c1.itens.add(new Item("Coxa", 10, 25.00));
		
		c1.showMassege();
	}
}
