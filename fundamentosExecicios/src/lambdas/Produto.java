package lambdas;

import java.text.DecimalFormat;

public class Produto {
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.#");
		String dx = df.format(this.preco * (1 - this.desconto));
		
		return "nome " + this.nome + " tem o valor de R$ " + dx;
	}
}
