package exercicios;

public class EmpregadoMostra {
	public static void main(String[] args) {
		//nessa classe que a principal por executar nota que nao tem segurança um codigo
		//pelo simples fato de qualque pessoa poder alterar as variaveis
		//por isso é importante o conceito de encapsulamento
		Empregado e = new Empregado();
		e.departamento = "diretoria";
		e.horasTrabalhadasNoMes = 100;
		e.nome = "Allyson";
		e.salarioPorHora = 12;
		
		e.calculaSalarioMensal();
		System.out.println(e.mostraDados());
	}
}
