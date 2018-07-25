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
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	    ArrayList<Charla> listilla = c.obtenerL();
		
	    
	    List l = new List();
		l.setBounds(0, 10, 434, 113);
		 for(Charla charla : listilla) {
		    	l.add("id:" + charla.getIdCharla() + " exp:" + charla.getExpositor().getNombre() + " fecha:" + charla.getFecha() + " sala:" + charla.getIdSala());
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
		
		JLabel lblALaCual = new JLabel("a la cual le interesa ir :");
		lblALaCual.setBounds(10, 131, 108, 14);
		contentPane.add(lblALaCual);
		
		idCh = new JTextField();
		idCh.setBounds(207, 128, 86, 20);
		contentPane.add(idCh);
		idCh.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID\r\n");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_1.setBounds(303, 130, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaCharlas lCh = new ListaCharlas (); 
				String s = idCh.getText();
				Charla ch = lCh.buscarCharla(s);
				us.agregarCharla(ch);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		button_1.setBackground(Color.RED);
		button_1.setBounds(207, 227, 89, 23);
		contentPane.add(button_1);
	}
}
