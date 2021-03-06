package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		Produto p1 = new Produto("Lapis", 1.99, 0.12, 0);
		Produto p2 = new Produto("cardeno", 15.99, 0.10, 25);
		Produto p3 = new Produto("notebook", 2.99, 0.13, 29);
		Produto p4 = new Produto("caneta vermelha", 2.99, 0.13, 30);
		Produto p5 = new Produto("ipad", 3100, 0.09, 0);
		Produto p6 = new Produto("Relogio", 1900, 0.32, 0);
		Produto p7 = new Produto("monitor",800, 0.31, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<Produto> isDesconto = p -> p.desconto >= 0.3;
		Predicate<Produto> isfrenteGratis = p -> p.valorFrente == 0;
		Predicate<Produto> isRelevante = p -> p.preco >= 500;
		Function<Produto, String> result = p -> "O produto "+ p.nome +" ta custando "+ p.preco+ " com frente "+ p.valorFrente; 
		
		produtos.stream()
		.filter(isDesconto)
		.filter(isfrenteGratis)
		.filter(isRelevante)
		.map(result).forEach(System.out::println);
	}
}
