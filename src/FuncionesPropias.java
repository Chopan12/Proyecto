import java.util.ArrayList;
import java.util.Hashtable;

public class FuncionesPropias {
	/*Funciones Propias*/
	
	
	
	//Funcion en interfaz grafica de administrador
	public int[] verCharlasUsuario (MapaUsuarios m) {
		
		//Funcion: retornar un vector de largo 2, la posicion 0 con la cantidad de usuarios y la posicion 1 con la cantidad de charlas (total)
		int [] contCharlasYUsuarios = new int[2];
		contCharlasYUsuarios[0]=0;
		contCharlasYUsuarios[1]=0;
		
		for(String clave: m.obtenerClaves()) {

			Persona us = m.buscarUsuario(clave);
			
			if (!us.esAdmin()) {
			contCharlasYUsuarios[0]++;
			Usuario aux = (Usuario)us;
			ArrayList <Charla> listita = aux.getListaCharlas();
			contCharlasYUsuarios[1]+=listita.size();
			}
			
			
			
		}
		return contCharlasYUsuarios;
	}


	public double obtenerFrecuenciaRelativa(Congreso c,String idCharla) {
		
		int cont=0;
		ListaCharlas l = new ListaCharlas(); 
		Hashtable <String,Persona> usuarios = c.obtenerMaUs();
		
			Charla aux = l.buscarCharla(idCharla);
	
			for(String clave: usuarios.keySet()) {
	        
	        Persona us = usuarios.get(clave);
	
	        if (!us.esAdmin()) {
	        	cont++;
	        }
		}
			return ((double)cont)/((double)aux.getSalaAsignada().getCapacTotal());
	}
}




