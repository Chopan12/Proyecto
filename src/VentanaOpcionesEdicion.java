import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaOpcionesEdicion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaOpcionesEdicion(Charla s,Congreso c,Administrador us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblElijaOpcionA = new JLabel("Elija opcion a editar:");
		lblElijaOpcionA.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblElijaOpcionA.setBounds(34, 11, 160, 32);
		contentPane.add(lblElijaOpcionA);
		
		JButton btnEditarFecha = new JButton("Editar Fecha");
		btnEditarFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaIngresarFecha v = new VentanaIngresarFecha (s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnEditarFecha.setBounds(156, 54, 148, 23);
		contentPane.add(btnEditarFecha);
		
		JButton btnEditarDuracion = new JButton("Editar Duracion");
		btnEditarDuracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaIngresarDuracion v = new VentanaIngresarDuracion (s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnEditarDuracion.setBounds(156, 88, 148, 23);
		contentPane.add(btnEditarDuracion);
		
		JButton btnEditarExpositor = new JButton("Editar Expositor");
		btnEditarExpositor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEditarExpositor v = new VentanaEditarExpositor (s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnEditarExpositor.setBounds(156, 122, 148, 23);
		contentPane.add(btnEditarExpositor);
		
		JButton btnTodasLasOpciones = new JButton("Todas las opciones");
		btnTodasLasOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEditarCharla ventanaEditarCharla = new VentanaEditarCharla (s,c,us);
				setVisible(false);
				ventanaEditarCharla.setVisible(true);
				
			}
		});
		btnTodasLasOpciones.setBounds(156, 190, 148, 23);
		contentPane.add(btnTodasLasOpciones);
		
		JButton btnEditarSala = new JButton("Editar Sala");
		btnEditarSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaIngresarSala v = new VentanaIngresarSala (s,c,us);
				setVisible (false);
				v.setVisible(true);
			}
		});
		btnEditarSala.setBounds(156, 156, 148, 23);
		contentPane.add(btnEditarSala);
		
		JButton btnNewButton = new JButton("Volver al menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaAdmin2 v = new VentanaAdmin2 (c,us);
				setVisible (false);
				v.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(156, 224, 148, 23);
		contentPane.add(btnNewButton);
	}
}
