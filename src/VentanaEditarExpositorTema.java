import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.awt.event.ActionEvent;

public class VentanaEditarExpositorTema extends JFrame {

	private JPanel contentPane;
	private JTextField NuevoTema;
	private JButton btnVolver;

	public VentanaEditarExpositorTema(Charla s, Congreso c,CuentaUsuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarNuevoTema = new JLabel("Ingresar nuevo tema:");
		lblIngresarNuevoTema.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIngresarNuevoTema.setBounds(113, 11, 204, 26);
		contentPane.add(lblIngresarNuevoTema);
		
		NuevoTema = new JTextField();
		NuevoTema.setBounds(102, 61, 214, 26);
		contentPane.add(NuevoTema);
		NuevoTema.setColumns(10);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				Expositor expositor = s.getExpositor();
				expositor.setTema(NuevoTema.getText());
				
				/*Exportar ex = new Exportar ();
				try {
					ex.exportarTodo(c);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
				VentanaEditarExpositor v = new VentanaEditarExpositor (s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnContinuar.setBounds(316, 154, 89, 23);
		contentPane.add(btnContinuar);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEditarExpositor v = new VentanaEditarExpositor (s,c,us);
				setVisible(false);
				v.setVisible(true);
			}
		});
		btnVolver.setBounds(45, 154, 89, 23);
		contentPane.add(btnVolver);
	}

}
