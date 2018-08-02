//import java.awt.BorderLayout;
//import java.awt.EventQueue;

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

public class VentanaEditarExpositorNombre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NuevoNombre;
	private JButton btnVolver;

	public VentanaEditarExpositorNombre(Charla s, Congreso c, CuentaUsuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarNuevoNombre = new JLabel("Ingresar nuevo nombre:");
		lblIngresarNuevoNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIngresarNuevoNombre.setBounds(112, 11, 231, 32);
		contentPane.add(lblIngresarNuevoNombre);
		
		NuevoNombre = new JTextField();
		NuevoNombre.setBounds(139, 54, 154, 20);
		contentPane.add(NuevoNombre);
		NuevoNombre.setColumns(10);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Expositor expositor = s.getExpositor();
				expositor.setNombre(NuevoNombre.getText());
				
				VentanaEditarExpositor v = new VentanaEditarExpositor (s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnContinuar.setBounds(284, 85, 89, 23);
		contentPane.add(btnContinuar);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEditarExpositor v = new VentanaEditarExpositor (s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnVolver.setBounds(68, 85, 89, 23);
		contentPane.add(btnVolver);
	}
}
