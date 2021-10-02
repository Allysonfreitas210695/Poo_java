package Campeonato_Futebol;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class ComecarPartida {

	public static void main(String[] args) {
		
		JogadorAtacante[] atacante = new JogadorAtacante[4];
		JogadorDefesa[] defesor = new JogadorDefesa[4];
		JogadorGoleiro[] goleiro = new JogadorGoleiro[2];
		
		//Goleiro
		goleiro[0] = new JogadorGoleiro("Diego silva", 36, 83, 85, 1.80f, 1);
		goleiro[1] = new JogadorGoleiro("Werveton", 34, 88, 89, 1.85f, 12);
		
		//Defesores
		defesor[0] = new JogadorDefesa("Miranda", 37, 89, 91, 90, 5);
		defesor[1] = new JogadorDefesa("Gustavo Gomes", 30, 88, 92, 89, 33);
		defesor[2] = new JogadorDefesa("Pedro Geromel", 32, 81, 89, 90, 4);
		defesor[3] = new JogadorDefesa("Rodrigo Caio", 26, 91, 93, 92, 5);
		
		//Atacantes
		atacante[0] = new JogadorAtacante("Gabigol", 26, 89, 30, 75, 9);
		atacante[1] = new JogadorAtacante("Bruno Henrique", 28, 85, 32, 77, 13);
		atacante[2] = new JogadorAtacante("Rigonni", 28, 90, 31, 89, 11);
		atacante[3] = new JogadorAtacante("Pedro", 24, 82, 27, 88, 99);
	
		//times
		Time portalegre = new Time("Portalegre fc");
		portalegre.insJogador(goleiro[0]);
		portalegre.insJogador(defesor[0]);
		portalegre.insJogador(defesor[1]);
		portalegre.insJogador(atacante[0]);
		portalegre.insJogador(atacante[1]);
		//portalegre.imprimeJogades();
		
		Time Vicosa = new Time("Vicosa fc");
		Vicosa.insJogador(goleiro[1]);
		Vicosa.insJogador(defesor[2]);
		Vicosa.insJogador(defesor[3]);
		Vicosa.insJogador(atacante[2]);
		Vicosa.insJogador(atacante[3]);
		// Vicosa.imprimeJogades();

		// Partida
		Calendar dataPartida = Calendar.getInstance();
		dataPartida.set(2021, 8, 19);
		Date data = dataPartida.getTime();
		Partida jogo = new Partida(data, portalegre, Vicosa);
        
		//dia do jogo!!!
		Calendar diaJogo = Calendar.getInstance();
		diaJogo.set(2021, 8, 19);
		Date diaDataPartida = diaJogo.getTime();
		jogo.comecaJogo(diaDataPartida);
		
		// Altera vitorias, empates e derrotas
		if(jogo.getPlacaVisitante() > jogo.getPlacaCasa()) {
			Vicosa.somaVitorias();
			portalegre.somaDerrota();
		}else if(jogo.getPlacaVisitante() < jogo.getPlacaCasa()) {
			portalegre.somaVitorias();
			Vicosa.somaDerrota();
		}else {
			portalegre.somaEmpate();
			Vicosa.somaEmpate();
		}
		
		//resultado da partida
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Resultado!!");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(jogo.getPlacar());
		
		System.out.println("\nTime: "+portalegre.getNome()+"\n"+portalegre.getResultados());
		System.out.println("\nTime: "+Vicosa.getNome()+"\n"+Vicosa.getResultados());
		
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>> JOGADORES QUE MARCARAM >>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>>>>>> TIME CASA >>>>>>>>>>>>>>>>>>>>");
		
		for(int i = 0; i < jogo.getPlacaCasa(); i++) {
			Random aleatorio = new Random();
			int num = aleatorio.nextInt(2);
			
			if(num == 0) {
				int golsAdd = aleatorio.nextInt(2);
				atacante[golsAdd].SomaGols();
			}else {
				int golsAdd = aleatorio.nextInt(2);
				defesor[golsAdd].SomaGols();
			}
		}
		
		System.out.println();
		System.out.println(atacante[0]);
		System.out.println(atacante[1]);
		System.out.println(defesor[0]);
		System.out.println(defesor[1]);
		
		System.out.println("\n>>>>>>>>>>>>>>>>> TIME FORA >>>>>>>>>>>>>>>>>>>>");
		
		for(int i = 0; i < jogo.getPlacaVisitante(); i++) {
			Random aleatorio = new Random();
			int num = aleatorio.nextInt(2);
			
			if(num == 0) {
				int golsAdd = aleatorio.nextInt(2);
				atacante[golsAdd+2].SomaGols();
			}else {
				int golsAdd = aleatorio.nextInt(2);
				defesor[golsAdd+2].SomaGols();
			}
		}
		
		System.out.println();
		System.out.println(atacante[2]);
		System.out.println(atacante[3]);
		System.out.println(defesor[2]);
		System.out.println(defesor[3]);
	}
}
