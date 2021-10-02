package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
	List<Usuario> lista = new ArrayList<>();
	
	lista.add(new Usuario("allyson"));
	lista.add(new Usuario("Bruno"));
	lista.add(new Usuario("De"));
	lista.add(new Usuario("Freitas"));
	lista.add(new Usuario("Fernandes"));
	
	// pegando o indice
	System.out.println(lista.get(lista.size() - 1).nome);
	System.out.println();
	
	//remove
	lista.remove(2); // De
	
	for (Usuario usuario : lista) {
		System.out.println(usuario);
	}
	
	
	}
}
