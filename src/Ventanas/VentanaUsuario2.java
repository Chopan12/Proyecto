package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class VentanaUsuario2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void VentanaUsuario2A () {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaUsuario2 frame = new VentanaUsuario2();
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
	public VentanaUsuario2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escoja una opcion\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(147, 29, 140, 19);
		contentPane.add(lblNewLabel);
		
		JButton btnVolverUs1 = new JButton("Volver\r\n");
		btnVolverUs1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaUsuario ventUs = new VentanaUsuario ();
				setVisible (false);
				ventUs.setVisible (true);
			}
		});
		btnVolverUs1.setForeground(Color.BLACK);
		btnVolverUs1.setFont(btnVolverUs1.getFont().deriveFont(btnVolverUs1.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		btnVolverUs1.setBackground(Color.MAGENTA);
		btnVolverUs1.setBounds(170, 227, 89, 23);
		contentPane.add(btnVolverUs1);
		
		JButton btnAgregar = new JButton("Agregar charla para asistir");
		btnAgregar.setForeground(new Color(0, 204, 255));
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregar.setBounds(10, 75, 200, 23);
		contentPane.add(btnAgregar);
		
		JButton btnEliminarCharlaPara = new JButton("Eliminar charla para asistir\r\n");
		btnEliminarCharlaPara.setForeground(new Color(0, 204, 255));
		btnEliminarCharlaPara.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminarCharlaPara.setBounds(224, 75, 200, 23);
		contentPane.add(btnEliminarCharlaPara);
		
		JButton btnVerCharlas = new JButton("Ver charlas propias\r\n\r\n");
		btnVerCharlas.setForeground(Color.GREEN);
		btnVerCharlas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerCharlas.setBounds(107, 128, 200, 23);
		contentPane.add(btnVerCharlas);
		
		JButton btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.setForeground(Color.RED);
		btnEliminarTodo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminarTodo.setBounds(107, 171, 200, 23);
		contentPane.add(btnEliminarTodo);
	}
}
