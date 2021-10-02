package Campeonato_Futebol;

public class JogadorDefesa {
	private String nomeJogador;
	private int idade;
	private int habilidade;
	private int gols;
	private int camisa;
	private int cobertura;
	private int desarme;
	
	JogadorDefesa(String nome, int idade, int habilidade, int desarme, int cobertura, int camisa){
		this.setNomeJogador(nome);
		this.setIdade(idade);
		this.setHabilidade(habilidade);
		this.setDesarme(desarme);
		this.setCobertura(cobertura);
		this.setCamisa(camisa);
		this.gols = 0;
	}
	
	
	
	@Override
	public String toString() {
		return " nomeJogador = " + 
	            this.nomeJogador + ",\n idade = " + 
				this.idade + ",\n habilidade = " + 
	            this.habilidade + ",\n gols = " + 
				this.gols + ",\n camisa = " + 
	            this.camisa + ",\n cobertura = " + 
				this.cobertura + ",\n desarme = " + 
	            this.desarme + "\n";
	}



	public String getNomeJogador() {
		return this.nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getHabilidade() {
		return (((this.habilidade*5) + (this.cobertura*3) + (this.desarme*2))/10);
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
		return this.camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	public int getCobertura() {
		return this.cobertura;
	}

	public void setCobertura(int cobertura) {
		this.cobertura = cobertura;
	}

	public int getDesarme() {
		return this.desarme;
	}

	public void setDesarme(int desarme) {
		this.desarme = desarme;
	}
	
	
}
