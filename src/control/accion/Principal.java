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
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e1) {
			e1.printStackTrace();
		}

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
