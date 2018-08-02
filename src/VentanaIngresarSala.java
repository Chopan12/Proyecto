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
import java.awt.event.ActionEvent;

public class VentanaIngresarSala extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NuevaSala;
	private JTextField NuevaCapacidad;

	public VentanaIngresarSala(Charla s,Congreso c,CuentaUsuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarNuevaSala = new JLabel("Ingresar nueva sala:");
		lblIngresarNuevaSala.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIngresarNuevaSala.setBounds(68, 11, 234, 20);
		contentPane.add(lblIngresarNuevaSala);
		
		NuevaSala = new JTextField();
		NuevaSala.setBounds(145, 42, 86, 20);
		contentPane.add(NuevaSala);
		NuevaSala.setColumns(10);
		
		JLabel lblEjC = new JLabel("Ej: C5");
		lblEjC.setBounds(241, 42, 46, 14);
		contentPane.add(lblEjC);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i =Integer.parseInt(NuevaCapacidad.getText());
				Sala sala= new Sala(NuevaSala.getText(),i);
				
				s.setSalaAsignada(sala);
				
				VentanaOpcionesEdicion ventanaOpcionesEdicion = new VentanaOpcionesEdicion (s,c,us);
				setVisible(false);
				ventanaOpcionesEdicion.setVisible(true); 
			}
		});
		btnContinuar.setBounds(278, 168, 89, 23);
		contentPane.add(btnContinuar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaOpcionesEdicion ventanaOpcionesEdicion = new VentanaOpcionesEdicion (s,c,us);
				setVisible(false);
				ventanaOpcionesEdicion.setVisible(true); 
			}
		});
		btnVolver.setBounds(56, 168, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(113, 45, 22, 14);
		contentPane.add(lblId);
		
		JLabel lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setBounds(77, 73, 68, 14);
		contentPane.add(lblCapacidad);
		
		NuevaCapacidad = new JTextField();
		NuevaCapacidad.setBounds(145, 70, 86, 20);
		contentPane.add(NuevaCapacidad);
		NuevaCapacidad.setColumns(10);
	}

}
