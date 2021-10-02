package Campeonato_Futebol;

import java.util.Date;
import java.util.Random;

public class Partida {
	private Date date;
	private Time timeCasa;
	private Time timeFora;
	private int placaCasa;
	private int placaVisitante;
	
	Partida(Date pdate, Time pCas, Time pFora){
		this.setDate(pdate);
        this.setTimeCasa(pCas);
        this.setTimeFora(pFora);
	}
	
	@SuppressWarnings("deprecation")
	public void comecaJogo(Date diaJogo) {
		if(this.timeCasa != null && this.timeFora != null) {
			if(diaJogo.getDate() > 0 && diaJogo.getDate() <= 31) {
		     Date data = new Date();
				if(data.getDate() == diaJogo.getDate()) {
					Random aleartorio = new Random();
					int max = aleartorio.nextInt(5), cont = 0;
					
					while(cont < max) {
						int num = aleartorio.nextInt(2);
						switch (num){
						  case 0:
							  this.golCasa();
							  break;
						  case 1:
							  this.golVistada();
							  break;
						  default:
							  System.err.println("Erro no Switch");
							  break;
						}
						cont++;
					}
				}else {
				  System.out.println("Dia nao proceder do jogo!");
				  System.exit(1);
			    }
			}
		}else if(this.timeCasa != null && this.timeFora == null) {
			System.err.println("Time Fora nao existe!!");
		}else if(this.timeCasa == null && this.timeFora != null) {
			System.err.println("Time Casa nao existe!!");
		}else {
			System.err.println("Times nao existem!!");
		}
	}
	
	public Time getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(Time timeCasa) {
		if(timeCasa != null) {
			this.timeCasa = timeCasa;
		}else {
			System.err.println("time nao existe");
		}
	}

	public Time getTimeFora() {
		return timeFora;
	}

	public void setTimeFora(Time timeFora) {
		if(timeFora != null) {
			this.timeFora = timeFora;
		}else {
			System.err.println("time nao existe");
		}
	}
	
	@SuppressWarnings("deprecation")
	public String toString() {
		return "date = " + this.date.getDate() + ", timeCasa = " + this.timeCasa.getNome() + ", timeFora = " + this.timeFora.getNome() + ", placaCasa = "
				+ this.placaCasa + ", placaVisitante = " + this.placaVisitante + "\n";
	}

	
	public void golCasa() {
		this.setPlacaCasa(this.getPlacaCasa() + 1);
	}
	
	public void golVistada() {
		this.setPlacaVisitante(this.getPlacaVisitante() + 1);
	}
	
	public String getPlacar() {
		return ""+this.timeCasa.getNome()+" "+this.placaCasa+" x "+this.placaVisitante+" "+this.timeFora.getNome()+"\n"+
	              "Time Ganhador: "
				+(this.placaCasa > this.placaVisitante ? this.timeCasa.getNome() : 
				 (this.placaCasa == this.placaVisitante ? "Empate": this.timeFora.getNome()));
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getPlacaCasa() {
		return this.placaCasa;
	}
	
	public void setPlacaCasa(int placaCasa) {
		this.placaCasa = placaCasa;
	}
	
	public int getPlacaVisitante() {
		return this.placaVisitante;
	}
	
	public void setPlacaVisitante(int placaVisitante) {
		this.placaVisitante = placaVisitante;
	}
	
	
}
