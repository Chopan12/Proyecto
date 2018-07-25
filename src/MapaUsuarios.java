import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Set;

public class MapaUsuarios implements Reporte {
	private Hashtable<String, Usuario> usuarios;
	
	public MapaUsuarios() {
		usuarios=new Hashtable<String, Usuario>();
	}
	public void agregarUsuario(Usuario usuario) {
		//if(usuarios.containsValue(usuario)) return;//se encontró el usuario, por lo que no se deberá agregar
		String key=usuario.getRut();
		usuarios.put(key, usuario);
	}
	
	public Usuario buscarUsuario(String rut) {
		Usuario us = usuarios.get(rut);
		return us;
	}
	public void modificarClaveUsuario(String clave, String nuevaClave) {
		Usuario persona = usuarios.get(clave);
		persona.setClave(nuevaClave);
		usuarios.put(nuevaClave, persona);
	}
	public void eliminarUsuario(Usuario usuario) {//para eliminar los usuarios
		if(!usuarios.containsValue(usuario))return;//si no encuentra el valor, finaliza ya que el usuario no está ingresado
		String key=usuario.getClave();
		usuarios.remove(key);
	}
	public boolean existeUsuario(Usuario usuario) { //para confirmar si el mapa contiene el usuario que se ingresa
		if(usuarios.containsValue(usuario))return true;
		return false;
	}
	public boolean existeUsuario(String rut) {
		return usuarios.get(rut) != null;
		
	}
	public Usuario obtenerUsuario(String idAsiento) {
		return usuarios.get(idAsiento);
	}
	

	public void importar () throws IOException {
		String linea;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("usuarios.txt"));
			while ((linea = br.readLine()) != null) {
				String[] palabras = new String [3];
				palabras = linea.split(";"); 
				
				Usuario us = new Usuario ();
				us.setNombre(palabras[0]);
				us.setRut(palabras[1]);
				us.setClave(palabras[2]);
				agregarUsuario(us);	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	

	public Set<String> obtenerClaves () {
		return usuarios.keySet();	 
	}

	
	
	public String reportePantalla () {
		return null;
	}
	
	public void reporteArchivo (String r) throws IOException {

		File file = new File(r); //Se abre el archivo 
        
        if(!Desktop.isDesktopSupported()){ //Ver si la plataforma soporta 	
            System.out.println("El escritorio no es soportado por la plataforma");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        	
	}
	
}

	


	
