package codigoFonte;

import java.util.ArrayList;
import codigoFonte.heranca.Pessoa;

public class Cliente extends Pessoa{
	private int id_cliente;
	private double saldo_cliente;
	@SuppressWarnings("unused")
	private ArrayList<Produto> prod_cliente ; //pq o cliente pode comprar varios produtos
	@SuppressWarnings("unused")
	private ArrayList<Cliente> servico_cliente ; // pq o cliente pode comprar varios servicos
    @SuppressWarnings("unused")
	private ArrayList<Gerente> gerente_responsavel; // pq o cliente pode ser cadastrado por varios gerente com acesso ao sistema
    
	public Cliente(int id_cliente,String nome, String cpf,String telefone, String email) {
		this.setId_cliente(id_cliente);
		this.setNome((nome == "" || nome == null ? "Sem nome" : nome));
		this.setCpf((cpf == "" || cpf == null ? "Sem nome" : cpf));
		this.setTelefone((telefone == "" || telefone == null ? "Sem nome" : telefone));
		this.setEmail((email == "" || email == null ? "Sem nome" : email));
		this.setSaldo_cliente(0.0);
		prod_cliente = new ArrayList<>();
		servico_cliente = new ArrayList<>();
		gerente_responsavel = new ArrayList<>();
	}
	
	public int getId_cliente() {
		return this.id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public double getSaldo_cliente() {
		return this.saldo_cliente;
	}

	public void setSaldo_cliente(double saldo_cliente) {
		this.saldo_cliente = saldo_cliente;
	}
}
