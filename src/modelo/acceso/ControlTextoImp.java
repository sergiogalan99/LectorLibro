package modelo.acceso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import modelo.Pagina;

public class ControlTextoImp implements IControlTexto {

	private File archivo;
	private StringBuilder texto;

	// En el constructor creamos el archivo
	public ControlTextoImp(String ruta) {
		crearArchivo(ruta);
		this.texto = new StringBuilder();
		this.leer();
	}

	@Override
	public long getLongitud() {
		return texto.length();
	}

	@Override
	public void leer() {
		try {
			BufferedReader bufferedR = abrirFlujoTextoR();
			bufferedR.lines().forEach(line -> texto.append(line + "\n"));
			bufferedR.close();
		} catch (IOException e) {

		}
	}

	public long obtenerUltimo(int ultimo) {
		if (ultimo < this.getLongitud()) {
			if (texto.charAt(ultimo) != ' ') {
				ultimo = texto.indexOf(" ", ultimo);
			}

		} else {
			ultimo = (int) this.getLongitud();
		}

		return ultimo;
	}

	public String getTexto(long primer, long ultimo) {
		return texto.substring((int) primer, (int) ultimo);
	}

	private void crearArchivo(String ruta) {
		archivo = new File(ruta);
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {

			}
		}
	}

	private BufferedReader abrirFlujoTextoR() throws FileNotFoundException, UnsupportedEncodingException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(new FileInputStream(archivo), "utf-8"));
		return bufferedReader;
	}

}
