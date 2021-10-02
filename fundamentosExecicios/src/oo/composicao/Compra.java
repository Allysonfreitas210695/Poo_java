package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	String nomeCliente;
	List<Item> itens = new ArrayList<>();
	
	
	public void showMassege() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Nome do Cliente: "+this.nomeCliente);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("Lista de itens:");
		
		for(Item i: itens) {
			System.out.print("Produto: "+i.nome);
			System.out.print("| Quantidade: "+i.qtd);
			System.out.print("| Preco: "+i.preco);
			System.out.println();
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Valor total!");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("R$ "+this.getValorTotal());
		
	}
	
	public double getValorTotal() {
		double total = 0.0;

		for(Item i: itens) {
			total += i.preco;
		}
		
		return total;
	}
	
}
