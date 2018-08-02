import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.awt.event.ActionEvent;

public class VentanaEditarExpositorRut extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NuevoRut;
	private JButton btnVolver;

	public VentanaEditarExpositorRut(Charla s, Congreso c,CuentaUsuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarNuevoRut = new JLabel("Ingresar nuevo rut:");
		lblIngresarNuevoRut.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIngresarNuevoRut.setBounds(118, 11, 215, 25);
		contentPane.add(lblIngresarNuevoRut);
		
		NuevoRut = new JTextField();
		NuevoRut.setBounds(161, 47, 86, 20);
		contentPane.add(NuevoRut);
		NuevoRut.setColumns(10);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				VentanaEditarExpositor v = new VentanaEditarExpositor (s,c,us);
				setVisible(false);
				v.setVisible(true);
				
			}
		});
		btnContinuar.setBounds(244, 78, 89, 23);
		contentPane.add(btnContinuar);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEditarExpositor v = new VentanaEditarExpositor (s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnVolver.setBounds(60, 78, 89, 23);
		contentPane.add(btnVolver);
	}

}
