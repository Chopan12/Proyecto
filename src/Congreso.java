import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Hashtable;

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
		
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.agregarUsuario(usuario);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuarios.eliminarUsuario(usuario);
	}
	
	
	
	public ArrayList<Charla> obtenerL () {
		return charlas.obtenerL();
	}
	
	public Hashtable<String, Persona> obtenerMaUs () {
		return usuarios.obtenerM();
	}
	
	public MapaAsientos obtenerMaAs () {
		return asientos;
	}
 	
	
	public void importar () throws ParseException, IOException {
		asientos.importar();
		charlas.importar();	
		usuarios.importarUsuarios();
		usuarios.importarAdministradores();
	}

	public Charla obtenerCharla(String s) {
		
		return charlas.buscarCharla(s);
	}

	public Usuario obtenerUsuario(String rut) {
		return (Usuario)usuarios.buscarUsuario(rut);
	}
	
	public Administrador obtenerAdmin (String rut) {
		return (Administrador)usuarios.buscarUsuario(rut);
	}
	
	public boolean existeUsuario (String rut) {
		if (usuarios.buscarUsuario(rut)!=null) {
			return true;
		}else {
			return false;
		}
	}

	public MapaUsuarios obtenerMapUs() {
		return usuarios;
	}
	
	public ListaCharlas obtenerLiCh() {
		return charlas;
	}
	
	public Charla obtenerCharlaid (String id) {
		return charlas.buscarCharla(id);
	}
	
}