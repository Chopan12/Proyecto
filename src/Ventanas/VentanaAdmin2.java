package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		
		JButton btnNewButton = new JButton("Agregar Charla");
		btnNewButton.setBounds(160, 80, 127, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("Escoja una opcion\r\n");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(147, 29, 140, 19);
		contentPane.add(label);
		
		JButton button = new JButton("Agregar Charla");
		button.setBounds(10, 118, 127, 23);
		contentPane.add(button);
	}
}
