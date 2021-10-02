package exercicios.ex1;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice teste = new Invoice();
		//retorna um true para tudo certo e False para al
		boolean resultToTake = teste.updateItems("1234H", "Açucar", 4, -2.89);
		
		double precoTotal = teste.getInvoiceAmount(resultToTake);
		
		System.out.println(precoTotal);
		
		System.out.println(teste.getNumero());
		System.out.println(teste.getDescricao());
		System.out.println(teste.getPrecoItem());
		System.out.println(teste.getQtdItemsComprados());
	}

}
