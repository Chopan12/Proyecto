import java.util.Hashtable;

public class MapaUsuarios {
	private Hashtable<String, Usuario> usuarios;
	
	public MapaUsuarios() {
		usuarios=new Hashtable<String, Usuario>();
	}
	public void agregarUsuario(Usuario usuario) {
		if(usuarios.containsValue(usuario)) return;//se encontró el usuario, por lo que no se deberá agregar
		String key=usuario.getClave();
		usuarios.put(key, usuario);
	}
	
	public void modificarClaveUsuario(String clave, String nuevaClave) {
		Usuario persona = usuarios.get(clave);
		persona.setClave(nuevaClave);
		usuarios.put(nuevaClave, persona);
	}
	public void eliminarUsuarios(Usuario usuario) {//para eliminar los usuarios
		if(!usuarios.containsValue(usuario))return;//si no encuentra el valor, finaliza ya que el usuario no está ingresado
		String key=usuario.getClave();
		usuarios.remove(key);
	}
	public boolean containsValue(Usuario usuario) { //para confirmar si el mapa contiene el usuario que se ingresa
		if(usuarios.containsValue(usuario))return true;
		return false;
	}
	public Usuario obtenerUsuario(String idAsiento) {
		return usuarios.get(idAsiento);
	}
	
	
}
