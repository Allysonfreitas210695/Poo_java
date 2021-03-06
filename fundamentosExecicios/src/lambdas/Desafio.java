package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		
		Function<Produto, Double> precoAtual = 
				prod -> prod.preco * (1 - prod.desconto);
		
		UnaryOperator<Double> impostoMuncipal = 
				valor -> valor >= 2500 ? valor * 1.085 : valor;
		
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		
		UnaryOperator<Double> arredonda = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("iped", 2000.900, 0.1);
		
		String preco = precoAtual
				.andThen(impostoMuncipal)
				.andThen(frete)
				.andThen(arredonda)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(preco);
		/*
		 * 1. A parti do produto calcula o preco real com desconto
		 * 2. Imposto Municipal:  >= 2500 (8,5%) / < 2500(isento)
		 * 3. Frete: >= 3000(100)/ < 30000 (50)
		 * 4. arredondar: deixar duas casas decimais
		 * 5. Formatar: R$1234,54
		 * */
	}
}
