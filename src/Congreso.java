import java.io.IOException;
import java.text.ParseException;

public class Congreso {
	private ListaCharlas charlas;
	private MapaUsuarios usuarios;
	private MapaSalas salas;
	private MapaAsientos asientos;
	
	public Congreso() {
		this.charlas=new ListaCharlas();
		this.usuarios=new MapaUsuarios();
		this.salas=new MapaSalas();
		this.asientos=new MapaAsientos();
	}
	
	public void agregarCharla(Charla charla) {
		if(charlas.tamanio()==0) {
			charlas.agregarCharla(charla);
			return;
		}
		if(!charlas.recorrerCharlas(charla.getIdCharla())) {
			charlas.agregarCharla(charla);
		}
	}
	public void agregarCharla(String idCharla, int duracion, Expositor expositor, Sala sala, String fecha) {
		charlas.agregarCharla(idCharla,duracion, expositor, sala, fecha);
	}
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.agregarUsuario(usuario);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuarios.eliminarUsuarios(usuario);
	}
	
	public void agregarSala(Sala sala) {
		salas.añadirSala(sala);
	}
	public void agregarAsientoASala(Sala sala, Asiento asiento) {
		if(salas.encontrarSala(sala)){
			salas.añadirAsiento(sala, asiento);
		}
	}
	
	public ListaCharlas obtenerL () {
		return charlas;
	}
	
	public MapaUsuarios obtenerMaUs () {
		return usuarios;
	}
	
	public MapaSalas obtenerMaSa () {
		return salas;
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
		salas.importar(asientos);
		charlas.importar(salas);	
	}
	
}