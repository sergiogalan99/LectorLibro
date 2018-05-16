package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class LectorUI extends JFrame {

	private JPanel contentPane;
	protected JTextArea textArea;
	protected JButton btnAtras;
	protected JButton btnMarcar;
	protected JButton btnIrAMarca;
	protected JButton btnAlante;
	protected JLabel lblNumeroPagina;


	/**
	 * Create the frame.
	 */
	public LectorUI() {
		setTitle("Lector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 490);
		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		textArea = new JTextArea();
		textArea.setBackground(new Color(238, 232, 170));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);

		// Panel de botones
		JPanel panel = new JPanel();
		panel.setBackground(new Color(160, 82, 45));
		contentPane.add(panel, BorderLayout.SOUTH);

		lblNumeroPagina = new JLabel("0");
		lblNumeroPagina.setFont(new Font("Arial", Font.BOLD, 13));
		btnAtras = new JButton("<<");
		btnAtras.setFont(new Font("Arial", Font.BOLD, 13));
		btnAtras.setBackground(new Color(47, 79, 79));
		btnAtras.setName("atras");
		btnAlante = new JButton(">>");
		btnAlante.setFont(new Font("Arial", Font.BOLD, 13));
		btnAlante.setBackground(new Color(47, 79, 79));
		btnAlante.setName("alante");
		btnMarcar = new JButton("Marcar");
		btnMarcar.setFont(new Font("Arial", Font.BOLD, 11));
		btnMarcar.setBackground(new Color(0, 0, 0));
		btnMarcar.setName("Marcar");
		btnIrAMarca = new JButton("Ir a Marca");
		btnIrAMarca.setFont(new Font("Arial", Font.BOLD, 11));
		btnIrAMarca.setBackground(new Color(0, 0, 139));
		btnIrAMarca.setName("IrMarca");
		panel.add(btnAtras);
		panel.add(btnMarcar);
		panel.add(btnIrAMarca);
		panel.add(btnAlante);
		panel.add(lblNumeroPagina);

	}

}
