package codigoFonte;

public class Produto {
	private int id_produto;
	private String nome_produto;
	private double preco_unitario;
	private int quantidade;
	private String modelo;
	private String marca;
	
//	@SuppressWarnings("unused")
//	private ArrayList<Gerente> gerente_responsavel; //pq o produto podera ser cadastrado por qualquer gerente 
	
	@SuppressWarnings("unused")
	private Cliente cliente; //pq o produto so pode ser comprado por um unico cliente
	
	public Produto(int id,String nome,double preco,int qtd,String modelo,String marca) {
		this.setId_produto(id); // fazer tratamento no id depois
		this.setNome_produto((nome == "" || nome == null ? "erro no modelo" : nome));
		this.setPreco_unitario((preco < 0 ? 0.0 : preco));
		this.setQuantidade((qtd < 0 ? 0 : qtd));
		this.setModelo((modelo == "" || modelo == null ? "erro no modelo" : modelo));
		this.setMarca((marca == "" || marca == null ? "erro no modelo" : marca));
//		gerente_responsavel = new ArrayList<>();
	}
	
	public int getId_produto() {
		return this.id_produto;
	}
	
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	
	public String getNome_produto() {
		return this.nome_produto;
	}
	
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	
	public double getPreco_unitario() {
		return this.preco_unitario;
	}
	
	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
