import java.text.ParseException;
import java.util.Date;
public class Main {
	
	public static void main (String[] args) throws ParseException {

		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal ();
		ventanaPrincipal.setVisible(true);
		
		/*Usuario usuario=new Usuario("Francisco", "197292210", "perdi");
		Expositor expositor=new Expositor("Alen", "199031066", "Economía");
		Sala sala=new Sala("70%", 100);
		String fecha="01/22/2018";
		Asiento asiento = new Asiento("A1", true);
		//System.out.println("Pasa por acá\n\n");
		usuario.agregarAsiento(asiento);
		sala.agregarAsiento(asiento);
		Charla charla = new Charla("70 o/o", 70, expositor, sala, fecha);
		Congreso congreso= new Congreso();
		congreso.agregarUsuario(usuario);
		congreso.agregarCharla(charla);
		congreso.agregarAsientoASala(sala, asiento);
		congreso.agregarSala(sala);
		//congreso.agregarAsientoASala(sala, asiento);
		
		congreso.mostrarDatosCharlaUsuario("A1"); //el valor antes puesto es "A1"*/
		Charla ch = new Charla ();
		ch.importar();
	}
	
	
	
	
	
	
	
}
