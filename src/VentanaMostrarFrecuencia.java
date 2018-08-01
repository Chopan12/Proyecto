import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JTextPane;

public class VentanaMostrarFrecuencia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMostrarFrecuencia frame = new VentanaMostrarFrecuencia();
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
	public VentanaMostrarFrecuencia(Congreso c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<Charla> listilla = c.obtenerL(); //Se copia el arraylist para no romper encapsulamiento
		FuncionesPropias f = new FuncionesPropias (); //Clase de funcion propia para usarla
		
		
		List l = new List(); //Lista para usar interfaz de ventanas
		l.setBounds(0, 43, 434, 113);
		 l.add("                                    Id                           Fecha                              Fi");
		 for(Charla charla : listilla) { //Se recorre el arraylist
		    	l.add("                                   "+charla.getIdCharla() +"                    " + charla.getFecha() + "                    " + String.format("%.3f",f.obtenerFrecuenciaRelativa(c,charla.getIdCharla()) )     );
		 } //Luego se imprimen los resultados, id charla, su fecha y su frecuencia relativa
		
		 
		
		contentPane.setLayout(null);
		
		contentPane.add(l);

		
		JLabel lblTablaDeFrecuencia = new JLabel("Tabla de frecuencia");
		lblTablaDeFrecuencia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTablaDeFrecuencia.setBounds(142, 11, 240, 26);
		contentPane.add(lblTablaDeFrecuencia);
	}
}
