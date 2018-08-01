import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaCrearCharla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdCharla;
	private JTextField txtDur;
	private JTextField txtFecha;
	private JTextField txtIdSala;
	private JTextField txtNombreEx;
	private JTextField txtRutEx;
	private JTextField txtTemaEx;

	/**
	 * Launch the application.
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public VentanaCrearCharla(Congreso c,Administrador us) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 412);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdCharla = new JTextField();
		txtIdCharla.setBounds(100, 67, 130, 20);
		contentPane.add(txtIdCharla);
		txtIdCharla.setColumns(10);
		
		txtDur = new JTextField();
		txtDur.setBounds(100, 98, 130, 20);
		contentPane.add(txtDur);
		txtDur.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(100, 129, 130, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtIdSala = new JTextField();
		txtIdSala.setBounds(391, 67, 130, 20);
		contentPane.add(txtIdSala);
		txtIdSala.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaAdmin2 vntAd2 = new VentanaAdmin2 (c,us);
				setVisible(false);
				vntAd2.setVisible(true);
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnVolver.setBackground(Color.MAGENTA);
		btnVolver.setBounds(90, 339, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnNewButton = new JButton("Aceptar");

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(248, 339, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Ingrese datos para:");
		lblNewLabel.setBounds(248, 11, 115, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdCharla = new JLabel("Id Charla");
		lblIdCharla.setBounds(26, 70, 51, 14);
		contentPane.add(lblIdCharla);
		
		JLabel lblNewLabel_1 = new JLabel("Duracion (Min)");
		lblNewLabel_1.setBounds(6, 101, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha ");
		lblNewLabel_2.setBounds(39, 132, 38, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Expositor: ");
		lblNewLabel_3.setBounds(245, 177, 92, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("IdSala");
		lblNewLabel_4.setBounds(349, 70, 38, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblCharla = new JLabel("Charla:\r\n");
		lblCharla.setBounds(100, 37, 46, 14);
		contentPane.add(lblCharla);
		
		JLabel lblNewLabel_5 = new JLabel("Sala:\r\n\r\n");
		lblNewLabel_5.setBounds(405, 42, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("MM/dd/YYYY\r\n\r\n");
		lblNewLabel_6.setBounds(238, 129, 72, 20);
		contentPane.add(lblNewLabel_6);
		
		txtNombreEx = new JTextField();
		txtNombreEx.setBounds(240, 202, 86, 20);
		contentPane.add(txtNombreEx);
		txtNombreEx.setColumns(10);
		
		txtRutEx = new JTextField();
		txtRutEx.setBounds(240, 233, 86, 20);
		contentPane.add(txtRutEx);
		txtRutEx.setColumns(10);
		
		txtTemaEx = new JTextField();
		txtTemaEx.setBounds(240, 264, 86, 20);
		contentPane.add(txtTemaEx);
		txtTemaEx.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Nombre");
		lblNewLabel_7.setBounds(184, 205, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Rut");
		lblNewLabel_8.setBounds(184, 236, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Tema");
		lblNewLabel_9.setBounds(184, 267, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Ej: 08/22/2018");
		lblNewLabel_10.setBounds(100, 159, 86, 14);
		contentPane.add(lblNewLabel_10);
		
		JComboBox opcionesAsiento = new JComboBox();
		opcionesAsiento.setModel(new DefaultComboBoxModel(new String[] {"Asientos 50", "Asientos 60", "Asientos 70"}));
		opcionesAsiento.setBounds(391, 126, 130, 20);
		contentPane.add(opcionesAsiento);
		
		JLabel lblCantidadAsientos = new JLabel("Cant Asientos\r\n");
		lblCantidadAsientos.setBounds(315, 132, 72, 14);
		contentPane.add(lblCantidadAsientos);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idCharla,strDuracion,fecha,nombre,rut,tema,idSala;
				int duracion;
				
				idCharla =  txtIdCharla.getText();
				strDuracion = txtDur.getText();
				fecha = txtFecha.getText();
				nombre = txtNombreEx.getText();
				rut = txtRutEx.getText();
				tema = txtTemaEx.getText();
				idSala = txtIdSala.getText();
				duracion = Integer.parseInt(strDuracion);
				
				
				
				/*if (Miscelaneo.esNumerico(strDuracion)) { //Se comprueba si fue numerico el numero ingresado en
				duracion = Integer.parseInt(strDuracion); //Se obtiene la duracion desde el 
				charlita.setDuracion(duracion); 
				//}*/
				
				Expositor ex = new Expositor ();
				ex.setNombre(nombre);
				ex.setRut(rut);
				ex.setTema(tema);
				//thegame
				int cantAs;
				String str = (String)opcionesAsiento.getSelectedItem(); //Se obtiene la opcion del combo box

				switch(str) {
				case "Asientos 50":
					cantAs=50;
					break;
					
				case "Asientos 60":
					cantAs=60;
					break;
					
				case "Asientos 70": //¿70?
					cantAs=70;
					break;
				default:
					cantAs =0;
				}
				
				
				Charla charlita = new Charla (idCharla, duracion, ex, idSala, fecha, cantAs);

		    
		    	c.agregarCharla(charlita); 
		    	
				VentanaOpcionDeseaAgregarCharla ventOp = new VentanaOpcionDeseaAgregarCharla (c,us); 
				setVisible(false);
				ventOp.setVisible(true);
			}
		});
		
		
		
		
	}
}

