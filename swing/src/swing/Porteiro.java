package swing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread{
	
	private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();
	
	public void addChegadaAnivesarianteObserve(ChegadaAniversarianteObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int valor = scanner.nextInt();
			
			if(valor == 1) {
				ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());
				
				for(ChegadaAniversarianteObserver observe: this.observers) {
					observe.chegou(event);
				}
			}else {
				System.out.println("Alarme falso!..");
			}
			scanner.close();
		}
		
	}
}
