import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaReporte extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnPanelReporte;


	public VentanaReporte(Reporte r) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGenerarReporte = new JButton("Generar Reporte");
		btnGenerarReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: obtener path y llamar a r.reporteArchivo(String)
			}
		});
		btnGenerarReporte.setBounds(149, 215, 113, 23);
		contentPane.add(btnGenerarReporte);
		
		txtpnPanelReporte = new JTextPane();
		txtpnPanelReporte.setEditable(false);
		txtpnPanelReporte.setBounds(48, 11, 304, 180);
		contentPane.add(txtpnPanelReporte);
		txtpnPanelReporte.setText(r.reportePantalla());
		
		
	
	}
}
