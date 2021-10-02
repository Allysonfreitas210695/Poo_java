package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//nao aceita repeticao de elementos
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		
		conjunto.add('x');
		
		//com repeticao nao acontecera nada tamanho continuar o mesmo com 5!
		conjunto.add("teste"); //linha 13 o mesmo elemento
		
		System.out.println("Tamanho real"+conjunto.size());
		
		//remove elementos
		conjunto.remove("teste");
		System.out.println("Tamanho agora é "+conjunto.size());
		
		if(conjunto.contains('x')) {
			System.out.println("Esta dentro!!");
		}else {
			System.out.println("Elemento nao presente!!");
		}
	}
	
}
