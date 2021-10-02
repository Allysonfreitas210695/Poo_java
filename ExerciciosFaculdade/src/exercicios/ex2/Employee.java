package exercicios.ex2;

public class Employee {
	private String nome;
	private String sobreNome;
	private double salarioMensal;
	
	public void updateAtributes(String nome, String sobreNome, double salario) {
		if(nome != null && sobreNome != null && nome != "" && sobreNome != "") {
			this.setNome(nome);
			this.setSobreNome(sobreNome);
			this.setSalarioMensal((salario < 0 ? 0.0 : salario));
		}else {
			System.out.println("variaveis invalidas!!!");
			System.exit(1);
		}
	}
	
	public void salaryIncrease() {
		System.out.println("Salario com Aumento: "+(this.salarioMensal + (this.salarioMensal - (this.salarioMensal * (1 - 0.10)))));
	}
	
	public void show() {
		System.out.println("Nome: "+this.getNome() + "\nSobrenome: "+this.getSobreNome() + "\nSalario Mensal: "+this.getSalarioMensal());
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return this.sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public double getSalarioMensal() {
		return this.salarioMensal;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
}
