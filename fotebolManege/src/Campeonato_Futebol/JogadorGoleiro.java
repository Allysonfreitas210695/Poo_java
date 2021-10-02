package Campeonato_Futebol;

public class JogadorGoleiro {
	private String nomeJogador;
	private int idade;
	private int habilidade;
	private int gols;
	private int camisa;
	private int reflexos;
	private float altura;
	
	JogadorGoleiro(String nome, int idade, int habilidade, int reflexos, float altura, int camisa){
		this.setNomeJogador(nome);
		this.setIdade(idade);
		this.setHabilidade(habilidade);
		this.setReflexos(reflexos);
		this.setAltura(altura);
		this.setCamisa(camisa);
		this.gols = 0;
	}
	
	
	
	@Override
	public String toString() {
		return " nomeJogador = " + 
	             this.nomeJogador + ",\n idade = " + 
				 this.idade + ",\n habilidade = " + 
	             this.habilidade + ",\n gols = " + 
				 this.gols + ",\n camisa=" + 
	             this.camisa + ",\n reflexos = " + 
				 this.reflexos + ",\n altura = " + 
	             this.altura + "\n";
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
		return (((this.habilidade*5) + (((int)(this.altura*100))*2) + (this.reflexos*3))/10);
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

	public int getReflexos() {
		return this.reflexos;
	}

	public void setReflexos(int reflexos) {
		this.reflexos = reflexos;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	
}
