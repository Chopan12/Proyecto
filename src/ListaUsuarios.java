import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ListaUsuarios{
	
			private ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
			
			public boolean agregar_usuarios(String rut,String clave,String nombre,Charla charla,Asiento asiento){ // agrega un cliente y retorna mensajes correspondiente a lo ocurrido en el intento.
				int aux=0;
				if(rut.equals(""))return false;
				if(clave.equals(""))return false;
				if(nombre.equals(""))return false;
				if(charla.equals(null))return false;
				if(asiento.equals(null))return false;
		
				for(int i=0;i<listUsuarios.size();i++){
					Usuario u= listUsuarios.get(i);
					if(u.getRut().equals(rut)){
						aux=1;
					}else {
						Usuario us= new Usuario(rut,clave,nombre,charla, asiento);
						listUsuarios.add(us);
						return true;
						}
				}
			}
			
			
			public Usuario buscarUsuario(String rut){ // busca al usuario por su rut
				
				if(listUsuarios.size()==0){
					return null;
				}
				for(int i=0;i<listUsuarios.size();i++){
					Usuario us= listUsuarios.get(i);
					if(us.getRut().equals(rut)){
						return listUsuarios.get(i);	
					}
				}		
				return null;
			}
			
			public int obtenerIndice(String rut){ //busca la posicion de un usuario usando el rut, para poder usar en la funcion eliminar
				if(listUsuarios.size()==0){
					return 0;
				}
				for(int i=0;i<listUsuarios.size();i++){
					Usuario u= listUsuarios.get(i);
					if(u.getRut().equals(rut)){
						return i;	
					}
				}		
				return 0;
				
			}
			
			
			public boolean eliminarUsuario (String rut){ // Elimina un usuario usando el rut
				int index=obtenerIndice(rut);  //Se obtiene el indice de donde esta el usuario
				if(index==0){
					return false;
				}else{
					listUsuarios.remove(index);  //Se remueve de la posicion donde estaba el usuario del rut que se ingreso, el remove hace el...
					return true;		   //trabajo de acomodar la lista
				}
			}
			
			public void importar (ArrayList<Usuario> usuarios) {
				//Aqui se importara desde un .txt a los usuarios
				
			}
		
	}