package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Allyson");
		Aluno aluno2 = new Aluno("jose");
		Curso curso1 = new Curso("Artes");
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("<<< Estou no curso 1 >>> "+curso1.nome);
			System.out.println(aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso busca = aluno1.obterCurso("Artes");
		
		if(busca != null) {
			System.out.println(busca.nome);
			System.out.println(busca.alunos);
		}
	}
}
