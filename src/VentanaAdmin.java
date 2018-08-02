import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
public class VentanaAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ingRut;
	private JPasswordField ingClave;
	
	public VentanaAdmin(Congreso c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Panel Admin");
		lblNewLabel.setForeground(new Color(255, 0, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(145, 11, 144, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Congreso c = new Congreso ();
				VentanaPrincipal ventanaPrincipal2 = new VentanaPrincipal (c);
				setVisible(false);
				ventanaPrincipal2.setVisible(true);
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(255, 0, 255));
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		btnNewButton.setBounds(145, 215, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel Rut = new JLabel("Rut :\r\n\r\n\r\n");
		Rut.setFont(new Font("Tahoma", Font.BOLD, 11));
		Rut.setBounds(88, 89, 46, 14);
		contentPane.add(Rut);
		
		JLabel Clave = new JLabel("Clave :\r\n");
		Clave.setFont(new Font("Dialog", Font.BOLD, 12));
		Clave.setBounds(88, 144, 46, 14);
		contentPane.add(Clave);
		
		ingRut = new JTextField();
		ingRut.setColumns(10);
		ingRut.setBounds(145, 86, 144, 20);
		contentPane.add(ingRut);
		
		JButton button = new JButton("Continuar\r\n");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				String rut,clave;
				rut = ingRut.getText();
				clave = ingClave.getText();
				CuentaUsuario ad = c.obtenerUsuario(rut);
				
				if (ad!=null && ad.getEsAdmin()) {
					
					if (ad.getClave().equals(clave)) {
						VentanaAdmin2 ventanaAd2 = new VentanaAdmin2 (c, ad);
						setVisible (false);
						ventanaAd2.setVisible(true);
					}else {
						setVisible (false);
					}
				}else {
					VentanaAviso.infoVentana("Administrador incorrecto, vuelva a intentarlo","Error");
					setVisible(false);
					VentanaAdmin v = new VentanaAdmin (c);
					v.setVisible(true);
				}
			
			 }
		});
		button.setForeground(Color.BLACK);
		button.setFont(button.getFont().deriveFont(button.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		button.setBackground(Color.RED);
		button.setBounds(255, 215, 117, 23);
		contentPane.add(button);
		
		ingClave = new JPasswordField();
		ingClave.setBounds(145, 144, 144, 18);
		contentPane.add(ingClave);
	
}
}
