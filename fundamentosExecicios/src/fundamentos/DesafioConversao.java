package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
    String valor1 =  JOptionPane.showInputDialog("Digite o primeiro numero aqui: ");
    String valor2 =  JOptionPane.showInputDialog("Digite o Segundo numero aqui: ");
    String valor3 =  JOptionPane.showInputDialog("Digite o Terceironumero aqui: ");
    
    double num1 = Double.parseDouble(valor1);
    double num2 = Double.parseDouble(valor2);
    double num3 = Double.parseDouble(valor3);
    
    double result = (num1 + num2 + num3) / 3;
    System.out.println("Resultado é "+result);
    
    int num = 10;
    String texto =  Integer.toString(num);
    System.out.println(((Object)texto).getClass().getSimpleName());
	}

}
