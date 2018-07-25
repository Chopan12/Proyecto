import java.io.IOException;
import java.text.ParseException;
public class Main {
	
	public static void main (String[] args) throws ParseException, IOException { 

		Congreso c = new Congreso ();
		c.importar();
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal (c);
		ventanaPrincipal.setVisible(true);
	}
}
