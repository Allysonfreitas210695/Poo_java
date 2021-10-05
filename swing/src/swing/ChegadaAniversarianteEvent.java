package swing;

import java.util.Date;

public class ChegadaAniversarianteEvent {
	
	private final Date horaDachegada;

	public ChegadaAniversarianteEvent(Date horaDachega) {
		super();
		this.horaDachegada = horaDachega;
	}

	public Date getHoraDachegada() {
		return horaDachegada;
	}
	
}
