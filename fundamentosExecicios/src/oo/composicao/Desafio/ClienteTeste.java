package oo.composicao.Desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente x = new Cliente("Allyson Bruno de Freitas Fernandes");
		
		Compra c = new Compra();
		c.addItem("Caneta", 9.90, 10);
		
		x.compras.add(c);
		
		System.out.println(c.totalCompra());
	}

}
