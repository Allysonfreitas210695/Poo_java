package br.com.devbru.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Tabuleiro implements CampoObservador{
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();
    private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();
    
	
	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarosVizinhos();
		sortearAsMinas();
	}
	
	public void paraCada(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}
	
	public void registraObservadores(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(boolean resposta) {
		observadores.stream().forEach(o -> o.accept(new ResultadoEvento(resposta)));
	}
	
	public void abrir(int linha, int coluna) {
			campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.abrir());
	}
	
	
	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
		.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
		.findFirst()
		.ifPresent(c -> c.alternarMarcacao());
	}
	
	private void gerarCampos() {
		//linha 
		for(int i = 0; i < this.linhas;i++) {
			//colunas
			for(int j = 0; j < this.colunas; j++) {
				Campo campo = new Campo(i , j);
				campo.registraObservador(this);
				campos.add(campo);
			}
		}
		
			
	}
	
	private void associarosVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
		
	}
	
	  private void sortearAsMinas() {
		  long minasArmadas = 0;
			Predicate<Campo> minado = c -> c.isMinado();
			
			do {
				int aleatorio =(int) (Math.random() * campos.size());
				campos.get(aleatorio).minar();
				minasArmadas = campos.stream().filter(minado).count();
			}while(minasArmadas < this.minas);
		}
		
		public boolean objetivoAlcancado() {
			return campos.stream().allMatch(c -> c.objetivoAlcancado());
		}
		
		
		public void reniciarTabuleiro() {
			campos.stream().forEach( c -> c.reniciar());
			sortearAsMinas();
		}
	
		@Override
		public void eventoOcorreu(Campo campo, CampoEvento evento) {
			if(evento == CampoEvento.EXPLODIR) {
				mostrarMinas();
				notificarObservadores(false);
			}else if(objetivoAlcancado()) {
				notificarObservadores(true);
			}
		}
		
		private void mostrarMinas(){
			campos
			.stream()
			.filter(c -> c.isMinado())
			.forEach(c -> c.setAberto(true));
		}

		public int getLinhas() {
			return linhas;
		}

		public void setLinhas(int linhas) {
			this.linhas = linhas;
		}

		public int getColunas() {
			return colunas;
		}

		public void setColunas(int colunas) {
			this.colunas = colunas;
		}
		
}
