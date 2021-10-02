package arrayList;

import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nome;
	private String telefone;
	private int idade;
	private ArrayList<Cliente> cli;
	
	public Cliente() {
		cli = new ArrayList<>();
	}
	
	public Cliente(int id, String nome, int idade, String telefone) {
		this.setId(id);
		this.setNome(nome);
		this.setIdade(idade);
		this.setTelefone(telefone);
	}
	
	public void addArraylist(Cliente c) {
		cli.add(c);
	}
	
	public void imprimirCliente() {
		for(Cliente c: cli) {
			System.out.println("<<<< Dados do clinte >>>>");
			System.out.println("ID: "+c.getId());
			System.out.println("NOME: "+c.getNome());
			System.out.println("IDADE: "+c.getIdade());
			System.out.println("TELEFONE: "+c.getTelefone());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
	
	public int tamanhoCadastro() {
		return cli.size();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
