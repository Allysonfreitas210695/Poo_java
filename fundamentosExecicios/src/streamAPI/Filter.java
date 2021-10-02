package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Consumer<Aluno> print = System.out::print;
		
		Aluno a1 = new Aluno("Ana", 7.8f,false);
		Aluno a2 = new Aluno("Ana", 6.f,true);
		Aluno a3 = new Aluno("Ana", 5.f,true);
		Aluno a4 = new Aluno("Ana", 8.f,true);
		Aluno a5 = new Aluno("Ana", 5.f,false);
		Aluno a6 = new Aluno("Ana", 5.f,true);
		Aluno a7 = new Aluno("Ana", 9.9f,true);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		Predicate<Aluno> isAprovado = a -> a.getNota() >= 7.0;
		Predicate<Aluno> isCompotarmento = a -> a.isComportamento();
		
		alunos.stream()
		.filter(isAprovado)
		.filter(isCompotarmento)
		.forEach(print);;
		
	}
}
