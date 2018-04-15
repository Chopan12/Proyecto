import ventana.VentanaPrincipal;
import java.util.Date;
public class Main {
	
	public static void main (String[] args) {

		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal ();
		ventanaPrincipal.setVisible(true);
		Congreso congreso= new Congreso();
		Usuario usuario=new Usuario("Francisco", "197292210", "perdi");
		Expositor expositor=new Expositor("Alen", "199031066", "Econom�a");
		Sala sala=new Sala("70%", 100);
		@SuppressWarnings("deprecation")
		Date fecha=new Date(1973, 2, 31, 69, 70, 35);
		Asiento asiento = new Asiento("A1", true);
		//System.out.println("Pasa por ac�\n\n");
		usuario.agregarAsiento(asiento);
		Charla charla = new Charla("70 o/o", 70, expositor, sala, fecha);
		congreso.agregarCharla(charla);
		congreso.agregarSala(sala);
		congreso.agregarUsuario(usuario);
		congreso.mostrarDatosCharlaUsuario("A1"); //el valor antes puesto es "A1"
		
		
		
	
	
	}
	
	
	
	
	
	
	
}
