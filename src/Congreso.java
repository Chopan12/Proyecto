import java.util.Date;

public class Congreso {
	private ListaCharlas charlas = new ListaCharlas();
	private MapaUsuarios usuarios = new MapaUsuarios();
	
	public Congreso() {
		this.charlas=new ListaCharlas();
		this.usuarios=new MapaUsuarios();
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
	
	
	
	
	
	
}