package control.accion;

import java.awt.EventQueue;

import javax.swing.UIManager;

import control.accion.LectorBridge;
import vista.LectorUI;



public class Principal {
	/*
	 * Para lanzar la aplicacion exclusivamente
	 */
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
