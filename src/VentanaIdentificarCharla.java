import java.awt.Color;
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

public class VentanaIdentificarCharla extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField IDCharla;

	public VentanaIdentificarCharla(Congreso c, CuentaUsuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseIdDe = new JLabel("Ingrese ID de charla:");
		lblIngreseIdDe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIngreseIdDe.setBounds(128, 11, 153, 14);
		contentPane.add(lblIngreseIdDe);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaOpcionesEdicion ventanaOpcionesEdicion = new VentanaOpcionesEdicion(c.obtenerCharlaid(IDCharla.getText()),c,us);
				setVisible(false);
				ventanaOpcionesEdicion.setVisible(true);	
				
				
				
				
				
				
				
				
			}
		});
		
		IDCharla = new JTextField();
		IDCharla.setBounds(159, 49, 86, 20);
		contentPane.add(IDCharla);
		IDCharla.setColumns(10);
		btnConfirmar.setBounds(159, 80, 89, 23);
		contentPane.add(btnConfirmar);
	}
}
