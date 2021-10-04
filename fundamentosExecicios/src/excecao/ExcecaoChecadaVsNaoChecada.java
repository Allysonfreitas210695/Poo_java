package excecao;

public class ExcecaoChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim :)");
	}
	
	//nao checada ou nao verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	//checada ou verificada
    static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
