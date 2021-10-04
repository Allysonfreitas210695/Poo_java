package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Allysin", 8);
		Aluno a2 = new Aluno("bruno", 6);
		Aluno a3 = new Aluno("silva", 6);
		Aluno a4 = new Aluno("fernando", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> isAprovado = 
			    (a) -> a.getNota() >= 7;
			    
		Function<Aluno, Double> sum = 
				n -> n.getNota();
				
	    BiFunction<Media, Double, Media> calculaMedia = 
	    		(media, nota) -> media.adicionar(nota);
	    		
	    BinaryOperator<Media> combinarMedia = 
	    		(m1, m2) -> Media.combinar(m1, m2);
	    		
		Media media = alunos.stream()
		.filter(isAprovado)
		.map(sum)
		.reduce(new Media(), calculaMedia, combinarMedia);
		
		System.out.println(media.getValor());
	}
}
