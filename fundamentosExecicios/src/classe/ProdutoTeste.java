package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.desconto = 12.50;
		p1.nome = "notebook";
		p1.preco = 3500.50;
		
		System.out.println(p1.desconto);
	}

}
