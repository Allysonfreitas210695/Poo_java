package arrayList;

import java.util.Scanner;

public class DemoCliente {
    public static int contCliente = 0;
    
	public static void main(String[] args) {
		Cliente c = new Cliente();
//		c.addArraylist(c);
//		c.imprimirCliente();
		menu();
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		
		while(opcao != 4 && opcao > 0) {
			switch(opcao) {
			case 1:{
				System.out.println("Cadastro do cliente "+ (contCliente+1));
				int id;
				System.out.println("Digite o ID do cliente: ");
				id = leitor.nextInt();
				String nome;
				leitor.nextLine();
				
				System.out.println("Digite o NOME do cliente: ");
				nome = leitor.nextLine();
				int idade;
				System.out.println("Digite o IDADE do cliente: ");
				idade = leitor.nextInt();
				leitor.nextLine();
				
				String telefone;
				System.out.println("Digite o TELEFONE do cliente: ");
				telefone = leitor.nextLine();
				
				System.out.println("teste: "+telefone);
				c.addArraylist(new Cliente(id,nome,idade,telefone));
				contCliente++;
				break;
			}
			case 2:{
				c.imprimirCliente();
				break;
			}
			case 3:{
				System.out.println("No momento foram cadastrados: "+c.tamanhoCadastro());
				break;
			}
			default:
				System.out.println("Opcao invalida!");
				break;
			}
			menu();
			opcao = leitor.nextInt();
		}
		
		System.out.println("Programa de cadastro cliente finalizado cm sucesso!!");
		leitor.close();
	}
	
	
	public static void menu() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("		 MENU         ");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("1- Cadastra Cliente");
		System.out.println("2- Imprimir Cliente");
		System.out.println("3- Quantidade Cadastra");
		System.out.println("4- Sair");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
