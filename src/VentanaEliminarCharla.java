import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaEliminarCharla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idCharla;


	public VentanaEliminarCharla(Usuario us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		idCharla = new JTextField();
		idCharla.setColumns(10);
		idCharla.setBounds(10, 211, 86, 20);
		contentPane.add(idCharla);
		
		ArrayList<Charla> listilla = us.getListaCharlas();
		
	    List l = new List();
		l.setBounds(10, 10, 509, 121);
		
		for(Charla charla : listilla) {
	    	l.add("Id:" + charla.getIdCharla() + " Exp:" + charla.getExpositor().getNombre() + " Tema:" + charla.getExpositor().getTema() + " Fecha:" + charla.getFecha() + " Sala:" + charla.getIdSala());
	    }
		
		contentPane.setLayout(null);
		
		contentPane.add(l);
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = idCharla.getText();
				us.eliminarCharla(s);
				
				
				if (us.getSize()==0 && s!="") {
					VentanaAviso.infoVentana("No tiene charlas guardadas", "Error");
				}
				if (s.equals("") && us.getSize()>0) {
					VentanaAviso.infoVentana("Debe ingresar una id", "Error");
				}
				if(us.buscarCharla(s)==null && us.getSize()>0) {
					VentanaAviso.infoVentana("Charla eliminada exitosamente", "Aviso");
				}
			setVisible(false);
			}
		});
		btnNewButton.setBounds(161, 300, 89, 23);
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
		button.setBounds(31, 300, 89, 23);
		contentPane.add(button);
		
		JLabel lblIngreseElId = new JLabel("Ingrese el id de la charla de la cual quiere eliminar:\r\n");
		lblIngreseElId.setBounds(10, 158, 328, 14);
		contentPane.add(lblIngreseElId);
		

		
		JLabel label = new JLabel("ID\r\n");
		label.setForeground(Color.RED);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label.setBounds(106, 214, 46, 14);
		contentPane.add(label);
	}
}
