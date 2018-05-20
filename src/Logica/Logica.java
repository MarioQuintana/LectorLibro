package Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import modelo.Legible;
import utiles.Constantes;

public class Logica implements Legible {
	private int actual = 0;
	private int marca = 0;
	private String ruta;
	private File archivo;
	private char[] letras;
	FileInputStream stream;
	InputStreamReader reader;
	public Logica() {
		super();
		this.ruta = "JuegoTronos.txt";
	}
	public String getLibro() {
		try {archivo = new File(ruta);
		stream = new FileInputStream(archivo);
		reader = new InputStreamReader(stream,"utf-8");
			letras= new char[Constantes.LETRASMAXIMAS];
			for (int i = 0; i <= actual; i++) {
				reader.read(letras);
				
			}
			reader.close();
		} catch (IOException e) {

			e.printStackTrace();
		}		
		return new String(letras);
	}


	public void avanzarPagina() {
		
		actual++;
}
	
	public void retrocederPagina() {

		if (!comprobarPrimeraPagina()) {
			actual--;
		}
	}
	
	private boolean comprobarPrimeraPagina() {
		if (actual <= 0) {
			return true;
		}
		return false;
	}

	@Override
	public void marcarPagina() {
		marca = actual;

	}

	@Override
	public void irAMarca() {
		actual = marca;

	}
	
	public int getActual() {
		return actual;
	}

	public int getMarca() {
		return marca;
	}

	

}