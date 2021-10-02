package Campeonato_Futebol;

public class JogadorAtacante {
	private String nomeJogador;
	private int idade;
	private int habilidade;
	private int gols;
	private int camisa;
	private int velocidade;
	private int tecnica;
	
	JogadorAtacante(String nome, int idade, int habilidade, int velocidade, int tecnica, int camisa){
		this.setNomeJogador(nome);
		this.setIdade(idade);
		this.setHabilidade(habilidade);
		this.setVelocidade(velocidade);
		this.setTecnica(tecnica);
		this.setCamisa(camisa);
		this.gols = 0;
	}
	
	@Override
	public String toString() {
		return " nomeJogador = " + this.nomeJogador + 
				",\n idade = " + this.idade + 
				",\n habilidade = " + this.habilidade
				+ ",\n gols = " + this.gols + 
				",\n camisa = " + this.camisa + 
				",\n velocidade = " + this.velocidade + 
				",\n tecnica = " + this.tecnica +
				"\n";
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getHabilidade() {
		return (((this.habilidade*5) + (this.velocidade*2) + (this.tecnica*3))/10);
	}

	public void setHabilidade(int habilidade) {
		this.habilidade = habilidade;
	}

	public int getGols() {
		return gols;
	}

	public void SomaGols() {
		this.gols++;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getTecnica() {
		return tecnica;
	}

	public void setTecnica(int tecnica) {
		this.tecnica = tecnica;
	}
	
	
}
