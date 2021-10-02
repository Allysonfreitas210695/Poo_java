package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuario = new HashMap<>();
		usuario.put(1, "Allyson");
		
		usuario.put(2, "jose");
		
		System.out.println(usuario.size());
		System.out.println(usuario.isEmpty());
		
		System.out.println();
		System.out.println("Chaves");
		System.out.println(usuario.keySet());
		System.out.println(usuario.values());
		System.out.println(usuario.entrySet());
		
		System.out.println(usuario.containsKey(1));
		System.out.println(usuario.containsValue("Allyson"));
		
		System.out.println(usuario.get(1));
		
		for(int chave: usuario.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuario.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuario.entrySet()) {
			System.out.print(registro.getKey()+" ");
			System.out.println(registro.getValue());
		}
	}
}
