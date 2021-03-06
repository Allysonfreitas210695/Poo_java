package codigoFonte.testeClasses;

import codigoFonte.Cliente;
import codigoFonte.Gerente;
import codigoFonte.Produto;
import codigoFonte.Servico;

public class Teste {
	public static void main(String[] args) {
		Gerente g = new Gerente(1, "Allyson", "110.913.874-19", "84 998138643", "alisonfr83@gmail.com", "12345", "12345");
		g.showGerente();
		
		g.cadastraCliente(new Cliente(1,"jose","123.123.123-45","98 999922222","jose@gmail.com"));
		g.cadastraCliente(new Cliente(2,"flavio","123.100.111-11","98 988811111","Flavio@gmail.com"));
		g.visualizarCliente();
		
		System.out.println();
		g.cadastraProduto(new Produto(1, "Pneu", 37.00, 20, "moto", "Pirelli"));
		g.cadastraProduto(new Produto(2, "Cama de ar", 30.00, 10, "moto", "Pirelli"));
		g.visualizarProdutos();
		
		System.out.println();
		g.cadastraServico(new Servico(1, "Calibar pneu",4.00));
		g.cadastraServico(new Servico(2, "ajeita caixa de direcao",20.00));
		g.visualizarServicos();
	}
	
}
