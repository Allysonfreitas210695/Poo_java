package lacoRepeticao;

public class Serie {
	private int n1,n2,n3;
	
	public Serie(int n1,int n2,int n3) {
		this.setN1(n1);
		this.setN2(n2);
		this.setN3(n3);
	}
	
	public void imprimeSerie(int numero) {
		System.out.printf("%d ",this.getN1());
		for(int i = 1; i < numero;  i++) {
			this.setN2((this.getN1() + this.getN3()) * this.getN2());
		
		}
	}

	public int getN1() {
		return this.n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return this.n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return this.n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}
	
	
}
