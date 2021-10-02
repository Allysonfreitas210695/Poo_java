package exercicios;

public class Empregado {
	String nome;
	String departamento;
	double horasTrabalhadasNoMes;
	double salarioPorHora;
	

	public String mostraDados() {
		return "Empregado [nome=" + this.nome + ", departamento=" + this.departamento + ", horasTrabalhadasNoMes="
				+ this.horasTrabalhadasNoMes + ", salarioPorHora=" + this.salarioPorHora + "]";
	}

	public void calculaSalarioMensal(){
		if("Diretoria".toLowerCase().equals(this.departamento.toLowerCase())) {
			double result = (this.horasTrabalhadasNoMes * this.salarioPorHora);
			double salarioTotal = result + (result * 10/100);
			System.out.println("Salario com o Bonus é: "+salarioTotal);
		}else {
			System.out.println("Salario: "+(this.horasTrabalhadasNoMes * this.salarioPorHora));
		}
	}
}
