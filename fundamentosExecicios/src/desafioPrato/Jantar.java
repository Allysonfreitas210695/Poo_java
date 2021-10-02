package desafioPrato;

public class Jantar {

	public static void main(String[] args) {
		Comida c1 = new Comida("arroz",1.500);
		Pessoa p1 = new Pessoa("Allyson", 85.400);
		p1.comer(c1);
		System.out.println(p1.nome+" "+p1.peso);
	}

}
