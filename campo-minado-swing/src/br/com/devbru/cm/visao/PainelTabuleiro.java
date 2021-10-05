package br.com.devbru.cm.visao;

import java.awt.GridLayout;
import javax.swing.JPanel;
import br.com.devbru.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		
       tabuleiro.paraCada( c -> add(new ButaoCampo(c)));
       
       tabuleiro.registraObservadores( e -> {
    	   // TODO implementa depois
       });
	}
}
