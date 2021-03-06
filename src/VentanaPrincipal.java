import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaPrincipal(Congreso c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 204));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ventana Principal\r\n");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(105, 27, 213, 24);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Usuario");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			VentanaRegistrarIniciar ventanaUs = new VentanaRegistrarIniciar (c);
			setVisible (false);
			ventanaUs.setVisible (true);
			}
		});
		btnNewButton_1.setBounds(79, 95, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Administrador\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaAdmin ventanaAd = new VentanaAdmin (c);

				setVisible(false);
				ventanaAd.setVisible(true);
			}
		});
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBounds(269, 95, 123, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione una opcion\r\n");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(140, 200, 175, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqui ira el exportar 
				setVisible (false);
			}
		});
		btnNewButton.setBackground(new Color(255, 153, 0));
		btnNewButton.setBounds(180, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
