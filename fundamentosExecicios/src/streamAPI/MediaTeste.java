package streamAPI;

public class MediaTeste {
	public static void main(String[] args) {
		Media m1 = new Media().adicionar(7).adicionar(7);
		
		System.out.println(m1.getValor());
	}
}
