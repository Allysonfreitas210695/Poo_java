package codigoFonte;

public class Servico {
	private int id_servico;
	private String nome_servico;
	private double preco_servico;
    @SuppressWarnings("unused")
	private Gerente gerente; //servico pode ser cadastrado por um unico gerente!
	
    public Servico(int id, String nome, double preco) {
    	this.setId_servico(id);
    	this.setNome_servico(nome);
    	this.setPreco_servico(preco);
    }
    
	public int getId_servico() {
		return this.id_servico;
	}
	
	public void setId_servico(int id_servico) {
		this.id_servico = id_servico;
	}
	
	public String getNome_servico() {
		return this.nome_servico;
	}
	
	public void setNome_servico(String nome_servico) {
		this.nome_servico = nome_servico;
	}
	
	public double getPreco_servico() {
		return this.preco_servico;
	}
	
	public void setPreco_servico(double preco_servico) {
		this.preco_servico = preco_servico;
	}
}
