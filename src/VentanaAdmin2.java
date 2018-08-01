import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class VentanaAdmin2 extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaAdmin2(Congreso c,Administrador us) {
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
				VentanaCrearCharla vntCrCh = new VentanaCrearCharla (c,us);
				setVisible (false);
				vntCrCh.setVisible(true);
	
			}
		});
		btnCrearCharla.setBackground(Color.WHITE);
		btnCrearCharla.setBounds(10, 59, 140, 23);
		contentPane.add(btnCrearCharla);
		
		JLabel label = new JLabel("Escoja una opcion\r\n");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(147, 29, 140, 19);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Guardar Cambios");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Exportar ex = new Exportar ();
				try {
					ex.exportarTodo(c);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(147, 227, 140, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar Charla");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaIdentificarCharla v = new VentanaIdentificarCharla (c,us);
				setVisible(false);
				v.setVisible(true);	
			}
		});
		btnNewButton_1.setBounds(284, 59, 140, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mostrar Usuarios");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MapaUsuarios m = new MapaUsuarios();
				try {
					m.reporteArchivo("usuarios.txt");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(10, 129, 140, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnMostrarCharlas = new JButton("Mostrar Charlas");
		btnMostrarCharlas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaCharlas l = new ListaCharlas();
				try {
					l.reporteArchivo("charlas.txt");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		btnMostrarCharlas.setBackground(Color.WHITE);
		btnMostrarCharlas.setBounds(10, 171, 140, 23);
		contentPane.add(btnMostrarCharlas);
		
		JLabel lblArchivol = new JLabel("Mostrar por archivo :\r\n");
		lblArchivol.setBounds(10, 93, 157, 14);
		contentPane.add(lblArchivol);
		
		JButton button = new JButton("Mostrar Usuarios");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaReporteUno v = new VentanaReporteUno (c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(284, 129, 140, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Mostrar Charlas");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaReporteDos ve = new VentanaReporteDos (c,us);
				setVisible(false);
				ve.setVisible(true);
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(284, 171, 140, 23);
		contentPane.add(button_1);
		
		JLabel lblMostrarPorPantalla = new JLabel("Mostrar por pantalla :");
		lblMostrarPorPantalla.setBounds(294, 93, 118, 14);
		contentPane.add(lblMostrarPorPantalla);
		
		JLabel lblCantidad = new JLabel("(Cantidad)");
		lblCantidad.setBounds(322, 110, 69, 14);
		contentPane.add(lblCantidad);
		
		JLabel lbldatos = new JLabel("(Datos)");
		lbldatos.setBounds(37, 110, 69, 14);
		contentPane.add(lbldatos);
	}
}