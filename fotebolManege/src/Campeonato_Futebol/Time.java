package Campeonato_Futebol;


import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome;
	private List<JogadorAtacante> jogadorAtac;
	private List<JogadorDefesa> jogadorDef;
	private List<JogadorGoleiro> jogadorGol;
	private int vitorias;
	private int derrota;
	private int empate;
	
	Time(String time){
		this.setNome(time);
		jogadorAtac = new ArrayList<>();
		jogadorDef = new ArrayList<>();
		jogadorGol = new ArrayList<>();
	}
	
	Time(){
		
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getResultados() {
		return "Vitorias: "+this.vitorias+", Empates: "+this.empate+", Derrotas: "+this.derrota;
	}
	
	public void imprimeJogades() {
		
		for(JogadorGoleiro gol: jogadorGol) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Time: "+this.nome);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("         GOLEIRO          ");
			System.out.println(gol);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
		}
		
		for(JogadorDefesa def: jogadorDef) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Time: "+this.nome);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("         DEFENSOR          ");
			System.out.println(def);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
		}
		
		for(JogadorAtacante atac: jogadorAtac) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Time: "+this.nome);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("         ATACANTE          ");
			System.out.println(atac);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
		}
	}
	
	public int getEmpate() {
		return this.empate;
	}

	public void somaEmpate() {
		this.empate++;
	}

	public int getVitoria() {
		return this.vitorias;
	}

	public void somaVitorias() {
		this.vitorias++;
	}

	public int getDerrota() {
		return this.derrota;
	}

	public void somaDerrota() {
		this.derrota++;
	}
	
	public void insJogador(Object pJog) {
		if(pJog instanceof JogadorAtacante) {
			jogadorAtac.add((JogadorAtacante) pJog);
		}else if(pJog instanceof JogadorDefesa) {
			jogadorDef.add((JogadorDefesa) pJog);
		}else if(pJog instanceof JogadorGoleiro){
			jogadorGol.add((JogadorGoleiro) pJog);
		}else{
			System.err.println("Objeto invalido");
		}
	}
	
}
