import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class VentanaRegistro extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Rut;
	private JTextField Nombre;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Congreso c = new Congreso ();
					VentanaRegistro frame = new VentanaRegistro(c);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaRegistro(Congreso c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		
		JLabel lblPanelDeUsuario = new JLabel("Registro Usuario");
		lblPanelDeUsuario.setForeground(new Color(102, 153, 255));
		lblPanelDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPanelDeUsuario.setBounds(145, 11, 144, 34);
		panel.add(lblPanelDeUsuario);
		
		Rut = new JTextField();
		Rut.setColumns(10);
		Rut.setBounds(145, 110, 144, 20);
		panel.add(Rut);
		
		
		JPasswordField Clave = new JPasswordField();
		Clave.setColumns(10);
		Clave.setBounds(145, 141, 144, 20);
		panel.add(Clave);
		
		
		JLabel label_1 = new JLabel("Rut :\r\n\r\n\r\n");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(89, 113, 46, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Clave :\r\n");
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setBounds(88, 144, 46, 14);
		panel.add(label_2);
		
		Nombre = new JTextField();
		Nombre.setColumns(10);
		Nombre.setBounds(145, 79, 144, 20);
		panel.add(Nombre);
	
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {   //Registrar Usuario
				String nombre = Nombre.getText();
				@SuppressWarnings("deprecation") //Aqui se saca el warning porque siempre tendra warning un getText de un passwordfield
				String clave = Clave.getText();
				String rut = Rut.getText(); //Se obtiene el rut
				
				Usuario nuevUs = new Usuario (nombre,rut,clave);
				MapaUsuarios m = c.obtenerMapUs(); 
				m.agregarUsuario(nuevUs);
				
				setVisible(false);
				VentanaUsuario Vu= new VentanaUsuario (c);
				Vu.setVisible(true);
			}
		});
		btnRegistrarse.setForeground(Color.BLACK);
		btnRegistrarse.setFont(btnRegistrarse.getFont().deriveFont(btnRegistrarse.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		btnRegistrarse.setBackground(Color.RED);
		btnRegistrarse.setBounds(233, 212, 117, 23);
		panel.add(btnRegistrarse);
		
		
		
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(75, 82, 60, 14);
		panel.add(lblNombre);
		
		JButton button = new JButton("Volver\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaRegistrarIniciar v1 = new VentanaRegistrarIniciar(c);
				setVisible(false);
				v1.setVisible(true);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(button.getFont().deriveFont(button.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		button.setBackground(Color.MAGENTA);
		button.setBounds(89, 212, 89, 23);
		panel.add(button);
	}
}
