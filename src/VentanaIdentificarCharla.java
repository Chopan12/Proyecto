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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Congreso c = new Congreso ();
					VentanaIdentificarCharla frame = new VentanaIdentificarCharla(c);
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
	public VentanaIdentificarCharla(Congreso c) {
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
		
		IDCharla = new JTextField();
		IDCharla.setBounds(159, 49, 86, 20);
		contentPane.add(IDCharla);
		IDCharla.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpcionesEdicion ventanaOpcionesEdicion = new VentanaOpcionesEdicion(c);
				setVisible(false);
				ventanaOpcionesEdicion.setVisible(true);
				
			}
		});
		btnConfirmar.setBounds(159, 80, 89, 23);
		contentPane.add(btnConfirmar);
	}
}
