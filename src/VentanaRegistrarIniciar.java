import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistrarIniciar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Congreso c = new Congreso ();
					VentanaRegistrarIniciar frame = new VentanaRegistrarIniciar(c);
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
	public VentanaRegistrarIniciar(Congreso c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegistro r = new VentanaRegistro (c);
				setVisible(false);
				r.setVisible(true);
			}
		});
		btnNewButton.setBounds(287, 114, 110, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Iniciar Sesion");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaUsuario VenUs = new VentanaUsuario (c);
				setVisible(false);
				VenUs.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(33, 114, 122, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("Escoja una opcion\r\n");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		label.setBounds(147, 29, 140, 19);
		contentPane.add(label);
		
		JButton button = new JButton("Volver\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal vp = new VentanaPrincipal (c);
				vp.setVisible(true);
				setVisible(false);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(button.getFont().deriveFont(button.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		button.setBackground(Color.MAGENTA);
		button.setBounds(175, 215, 89, 23);
		contentPane.add(button);
	}
}