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

public class VentanaVerCharlas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public VentanaVerCharlas (Congreso c, CuentaUsuario us) {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	    ArrayList<Charla> listilla = us.getListaCharlas();
		
	    List l = new List();
		l.setBounds(10, 44, 414, 146);
		
		for(Charla charla : listilla) {
	    	l.add("Id:" + charla.getIdCharla() + " Exp:" + charla.getExpositor().getNombre() + " Tema:" + charla.getExpositor().getTema() + " Fecha:" + charla.getFecha() + " Sala:" + charla.getIdSala());
	    }
		
		contentPane.setLayout(null);
		
		contentPane.add(l);
		
		
				
		JLabel lblIngreseAquiEl = new JLabel("Sus charlas disponibles son:");
		lblIngreseAquiEl.setBounds(10, 11, 232, 14);
		contentPane.add(lblIngreseAquiEl);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaUsuario2 ventanaUs2 = new VentanaUsuario2 (c,us);
				setVisible(false);
				ventanaUs2.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		button_1.setBackground(Color.RED);
		button_1.setBounds(207, 227, 89, 23);
		contentPane.add(button_1);
	}
}