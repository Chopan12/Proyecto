import java.util.Hashtable;

public class MapaUsuarios {
	private Hashtable<String, Usuario> usuarios = new Hashtable<String, Usuario>();
	public MapaUsuarios() {
		usuarios=new Hashtable<String, Usuario>();
	}
	public void agregarUsuario(Usuario usuario) {
		if(usuarios.containsValue(usuario)) return;//se encontr� el usuario, por lo que no se deber� agregar
		String key=usuario.getClave();
		usuarios.put(key, usuario);
	}
	public void agregarUsuario() {
		
	}
	public void modificarClaveUsuario(String clave, String nuevaClave) {
		Usuario persona = usuarios.get(clave);
		persona.setClave(nuevaClave);
		usuarios.put(nuevaClave, persona);
	}
	public void eliminarUsuarios(Usuario usuario) {//para eliminar los usuarios
		if(!usuarios.containsValue(usuario))return;//si no encuentra el valor, finaliza ya que el usuario no est� ingresado
		String key=usuario.getClave();
		usuarios.remove(key);
	}
	
	
}
