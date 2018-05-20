package Logica;

import Vista.VistaPrincipal;
import Acciones.ListenerAlante;
import Acciones.ListenerAtras;
import Acciones.ListenerIrMarca;
import Acciones.ListenerMarcar;



public class LectorBridge extends VistaPrincipal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Logica logica;
	private ListenerAlante listenerAlante;
	private ListenerAtras listenerAtras;
	private ListenerMarcar listenerMarcar;
	private ListenerIrMarca listenerIrMarca;

	
	public LectorBridge() {
		super();
		logica= new Logica();
		listenerAlante= new ListenerAlante(this.lblNumeroPagina, this.txtArea,this.logica);
		this.btnAlante.addActionListener(listenerAlante);
		listenerAtras= new ListenerAtras(this.lblNumeroPagina, this.txtArea,this.logica);
		this.btnAtras.addActionListener(listenerAtras);
		listenerMarcar= new ListenerMarcar(this.logica);
		this.btnMarcar.addActionListener(listenerMarcar);
		listenerIrMarca= new ListenerIrMarca(this.lblNumeroPagina,txtArea, this.logica);
		this.btnIrAMarca.addActionListener(listenerIrMarca);

		this.txtArea.setText(logica.getLibro());

	}
}

