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
		salas.añadirSala(sala);
	}
	
	
	
	
	
	
}