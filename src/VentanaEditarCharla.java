import java.awt.Color;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEditarCharla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NuevoID;
	private JTextField Fecha;
	private JTextField Duracion;
	private JTextField nombreExpositor;
	private JButton btnConfirma;

	public VentanaEditarCharla(Charla s, Congreso c,Administrador us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditarDatosDe = new JLabel("Editar datos de charla:");
		lblEditarDatosDe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEditarDatosDe.setBounds(135, 11, 171, 14);
		contentPane.add(lblEditarDatosDe);
		
		JLabel lblNuevoId = new JLabel("Nuevo ID:");
		lblNuevoId.setBounds(30, 44, 75, 14);
		contentPane.add(lblNuevoId);
		
		NuevoID = new JTextField();
		NuevoID.setBounds(135, 41, 86, 20);
		contentPane.add(NuevoID);
		NuevoID.setColumns(10);
		
		JLabel lblNuevoFecha = new JLabel("Nuevo fecha:");
		lblNuevoFecha.setBounds(30, 69, 75, 14);
		contentPane.add(lblNuevoFecha);
		
		Fecha = new JTextField();
		Fecha.setBounds(135, 66, 86, 20);
		contentPane.add(Fecha);
		Fecha.setColumns(10);
		
		JLabel lblNuevaDuracion = new JLabel("Nueva duracion:");
		lblNuevaDuracion.setBounds(30, 94, 86, 14);
		contentPane.add(lblNuevaDuracion);
		
		Duracion = new JTextField();
		Duracion.setBounds(135, 91, 86, 20);
		contentPane.add(Duracion);
		Duracion.setColumns(10);
		
		JLabel lblNuevoExpositora = new JLabel("Nuevo expositor/a: ");
		lblNuevoExpositora.setBounds(30, 119, 103, 14);
		contentPane.add(lblNuevoExpositora);
		
		nombreExpositor = new JTextField();
		nombreExpositor.setBounds(135, 116, 86, 20);
		contentPane.add(nombreExpositor);
		nombreExpositor.setColumns(10);
		
		btnConfirma = new JButton("Confirmar");
		btnConfirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAdmin2 ventanaAdmin = new VentanaAdmin2 (c,us);
				setVisible(false);
				ventanaAdmin.setVisible(true); 
			}
		});
		btnConfirma.setBounds(132, 151, 89, 23);
		contentPane.add(btnConfirma);
	}
}
