//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
//import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEditarExpositor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaEditarExpositor(Charla s, Congreso c,Administrador us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblElijaParametroA = new JLabel("Elija parametro a editar :");
		lblElijaParametroA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblElijaParametroA.setBounds(108, 11, 252, 26);
		contentPane.add(lblElijaParametroA);
		
		JButton btnEditarNombre = new JButton("Editar nombre");
		btnEditarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaEditarExpositorNombre v = new VentanaEditarExpositorNombre(s,c,us);
				setVisible(false);
				v.setVisible(true);
				
			}
		});
		btnEditarNombre.setBounds(160, 48, 158, 23);
		contentPane.add(btnEditarNombre);
		
		JButton btnEditarRut = new JButton("Editar Rut");
		btnEditarRut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEditarExpositorRut v = new VentanaEditarExpositorRut(s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnEditarRut.setBounds(160, 82, 158, 23);
		contentPane.add(btnEditarRut);
		
		JButton btnEditarTema = new JButton("Editar tema");
		btnEditarTema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEditarExpositorTema v = new VentanaEditarExpositorTema(s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnEditarTema.setBounds(160, 116, 158, 23);
		contentPane.add(btnEditarTema);
		
		JButton btnEditarCadaParametro = new JButton("Editar cada parametro");
		btnEditarCadaParametro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEditarExpositorTodo v = new VentanaEditarExpositorTodo (s,c,us);
				setVisible(false);
				v.setVisible(true);
				
			}
		});
		btnEditarCadaParametro.setBounds(160, 150, 158, 23);
		contentPane.add(btnEditarCadaParametro);
		
		JButton btnVolverAlMenu = new JButton("Volver al menu");
		btnVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAdmin2 v = new VentanaAdmin2(c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnVolverAlMenu.setBounds(160, 183, 158, 23);
		contentPane.add(btnVolverAlMenu);
	}
}
