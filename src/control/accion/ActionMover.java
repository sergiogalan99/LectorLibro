package control.accion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ActionMover implements ActionListener{
	private LectorBridge lectorBridge;
	public ActionMover(LectorBridge lectorBridge) {
		this.lectorBridge=lectorBridge;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton=(JButton) e.getSource();
		if(boton.getName().equals("atras")) {
			lectorBridge.atras();
		}else{
			lectorBridge.alante();
		}
		
	}

}
