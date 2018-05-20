package Acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import Logica.Logica;

public class ListenerIrMarca implements ActionListener{
	
	private	JLabel lblNumeroPagina;
	private	JTextArea txtArea;
	private Logica logica;
	
	public ListenerIrMarca(JLabel lblNumeroPagina, JTextArea txtArea, Logica logica) {
		super();
		this.lblNumeroPagina = lblNumeroPagina;
		this.txtArea = txtArea;
		this.logica = logica;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		logica.irAMarca();	
		txtArea.setText(logica.getLibro());
		lblNumeroPagina.setText(String.valueOf(logica.getActual()));
	
		}


		}
