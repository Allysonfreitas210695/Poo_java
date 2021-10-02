package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<>(); //somente valores strings
		lista.add("Allyson");
		lista.add("Bruno");
		lista.add("Freitas");
		lista.add("fernandes");
		
		for (String listaAprovado : lista) {
			System.out.println(listaAprovado);
		}
	}
}
