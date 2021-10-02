package streamAPI;

public class Produto {
	final String nome;
	final double preco;
	final double desconto;
	final double valorFrente;
	
	public Produto(String nome, double preco, double desconto, double valorFrente) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.valorFrente = valorFrente;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", desconto=" + desconto + ", valorFrente=" + valorFrente
				+ "]";
	}

	
	
	
}
