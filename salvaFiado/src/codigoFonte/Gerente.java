package codigoFonte;

import java.util.ArrayList;
import codigoFonte.heranca.Pessoa;

public class Gerente extends Pessoa{
	private int id_gerente;
	private String login;
	private String senha;
	private boolean statusSenhaLogin = false;
	private ArrayList<Produto> produto; // pq o gerente pode cadastra varios produtos
	private ArrayList<Cliente> cliente ; // pq o gerente pode cadastra varios clientes
	private ArrayList<Servico> servico; // pq o gerente pode cadastra varios servicos
	
	public Gerente(int id,String nome, String cpf, String telefone, String email, String senha, String login) {
		this.setId_gerente(id);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setTelefone(telefone);
		this.setEmail(email);
		this.setSenha(senha);
		this.setLogin(login);
		produto = new ArrayList<>();
		cliente = new ArrayList<>();
		servico = new ArrayList<>();
	}
	
	public void VerificacionSenhaLogin() {
		if(this.getLogin().equals(this.getSenha())) {
			this.setStatusSenhaLogin(!this.getStatusSenhaLogin());
		}
	}
	
	public void showGerente() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.printf("                  Gerente %s                     \n",this.getNome());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("ID: "+this.getId_gerente());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("EMAIL: "+this.getEmail());
		System.out.println("TELEFONE: "+this.getTelefone());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	public void cadastraCliente(Cliente c) {
		if(c != null) {
			this.cliente.add(c);
		}
	}
	
    public void cadastraProduto(Produto p) {
		if(p != null) {
			produto.add(p);
		}
	}
    
    public void cadastraServico(Servico s) {
		if(s != null) {
			servico.add(s);
		}
	}
    
    public void visualizarCliente() {
    	System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    	System.out.println(">>>>>>>>>>>>>>>> CLIENTES   <<<<<<<<<<<<<<<");
    	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    	
		for(Cliente cli: cliente) {
			System.out.println("Id: "+cli.getId_cliente());
			System.out.println("nome: "+cli.getNome());
			System.out.println("Cpf: "+cli.getCpf());
			System.out.println("Telefone: "+cli.getTelefone());
			System.out.println("Email: "+cli.getEmail());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
	
    public void visualizarProdutos() {
		for(Produto p: produto) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("ID do Produto: "+p.getId_produto());
			System.out.println("NOME do Produto: "+p.getNome_produto());
			System.out.println("PRE??O do Produto: "+p.getPreco_unitario());
			System.out.println("QUANTIDADE do Produto: "+p.getQuantidade());
			System.out.println("MODELO do Produto: "+p.getModelo());
			System.out.println("MARCA do Produto: "+p.getMarca());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
    
    public void visualizarServicos() {
    	for(Servico s: servico) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("ID do Servi??o: "+s.getId_servico());
			System.out.println("NOME do Servi??o: "+s.getNome_servico());
			System.out.println("PRE??O do Produto: "+s.getPreco_servico());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
    
    public void atualizarCliente() {
		
   	}
   	
    public void atualizarProduto() {
   		
   	}
       
    public void atualizarServico() {
   		
   	}

    public void deletarCliente(int id) {
		cliente.remove(id);
   	}
   	
    public void deletarProduto(int id) {
   		produto.remove(id);
   	}
       
    public void deletarServico(int id) {
   		servico.remove(id);
   	}
    
	public int getId_gerente() {
		return id_gerente;
	}
	
	public void setId_gerente(int id_gerente) {
		this.id_gerente = id_gerente;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean getStatusSenhaLogin() {
		return this.statusSenhaLogin;
	}

	public void setStatusSenhaLogin(boolean statusSenhaLogin) {
		this.statusSenhaLogin = statusSenhaLogin;
	}
	
}
