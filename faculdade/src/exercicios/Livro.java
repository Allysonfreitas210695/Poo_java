package exercicios;

public class Livro {
	private String nomeLivro;
	private int totalPaginas;
	private int pageAtual;
	private boolean status = false;
	
	public String ShowMessege() {
		return "Livro [nomeLivro = " + this.getNomeLivro() + ", "
				+ "totalPaginas = " + this.getTotalPaginas() + ", "
				+ "pageAtual = " + this.getPageAtual()
				+ ", status = " + (this.getStatus() ? "Livro aperto" : "Livro fechado") + "]";
	}
    
	Livro(){
		// por padrao o java colocar isso como default ou seja por padrao 
		// quando vc instacia uma class 
		
		/*
		 * Livro L1 = new Livro()-> esse é o construtor que vem assim por padrao,
		 * mas vc pode fazer esse construtor recebe argumentos como o construtor de Baixo 
		 * */
	}
	
	// La no main vc pode tanto chamar assim passando argumentos agora, como sem pq coloquei em cima sem nada tbm
	//mas se vc criar um construtor assim com parametros e nao fizer como construtor emcima vai apresenta erro la no main
	Livro(String nome, int total, int pageAtual){
		this.setNomeLivro(nome);
		this.setTotalPaginas(total);
		this.setPageAtual(pageAtual);
		this.setStatus();
	}
	
	public void passarPagina() {
		if(this.status && this.pageAtual <= this.getTotalPaginas() && this.getTotalPaginas() != 0) {
			this.setPageAtual(this.getPageAtual() + 1);
		}
	}
	
	public String getNomeLivro() {
		return this.nomeLivro;
	}
	
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	
	public int getTotalPaginas() {
		return this.totalPaginas;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		if(totalPaginas < 0 || totalPaginas == 0) {
			System.out.println("Livro sem Conteudo!");
		    this.setTotalPaginas(0);
		}else {
			this.totalPaginas = totalPaginas;
		}
	}
	
	public int getPageAtual() {
		return this.pageAtual;
	}
	
	public void setPageAtual(int pageAtual) {
		this.pageAtual = pageAtual;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus() {
		this.status = !this.status;
	}
	
	
}
