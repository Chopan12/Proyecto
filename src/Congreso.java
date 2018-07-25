import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Congreso {
	private ListaCharlas charlas;
	private MapaUsuarios usuarios;
	private MapaAsientos asientos;
	
	public Congreso() {
		this.charlas=new ListaCharlas();
		this.usuarios=new MapaUsuarios();
		this.asientos=new MapaAsientos();
	}
	
	public void agregarCharla(Charla charla) {
		if(charlas.size()==0) {
			charlas.agregarCharla(charla);
			return;
		}
		if(charlas.obtenerCharla(charla)==null) {
			charlas.agregarCharla(charla);
		}
	}
	
	@SuppressWarnings("unused")
	public void reporte(String tipo) {
		VentanaReporte v;
		Reporte r;
		switch(tipo) {
		case "Charlas":
			r = charlas;
			break;
		case "Usuarios":
			r = usuarios;
			break;
		default:
			return;
		}
		v = new VentanaReporte(r);
		v.setVisible(true);
	}
	
	
	/*public void agregarCharla(String idCharla, int duracion, Expositor expositor, Sala sala, String fecha) {
		charlas.agregarCharla(idCharla,duracion, expositor, sala, fecha);
	}*/
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.agregarUsuario(usuario);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuarios.eliminarUsuario(usuario);
	}
	
	
	
	public ArrayList<Charla> obtenerL () {
		return charlas.obtenerL();
	}
	
	public MapaUsuarios obtenerMaUs () {
		return usuarios;
	}
	
	
	
	public MapaAsientos obtenerMaAs () {
		return asientos;
	}
 	/*public void mostrarDatosCharlaUsuario(String idAsiento) {
		
		Usuario persona = new Usuario();
		Charla charla = new Charla();
		persona=usuarios.obtenerUsuario(idAsiento);
	
		System.out.println(persona.getNombre());
		System.out.println("No compila\n\n");
		
		charla=charlas.obtenerCharla(idAsiento);
		Sala sala=charla.getSalaAsignada();
		String nombre, rut, nombreExpositor, temaExpositor, id;
		int duracion;
		
		if(charlas.recorrerCharlas(idAsiento)){
				if(sala.verificarEstadoAsiento(idAsiento)) {//hay que verificar si existe la sala y si el asiento está ocupado o no, si lo está se puede continuar
					nombre=persona.getNombre();
					
					rut=persona.getRut();
					nombreExpositor=charla.getExpositor().getNombre();
					temaExpositor=charla.getExpositor().getTema();
					duracion=charla.getDuracion();
					id=charla.getIdCharla();
					
			                      
					System.out.println("Usuario: " + nombre);
					System.out.println("RUT: " + rut);
					System.out.println("Charla dada por: " + nombreExpositor);
					System.out.println("Tema: " + temaExpositor);
					System.out.println("Duracion apróximada: " + duracion);
					System.out.println("Salon: " + id);
			//if(persona.getAsiento(idAsiento).getEstadoAsiento()) return; //no debería pasar nunca, si un asiento está asignado a una persona estará siempre ocupado
				}
		System.out.println("No compila\n\n");
		}
	}*/
	
	public void importar () throws ParseException, IOException {
		asientos.importar();
		charlas.importar();	
		usuarios.importar();
	}
	
}