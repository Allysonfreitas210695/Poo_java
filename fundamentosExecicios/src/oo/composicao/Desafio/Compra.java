package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();
	
	void addItem(Produto p, int qtd) {
		this.itens.add(new Item(p , qtd));
	}
	
	void addItem(String nome,double preco, int qtd) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto , qtd));	
	}
	
	double totalCompra() {
		double total = 0.0;
		
		for(Item item: itens) {
			total += item.qtd * item.prod.preco;
		}
		
		return total;
	}
}
