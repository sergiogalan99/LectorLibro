package control.accion;

import modelo.Libro;
import vista.LectorUI;

public class LectorBridge extends LectorUI {
	
	private Libro libro;
	public LectorBridge() {
		libro=new Libro("JuegoTronos.txt",600);
		primeraPaginas();
		setActionListener();
	}


	public void atras() {
		textArea.setText(libro.retrocederPagina());
		lblNumeroPagina.setText(String.valueOf(libro.getActual()));
		
	}

	public void alante() {
		textArea.setText(libro.avanzarPagina());
		lblNumeroPagina.setText(String.valueOf(libro.getActual()));
		
	}
	

	public void marcar() {
		libro.marcarPagina();
		
	}


	public void irMarca() {
		textArea.setText(libro.irAPagina(libro.getMarca()));
		lblNumeroPagina.setText(String.valueOf(libro.getActual()));
		
	}
	

	private void primeraPaginas() {
		textArea.setText(libro.irAPagina(0));
		lblNumeroPagina.setText(String.valueOf(libro.getActual()));
	}

	private void setActionListener() {
		ActionMover actionMover=new ActionMover(this);
		ActionMarca actionMarcar=new ActionMarca(this);
		btnAlante.addActionListener(actionMover);
		btnAtras.addActionListener(actionMover);
		btnIrAMarca.addActionListener(actionMarcar);
		btnMarcar.addActionListener(actionMarcar);
	}



	
	
	
	
	
}
