package Acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.Logica;

public class ListenerMarcar implements ActionListener{

	private Logica logica;
	
	public ListenerMarcar(Logica logica) {
		super();
		this.logica = logica;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		logica.marcarPagina();
		}
	}