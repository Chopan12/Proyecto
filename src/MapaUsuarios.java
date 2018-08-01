import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Set;

public class MapaUsuarios implements Reporte {
	private Hashtable<String, Persona> usuarios;
	
	public MapaUsuarios() {
		usuarios=new Hashtable<String, Persona>();
	}
	public void agregarUsuario(Usuario usuario) {
		//if(usuarios.containsValue(usuario)) return;//se encontró el usuario, por lo que no se deberá agregar
		String key=usuario.getRut();
		usuarios.put(key, usuario);
	}
	public void agregarAdmin (Administrador admin) {
		String key = admin.getRut();
		usuarios.put(key, admin);
	}
	
	public Persona buscarUsuario(String rut) {
		Persona us = usuarios.get(rut);
		return us;
	}
	public void modificarClaveUsuario(String clave, String nuevaClave) {
		Persona persona = usuarios.get(clave);
		persona.setClave(nuevaClave);
		usuarios.put(persona.getRut(), persona);
	}
	public void eliminarUsuario(Persona usuario) {//para eliminar los usuarios
		if(!usuarios.containsValue(usuario))return;//si no encuentra el valor, finaliza ya que el usuario no está ingresado
		String key=(String) usuario.getClave();
		usuarios.remove(key);
	}
	public boolean existeUsuario(Usuario usuario) { //para confirmar si el mapa contiene el usuario que se ingresa
		if(usuarios.containsValue(usuario))return true;
		return false;
	}
	public boolean existeUsuario(String rut) {
		return usuarios.get(rut) != null;
		
	}
	public Persona obtenerUsuario(String idAsiento) {
		return usuarios.get(idAsiento);
	}
	

	public void importarUsuarios () throws IOException {
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
	
	public void importarAdministradores () throws IOException {
		String linea;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("admins.txt"));
			while ((linea = br.readLine()) != null) {
				String[] palabras = new String [3];
				palabras = linea.split(";"); 
				
				Administrador ad = new Administrador ();
				ad.setNombre(palabras[0]);
				ad.setRut(palabras[1]);
				ad.setClave(palabras[2]);
				agregarAdmin(ad);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public Hashtable<String,Persona> obtenerM() {
		return new Hashtable<String,Persona>(usuarios);
	}
	
	

	public Set<String> obtenerClaves () {
		return usuarios.keySet();	 
	}

	
	
	public String reportePantalla () {
		int cont=0;
		for(String clave: usuarios.keySet()) {
			
			Persona us = usuarios.get(clave);
			
			if (!us.esAdmin()) {
			cont++;
			}
		}
		return Integer.toString(cont);
	}
	
	public void reporteArchivo (String r) throws IOException {

		File file = new File(r); //Se abre el archivo 
        
        if(!Desktop.isDesktopSupported()){ //Ver si la plataforma soporta 	
            VentanaAviso.infoVentana("El escritorio no es soportado por la plataforma", "Aviso");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        	
	}
	
	public int size() {
		return usuarios.size();
	}
	
}

	


	
