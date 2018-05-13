

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class VentanaAdmin2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAdmin2 frame = new VentanaAdmin2();
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
	public VentanaAdmin2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrearCharla = new JButton("Crear Charla");
		btnCrearCharla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCrearCharla vntCrCh = new VentanaCrearCharla ();
				setVisible (false);
				vntCrCh.setVisible(true);
	
			}
		});
		btnCrearCharla.setBackground(Color.WHITE);
		btnCrearCharla.setBounds(10, 84, 127, 23);
		contentPane.add(btnCrearCharla);
		
		JLabel label = new JLabel("Escoja una opcion\r\n");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(147, 29, 140, 19);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Editar Usuario");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(147, 161, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar Charla");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(297, 84, 127, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mostrar Planilla");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(147, 209, 127, 23);
		contentPane.add(btnNewButton_2);
	}
}