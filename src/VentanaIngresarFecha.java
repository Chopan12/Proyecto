import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaIngresarFecha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NuevaFecha;

	public VentanaIngresarFecha(Charla s,Congreso c, CuentaUsuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarNuevaFecha = new JLabel("Ingresar Nueva fecha:");
		lblIngresarNuevaFecha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIngresarNuevaFecha.setBounds(74, 11, 202, 21);
		contentPane.add(lblIngresarNuevaFecha);
		
		NuevaFecha = new JTextField();
		NuevaFecha.setBounds(162, 43, 86, 20);
		contentPane.add(NuevaFecha);
		NuevaFecha.setColumns(10);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				s.setFecha(NuevaFecha.getText());
				VentanaOpcionesEdicion ventanaOpcionesEdicion = new VentanaOpcionesEdicion (s,c,us);
				setVisible(false);
				ventanaOpcionesEdicion.setVisible(true); 
			}
		});
		btnContinuar.setBounds(250, 78, 89, 23);
		contentPane.add(btnContinuar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaOpcionesEdicion ventanaOpcionesEdicion = new VentanaOpcionesEdicion (s,c,us);
				setVisible(false);
				ventanaOpcionesEdicion.setVisible(true); 
				
			}
		});
		btnVolver.setBounds(87, 78, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblEj = new JLabel("Ej: 08/22/2018");
		lblEj.setBounds(258, 46, 81, 14);
		contentPane.add(lblEj);
	}
}
