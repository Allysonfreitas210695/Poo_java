package exercicios;

public class ContaBancariaSimples {
	//Valore atributos direta e somente nas classes! se por caso vc criar uma variavel local obrigatoriamente vc tera que atribuir!
	
	private String nomeDoCorrestista; // por default variavel vem com valor NULL para string
	private double saldo; // por default variavel vem com valor 0.0
	private boolean contaEspecial; // por default variavel vem com valor FALSE
	
	public void abreConta(String nome, double deposito) {
		if(deposito < 0) {
			this.saldo = 0;
		}else {
			this.saldo = deposito;
		}
		this.nomeDoCorrestista = nome;
		this.setContaEspecial(!false);
	}
	
	public void abreContaSimples(String nome) {
		this.nomeDoCorrestista = nome;
		this.saldo = 2000;
		this.setContaEspecial(false);
	}
	
	public String getNomeDoCorrestista() {
		return nomeDoCorrestista;
	}
	
	public void setNomeDoCorrestista(String nomeDoCorrestista) {
		this.nomeDoCorrestista = nomeDoCorrestista;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
		}
	}
	
	public void retirar(double valor) {
		if(valor < 0 || this.saldo == 0.0) {
			System.out.println("Saque nao permitido!");
		}else if(!this.contaEspecial && this.saldo > 0 &&  valor <= this.saldo) {
			System.out.println("conta Simples");
			this.setSaldo(this.getSaldo() - valor);
		}else {
			if(valor > 0 && valor <= this.saldo) {
				System.out.println("conta especial");
				this.setSaldo(this.getSaldo() - valor);
			}
		}
	}
	
	public void showMessege() {
		System.out.println("Nome: "+this.getNomeDoCorrestista()+
				" || Saldo: "+this.getSaldo()+
				" || Tipo de Conta: "
				+(
						this.getContaEspecial() ? 
						"Conta especial" 
						: "Simples"
				  )
				);
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getContaEspecial() {
		return this.contaEspecial;
	}
	
	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}
	
	
}
