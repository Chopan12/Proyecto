import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class MapaUsuarios implements Reporte {
	private Hashtable<String, CuentaUsuario> usuarios;
	
	public MapaUsuarios() {
		usuarios=new Hashtable<String, CuentaUsuario>();
	}
	public void agregarUsuario(CuentaUsuario usuario) {
		//if(usuarios.containsValue(usuario)) return;//se encontró el usuario, por lo que no se deberá agregar
		String key=usuario.getRut();
		usuarios.put(key, usuario);
	}
	public void agregarAdmin (CuentaUsuario admin) {
		String key = admin.getRut();
		usuarios.put(key, admin);
	}
	
	public CuentaUsuario buscarUsuario(String rut) {
		CuentaUsuario us = usuarios.get(rut);
		return us;
	}
	public void modificarClaveUsuario(String clave, String nuevaClave) {
		CuentaUsuario persona = usuarios.get(clave);
		persona.setClave(nuevaClave);
		usuarios.put(persona.getRut(), persona);
	}
	public void eliminarUsuario(CuentaUsuario usuario) {//para eliminar los usuarios
		if(!usuarios.containsValue(usuario))return;//si no encuentra el valor, finaliza ya que el usuario no está ingresado
		String key=(String) usuario.getClave();
		usuarios.remove(key);
	}
	public boolean existeUsuario(CuentaUsuario usuario) { //para confirmar si el mapa contiene el usuario que se ingresa
		if(usuarios.containsValue(usuario))return true;
		return false;
	}
	public boolean existeUsuario(String rut) {
		return usuarios.get(rut) != null;
		
	}
	public CuentaUsuario obtenerUsuario(String idAsiento) {
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
				
				CuentaUsuario us = new UsuarioDirector( new UsuarioBuilder() ).haceUsuario(palabras[0], palabras[1], palabras[2]).getCuentaUsuario();
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
				
				CuentaUsuario ad = new UsuarioDirector ( new AdminBuilder() ).haceUsuario(palabras[0], palabras[1], palabras[2]).getCuentaUsuario();
				System.out.println(ad.getNombre() + " " + ad.getRut() + " " + ad.getClave());
				agregarAdmin(ad);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

	
	

	public Set<String> obtenerClaves () {
		return usuarios.keySet();	 
	}

	
	
	public String reportePantalla () {
		int cont=0;
		for(String clave: usuarios.keySet()) {
			
			CuentaUsuario us = usuarios.get(clave);
			
			if (!us.getEsAdmin()) {
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
	public ArrayList<CuentaUsuario> listaUsuarios() {
		return new ArrayList<CuentaUsuario>(usuarios.values());
	}
	
}

	


	
