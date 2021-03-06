package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 700;
		
		Produto p = new Produto("Notebook", 3000.00, 0.15);
		System.out.println(isCaro.test(p));
	}
}
