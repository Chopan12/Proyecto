package Ventanas;
	
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaMostrar extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public VentanaMostrar (String textoVentanaPrincipal) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds (100, 100, 450, 300);
		contentPane = new JPanel ();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane (contentPane);
		contentPane.setLayout(null);
		
		JLabel textoVentAnterior = new JLabel (textoVentanaPrincipal);
		textoVentAnterior.setBounds(88, 119, 206, 34);
		contentPane.add(textoVentAnterior);
		
	}

}
