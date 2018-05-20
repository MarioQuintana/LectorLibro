package Logica;

import java.awt.EventQueue;
import Logica.LectorBridge;

public class Principal {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LectorBridge frame = new LectorBridge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
			}
				
			}
		});
	}
}
