package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Allyson"));
		usuarios.add(new Usuario("Bruno"));
		usuarios.add(new Usuario("Freitas"));
		
		boolean result = usuarios.contains(new Usuario("Allyson"));
		
		System.out.println(result);
	}
}
