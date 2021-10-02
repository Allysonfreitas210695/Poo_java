package classe;

public class DataTeste {
	
	
	public static void main(String[] args) {
		Data d = new Data();
		d.ano = 2021;
		d.dia = 27;
		d.mes = 7;
		
		System.out.println(d.obterDataFormatada());
	}
}
