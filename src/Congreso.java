import java.util.Date;

public class Congreso {
	private ListaCharlas charlas;
	private MapaUsuarios usuarios;
	private MapaSalas salas;
	
	public Congreso() {
		this.charlas=new ListaCharlas();
		this.usuarios=new MapaUsuarios();
		this.salas=new MapaSalas();
	}
	public void agregarCharla(Charla charla) {
		if(!charlas.recorrerCharlas(charla.getIdCharla())) {
			charlas.agregarCharla(charla);
		}
	}
	public void agregarCharla(String idCharla, int duracion, Expositor expositor, Sala sala, Date fecha) {
		charlas.agregarCharla(idCharla,duracion, expositor, sala, fecha);
	}
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.agregarUsuario(usuario);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuarios.eliminarUsuarios(usuario);
	}
	
	public void agregarSala(Sala sala) {
		salas.a�adirSala(sala);
	}
	
	public void mostrarDatosCharlaUsuario(String idAsiento) {
		Usuario persona;
		Charla charla;
		persona=usuarios.obtenerUsuario(idAsiento);
		//if(persona.equals(null))return;
		charla=charlas.obtenerCharla(idAsiento);
		if(charlas.recorrerCharlas(idAsiento) && charla.getSalaAsignada().verificarEstadoAsiento(idAsiento)) {//hay que verificar si existe la sala y si el asiento est� ocupado o no, si lo est� se puede continuar
			System.out.println("Usuario: " + persona.getNombre() + "\nRut :" + persona.getRut() + 
								"\nCharla de: " + charla.getExpositor().getNombre() + "\nTema: " +
								charla.getExpositor().getTema() + "\nDuraci�n aproximada: " + charla.getDuracion() +
								"\nSala asignada: " + charla.getIdCharla());
			
			//if(persona.getAsiento(idAsiento).getEstadoAsiento()) return; //no deber�a pasar nunca, si un asiento est� asignado a una persona estar� siempre ocupado
		}
		
	}
	
	
	
	
	
	
}