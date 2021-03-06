package streamAPI;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Bia","jose","allyson");
		
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println("Aluno: "+aprovados.get(i));
		}
		
		System.out.println();
		System.out.println("Usando Foreach...");
		for(String nome: aprovados) {
			System.out.println("Aluno: "+nome);
		}
		
		System.out.println();
		System.out.println("Usando Iterator...");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
		
		System.out.println();
		System.out.println("Usando Stream...");
		Stream<String> str = aprovados.stream();
		str.forEach(System.out::println);
//		aprovados.forEach(nome -> System.out.println("nome: "+nome));
	}
}
