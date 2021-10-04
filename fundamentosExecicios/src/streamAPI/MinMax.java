package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Allysin", 8);
		Aluno a2 = new Aluno("bruno", 7);
		Aluno a3 = new Aluno("silva", 9);
		Aluno a4 = new Aluno("fernando", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		Comparator<Aluno> melhor = (aluno1, aluno2) -> {
			if(aluno1.getNota() > aluno2.getNota()) return 1;
			if(aluno1.getNota() < aluno2.getNota()) return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhor).get());
	}
}
