import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaAgrChr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idCh;


	public VentanaAgrChr(Congreso c, Usuario us) {
		
		
        
		//Diseño Ventana
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	    ArrayList<Charla> listilla = c.obtenerL();
		
	    
	    List l = new List();
		l.setBounds(0, 10, 434, 113);
		 for(Charla charla : listilla) {
		    	l.add("Id:" + charla.getIdCharla() + " Exp:" + charla.getExpositor().getNombre() + " Tema:" + charla.getExpositor().getTema() + " Fecha:" + charla.getFecha() + " Sala:" + charla.getIdSala());
		    }
		
		contentPane.setLayout(null);
		
		contentPane.add(l);

		
		//Boton
		JButton button = new JButton("Volver\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaUsuario2 ventanaUs2 = new VentanaUsuario2 (c, us);
				setVisible(false);
				ventanaUs2.setVisible(true);
			}
		});
		button.setBounds(58, 227, 89, 23);
		button.setForeground(Color.BLACK);
		button.setFont(button.getFont().deriveFont(button.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		button.setBackground(Color.MAGENTA);
		contentPane.add(button);
		
		
				
		JLabel lblIngreseAquiEl = new JLabel("Ingrese aqui el id de la charla ");
		lblIngreseAquiEl.setBounds(10, 109, 170, 14);
		contentPane.add(lblIngreseAquiEl);
		
		JLabel lblALaCual = new JLabel("Ingrese el id de la charla a la cual le interesa ir:\r\n");
		lblALaCual.setBounds(10, 131, 328, 14);
		contentPane.add(lblALaCual);
		
		idCh = new JTextField();
		idCh.setBounds(10, 156, 86, 20);
		contentPane.add(idCh);
		idCh.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID\r\n");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_1.setBounds(101, 156, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = idCh.getText();
				if (s.equals("")) {
					VentanaAviso.infoVentana("Debe ingresar una id", "Error");
				}
				VentanaUsuario2 v2 = new VentanaUsuario2 (c,us);
				ListaCharlas lCh = c.obtenerLiCh();
				if (lCh.buscarCharla(s)!=null) {
				VentanaAviso.infoVentana("Charla agregada correctamente", "Aviso");
				Charla ch = c.obtenerCharla(s); 
				us.agregarCharla(ch);
				setVisible(false);
				v2.setVisible(true);
				}else {
					VentanaAviso.infoVentana("La charla no existe", "Error");
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		button_1.setBackground(Color.RED);
		button_1.setBounds(207, 227, 89, 23);
		contentPane.add(button_1);
	}
}
