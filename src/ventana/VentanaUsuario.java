package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class VentanaUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField ingresarRut;
	private JTextField ingresarClave;

	/**
	 * Launch the application.
	 */
	public void VentanaUsuarioA () {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaUsuario frame = new VentanaUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaUsuario() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPanelDeUsuario = new JLabel("Panel de Usuario");
		lblPanelDeUsuario.setForeground(new Color(102, 153, 255));
		lblPanelDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPanelDeUsuario.setBounds(145, 11, 144, 34);
		contentPane.add(lblPanelDeUsuario);
		
		JButton botonVolverUs = new JButton("Volver\r\n");
		botonVolverUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal ventanaPrincipal2 = new VentanaPrincipal ();
				setVisible(false);
				ventanaPrincipal2.setVisible(true);
			}
		});
		botonVolverUs.setForeground(Color.BLACK);
		botonVolverUs.setFont(botonVolverUs.getFont().deriveFont(botonVolverUs.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		botonVolverUs.setBackground(Color.MAGENTA);
		botonVolverUs.setBounds(145, 215, 89, 23);
		contentPane.add(botonVolverUs);
		
		ingresarRut = new JTextField();
		ingresarRut.setBounds(145, 86, 144, 20);
		contentPane.add(ingresarRut);
		ingresarRut.setColumns(10);
		
		ingresarClave = new JTextField();
		ingresarClave.setBounds(145, 141, 144, 20);
		contentPane.add(ingresarClave);
		ingresarClave.setColumns(10);

		
		JLabel lblNewLabel = new JLabel("Rut :\r\n\r\n\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(88, 89, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Clave :\r\n");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(88, 144, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnContinuar_1 = new JButton("Continuar\r\n");
		btnContinuar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaUsuario2 ventanaUs2 = new VentanaUsuario2 ();
				setVisible (false);
				ventanaUs2.setVisible(true);
			}
		});
		btnContinuar_1.setForeground(Color.BLACK);
		btnContinuar_1.setFont(btnContinuar_1.getFont().deriveFont(btnContinuar_1.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		btnContinuar_1.setBackground(Color.RED);
		btnContinuar_1.setBounds(255, 215, 117, 23);
		contentPane.add(btnContinuar_1);
	
	}
}

