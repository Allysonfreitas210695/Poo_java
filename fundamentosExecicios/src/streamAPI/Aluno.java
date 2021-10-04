package streamAPI;

public class Aluno {
	private String nome;
	private double nota;
	private boolean comportamento;
	
	
	public Aluno(String nome, double nota, boolean comp) {
		this.nome = nome;
		this.nota = nota;
		this.comportamento = comp;
	}
	
	public Aluno(String nome, double nota) {
		this(nome,nota,true);
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

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public boolean isComportamento() {
		return comportamento;
	}

	public void setComportamento(boolean comportamento) {
		this.comportamento = comportamento;
	}
}
