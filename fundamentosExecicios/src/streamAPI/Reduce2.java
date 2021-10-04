package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Allysin", 8);
		Aluno a2 = new Aluno("bruno", 7);
		Aluno a3 = new Aluno("silva", 9);
		Aluno a4 = new Aluno("fernando", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> isAprovado = (a) -> a.getNota() >= 7;
		Function<Aluno, Double> sum = n -> n.getNota();
		BinaryOperator<Double> acumulador = (ac, n) -> ac + n;
		
//		float n = alunos.stream()
//		.filter(isAprovado)
//		.map(sum)
//		.reduce(acumulador)
//		.get();
		
	    alunos.stream()
		.filter(isAprovado)
		.map(sum)
		.reduce(acumulador)
		.ifPresent(System.out::println);
	}
}
