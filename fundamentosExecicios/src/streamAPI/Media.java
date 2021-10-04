package streamAPI;

public class Media {
	private double total;
	private int qtd;
	
	public Media adicionar(double valor) {
		this.total += valor;
		this.qtd++;
		return this;
	}
	
	public double getValor() {
		return this.total / this.qtd;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.qtd = m1.qtd + m2.qtd;
		return resultante;
	}
	
}
