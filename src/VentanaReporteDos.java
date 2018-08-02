import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VentanaReporteDos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public VentanaReporteDos (Congreso c, CuentaUsuario ad) {
		
		
        
		//Diseño Ventana
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
	    ListaCharlas li = c.obtenerLiCh();
	    List l = new List();
		l.setBounds(142, 129, 126, 23);
		
		    	l.add(li.reportePantalla());
		
		contentPane.setLayout(null);
		
		contentPane.add(l);
		
		
				
		JLabel lblIngreseAquiEl = new JLabel("La cantidad de charlas que existen es:\r\n");
		lblIngreseAquiEl.setBounds(126, 96, 230, 14);
		contentPane.add(lblIngreseAquiEl);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaAdmin2 ventanaAd2 = new VentanaAdmin2 (c,ad);
				setVisible(false);
				ventanaAd2.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		button_1.setBackground(Color.RED);
		button_1.setBounds(207, 227, 89, 23);
		contentPane.add(button_1);
	}
}