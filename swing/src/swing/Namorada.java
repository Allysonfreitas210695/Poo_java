package swing;

public class Namorada implements ChegadaAniversarianteObserver{
	  
	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Apagar as luzes...");
		System.out.println("fazer silencio");
		System.out.println("Supresa!");
	}
}
