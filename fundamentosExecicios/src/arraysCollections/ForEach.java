package arraysCollections;
import java.util.Arrays;
import java.util.Scanner;


public class ForEach {
	public static void main(String[] args) {
		int[] vet = new int[10];
		Scanner l = new Scanner(System.in);
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o valor vetor na posicao "+i);
			vet[i] = l.nextInt();		
		}
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		System.out.println(Arrays.toString(vet));
		l.close();
	}
}
