package exercicios;

public class LivroDeBiblioteca {

	public static void main(String[] args) {
		Livro l1 = new Livro("algoritmo de dados 2", 200, 10);	
		l1.passarPagina();
		
		System.out.println(l1.ShowMessege());
		
		l1.setStatus(); //fechar o livro aqui
		System.out.println(l1.ShowMessege());
		
		
	}

}
