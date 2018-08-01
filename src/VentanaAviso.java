	import javax.swing.JOptionPane;

	public class VentanaAviso{


	    public static void infoVentana(String elMensaje, String elTitulo)
	    {
	        JOptionPane.showMessageDialog(null, elMensaje, "Aviso: " + elTitulo, JOptionPane.INFORMATION_MESSAGE);
	    }
	}

