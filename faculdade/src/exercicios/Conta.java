package exercicios;
import java.util.*; // ou java.util.Scanner;  Com * importa todas as bibliotecas intregadas no JAVA

public class Conta {
	public static void main(String[] args) {
    	ContaBancariaSimples c = new ContaBancariaSimples();
    	
    	Scanner leitor = new Scanner(System.in);
    	System.out.println("Digite o valor de Deposito: ");
    	double deposito = leitor.nextDouble();
    	System.out.println();
    	
		c.abreConta("Allyson", deposito);
//    	c.abreContaSimples("allyson Bruno");
    	c.retirar(1000);
		c.showMessege();
		leitor.close(); //fechar o Scanner no final ou apois a leitura do terminal
	}
}
