package control.accion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ActionMarca implements ActionListener{
	private LectorBridge lectorBridge;
	public ActionMarca(LectorBridge lectorBridge) {
		this.lectorBridge=lectorBridge;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton boton=(JButton) e.getSource();
		if(boton.getName().equals("Marcar")) {
			lectorBridge.marcar();
		}else{
			lectorBridge.irMarca();
		}
	}
}
