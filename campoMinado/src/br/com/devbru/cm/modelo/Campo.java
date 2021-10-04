package br.com.devbru.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.devbru.cm.excecao.ExplocaoExcecao;

public class Campo {
	private final int linha;
	private final int coluna;
	
	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	public Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = this.linha != vizinho.linha;
		boolean colunaDiferente = this.coluna != vizinho.coluna;
		boolean diagonal =  linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		
		int deltaGeral = deltaLinha + deltaColuna;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else {
			return false;
		}
	}
	
	public void alternarMarcacao() {
		if(!this.aberto) {
			this.marcado = !this.marcado;
		}
	}
	
	public boolean abrir() {
		if(!this.aberto && !this.marcado) {
			this.aberto = true;
			
			if(this.minado) {
				throw new ExplocaoExcecao();
			}
			
			if(vizinhoSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean vizinhoSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	public boolean isMarcado() {
		return this.marcado;
	}
	
	public void minar() {
		this.minado = true;
	}
	
	public boolean isMinado() {
		return this.minado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean isAberto() {
		return this.aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	public boolean objetivoAlcancado() {
		boolean desvenda = !this.minado && this.aberto;
		boolean protegido = this.minado && this.marcado;
		
		return desvenda || protegido;
	}
	
	public long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	public void reniciar() {
		this.aberto = false;
		this.minado = false;
		this.marcado = false;
	}
	
	public String toString() {
		if(this.marcado) {
			return "X";
		}else if(this.aberto && this.minado) {
			return "*";
		}else if(this.aberto && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		}else if(this.aberto){
			return " ";
		}else {
			
			return "?";
		}
	}
}
