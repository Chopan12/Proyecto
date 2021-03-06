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
import java.awt.Color;

public class VentanaIngresarDuracion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Duracion;

	public VentanaIngresarDuracion(Charla s,Congreso c, CuentaUsuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseNuevaDuracion = new JLabel("Ingrese nueva duracion de charla:");
		lblIngreseNuevaDuracion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIngreseNuevaDuracion.setBounds(90, 11, 257, 14);
		contentPane.add(lblIngreseNuevaDuracion);
		
		Duracion = new JTextField();
		Duracion.setBounds(169, 36, 86, 20);
		contentPane.add(Duracion);
		Duracion.setColumns(10);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(Duracion.getText());
				s.setDuracion(i);
				VentanaOpcionesEdicion ventanaOpcionesEdicion = new VentanaOpcionesEdicion (s,c,us);
				setVisible(false);
				ventanaOpcionesEdicion.setVisible(true); 
			}
		});
		btnContinuar.setBounds(169, 67, 89, 23);
		contentPane.add(btnContinuar);
	}

}
