package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = valor -> System.out.println(valor.nome);
		
		Produto p1 = new Produto("Monitor Lg", 890, 0.1);
		Produto p2 = new Produto("notebook", 2290, 0.12);
		Produto p3 = new Produto("mouse", 30, 0.08);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
