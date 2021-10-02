package oo.composicao.teste_modificadores;

import oo.composicao.desafio_heranca.Carro;
import oo.composicao.desafio_heranca.Ferrari;
import oo.composicao.desafio_heranca.Mercedez;

public class TesteDrive {

	public static void main(String[] args) {
		Carro c1 = new Ferrari(32);
		c1.velocidadeAtual = 20;
		c1.acelerar();
		System.out.println(c1.toString());
		
		Carro c2 = new Mercedez();
		c2.velocidadeAtual = 10;
		c2.acelerar();
		System.out.println(c2.toString());
	}

}
