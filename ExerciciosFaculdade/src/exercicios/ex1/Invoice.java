package exercicios.ex1;

public class Invoice {
	private String numero;
	private String descricao;
	private int qtdItemsComprados;
	private double precoItem;
	
	
	public boolean updateItems(String numero, String descricao, int qtdItemsComprados, double precoItem) {
		if(numero == null || descricao == null) {
			System.out.println("Umas das variaveis esta errada!");
			return false;
		}
			this.setNumero(numero);
			this.setDescricao(descricao);
			this.setQtdItemsComprados((qtdItemsComprados < 0 ? 0 : qtdItemsComprados));
			this.setPrecoItem((precoItem < 0 ? 0 : precoItem));
		
	
		return true;
	}

	public double getInvoiceAmount(boolean verificar) {
		return(verificar ? this.getPrecoItem() * this.getQtdItemsComprados() : 0.0);
	}

	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getDescricao() {
		return this.descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQtdItemsComprados() {
		return this.qtdItemsComprados;
	}


	public void setQtdItemsComprados(int qtdItemsComprados) {
		this.qtdItemsComprados = qtdItemsComprados;
	}


	public double getPrecoItem() {
		return this.precoItem;
	}


	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	
	
}
