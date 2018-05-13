import java.io.IOException;
import java.text.ParseException;
public class Main {
	
	public static void main (String[] args) throws ParseException, IOException {

		Congreso c = new Congreso ();
		c.importar();
	
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal (c);
		ventanaPrincipal.setVisible(true);
		
		ListaCharlas listCh = new ListaCharlas ();
		listCh = c.obtenerL();
		for (int j=0; j<listCh.tamanio(); j++) {
			Charla ch = listCh.obtenerCharla(j);
			String id = ch.getIdCharla();
			System.out.println(id);	
			
		}
	}
}
