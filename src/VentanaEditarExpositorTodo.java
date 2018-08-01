import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEditarExpositorTodo extends JFrame {

	private JPanel contentPane;
	private JTextField NuevoNombre;
	private JTextField NuevoRut;
	private JTextField NuevoTema;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEditarExpositorTodo frame = new VentanaEditarExpositorTodo();
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
	public VentanaEditarExpositorTodo(Charla s, Congreso c,Administrador us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(36, 84, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblRut = new JLabel("Rut:");
		lblRut.setBounds(36, 109, 46, 14);
		contentPane.add(lblRut);
		
		JLabel lblTema = new JLabel("Tema:");
		lblTema.setBounds(36, 134, 46, 14);
		contentPane.add(lblTema);
		
		NuevoNombre = new JTextField();
		NuevoNombre.setText("");
		NuevoNombre.setBounds(92, 81, 86, 20);
		contentPane.add(NuevoNombre);
		NuevoNombre.setColumns(10);
		
		NuevoRut = new JTextField();
		NuevoRut.setBounds(92, 106, 86, 20);
		contentPane.add(NuevoRut);
		NuevoRut.setColumns(10);
		
		NuevoTema = new JTextField();
		NuevoTema.setBounds(92, 131, 86, 20);
		contentPane.add(NuevoTema);
		NuevoTema.setColumns(10);
		
		JLabel lblColocarNuevosParametros = new JLabel("Colocar nuevos parametros:");
		lblColocarNuevosParametros.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblColocarNuevosParametros.setBounds(36, 30, 294, 29);
		contentPane.add(lblColocarNuevosParametros);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Expositor ex = s.getExpositor();
				
				ex.setNombre(NuevoNombre.getText());
				ex.setRut(NuevoRut.getText());
				ex.setTema(NuevoTema.getText());
				
				
				
				VentanaEditarExpositor v = new VentanaEditarExpositor(s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnContinuar.setBounds(225, 173, 89, 23);
		contentPane.add(btnContinuar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEditarExpositor v = new VentanaEditarExpositor (s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnVolver.setBounds(37, 173, 89, 23);
		contentPane.add(btnVolver);
	}

}
