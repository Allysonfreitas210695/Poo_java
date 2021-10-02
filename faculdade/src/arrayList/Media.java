package arrayList;

public class Media {
	public static void main(String[] args) {
		double n1 = 10.0;
		double n2 = 10.0;
		double n3 = 10.0;
		double n4 = 10.0;
		
	System.out.println("A media é: "+media(n1,n2,n3,n4));
	}
	
	public static double media(double ...numeros) {
		double total = 0.0;
		
		for(double num: numeros) {
			total += num;
		}
		
		return (total / numeros.length);
	}
}
