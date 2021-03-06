package br.com.devbru.cm.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import br.com.devbru.cm.modelo.Campo;
import br.com.devbru.cm.modelo.CampoEvento;
import br.com.devbru.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class ButaoCampo extends JButton implements CampoObservador, MouseListener{
   
	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCADO = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);
	private Campo campo;
	 
	public ButaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));
		
		addMouseListener(this);
		campo.registraObservador(this);
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch (evento) {
		case ABRI: {
			aplicarEstiloAbrir();
		break;
		}
		case MARCAR: {
			aplicarEstiloMarcar();
		break;
		}
		case EXPLODIR: {
			aplicarEstiloExplodir();
		break;
		}
		default:
			aplicarEstiloPadrao();
		}
		
	}

	private void aplicarEstiloPadrao() {
		// TODO Auto-generated method stub
		
	}

	private void aplicarEstiloExplodir() {
		// TODO Auto-generated method stub
		
	}

	private void aplicarEstiloMarcar() {
		// TODO Auto-generated method stub
		
	}

	private void aplicarEstiloAbrir() { }

	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			System.out.println("Botão esquerdo");
		}else {
			System.out.println("Botão Direito");
		}
	}
	
	public void mouseClicked(MouseEvent e) {}
	
	public void mouseEntered(MouseEvent e) {}
	
	public void mouseExited(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
}
