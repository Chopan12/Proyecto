	import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaOpcionDeseaAgregarCharla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaOpcionDeseaAgregarCharla(Congreso c,CuentaUsuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Desea agregar otra charla?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(91, 37, 266, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SI\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCrearCharla vntCrCh = new VentanaCrearCharla(c,us);
				setVisible (false);
				vntCrCh.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(91, 148, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NO\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAdmin2 vntAd = new VentanaAdmin2 (c,us);
				setVisible(false);
				vntAd.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(243, 148, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
