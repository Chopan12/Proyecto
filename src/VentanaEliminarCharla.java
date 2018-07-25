import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEliminarCharla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombreExp;


	public VentanaEliminarCharla(Usuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elimine su charla:\r\n");
		lblNewLabel.setForeground(new Color(255, 51, 204));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(132, 11, 171, 33);
		contentPane.add(lblNewLabel);
		
		nombreExp = new JTextField();
		nombreExp.setBounds(140, 92, 132, 20);
		contentPane.add(nombreExp);
		nombreExp.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el nombre del expositor de \r\nla charla que quiere eliminar \r\n");
		lblNewLabel_1.setForeground(new Color(255, 51, 153));
		lblNewLabel_1.setBounds(69, 55, 317, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre :\r\n ");
		lblNewLabel_2.setForeground(new Color(255, 51, 204));
		lblNewLabel_2.setBounds(69, 95, 56, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				us.eliminarCharlaPorExpositor(nombreExp.getText(),us);
				if (us.comprobarExpositor(nombreExp.getText(),us)) {
				JOptionPane.showMessageDialog(null, "Se elimino satisfactoriamente la charla", "Comprobar",JOptionPane.OK_CANCEL_OPTION	);
			}else {
				JOptionPane.showMessageDialog(null, "No se encontro el expositor", "Comprobar",JOptionPane.ERROR_MESSAGE	);
			}
			}
		});
		btnNewButton.setBounds(160, 201, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Cerrar\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(button.getFont().deriveFont(button.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		button.setBackground(Color.MAGENTA);
		button.setBounds(35, 201, 89, 23);
		contentPane.add(button);
	}
}
