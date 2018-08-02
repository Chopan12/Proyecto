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
		
	
	public void agregarUsuario(CuentaUsuario usuario) {
		usuarios.agregarUsuario(usuario);
	}
	
	public void eliminarUsuario(CuentaUsuario usuario) {
		usuarios.eliminarUsuario(usuario);
	}
	
	
	
	public ArrayList<Charla> obtenerL () {
		return charlas.obtenerL();
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

	public CuentaUsuario obtenerUsuario(String rut) {
		return usuarios.buscarUsuario(rut);
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

	public ArrayList<CuentaUsuario> listausuarios() {
		return usuarios.listaUsuarios();
	}
	
}