package streamAPI;

public class Aluno {
	private String nome;
	private float nota;
	private boolean comportamento;
	

	public Aluno(String nome, float nota, boolean comp) {
		this.nome = nome;
		this.nota = nota;
		this.comportamento = comp;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome = " + nome + ", nota = " + nota + "] ";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public boolean isComportamento() {
		return comportamento;
	}

	public void setComportamento(boolean comportamento) {
		this.comportamento = comportamento;
	}
}
