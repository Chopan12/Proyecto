import java.util.ArrayList;

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
}



