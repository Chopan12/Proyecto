import java.util.ArrayList;
public class Congreso {
	private ArrayList<Charla> charlas = new ArrayList<Charla>();
	
	public Congreso() {
		this.charlas=new ArrayList<Charla>();
	}
	public Congreso(Charla charla) {
		charlas.add(charla);
	}
	
	public boolean agregarCharla(String idCharla,Expositor expositor, Usuario usuario, Sala salaAsignada){ // Agrega una charla a la lista de charlas
		int size = charlas.size();
		if(idCharla.equals(" ")){
			return false;
		}
		if(expositor.equals(null)) {
			return false;
		}
		if(usuario.equals(null)){
			return false;
		}
		if(salaAsignada.equals(null)){
			return false;
		}
	
		for(int i=0;i<size;i++){  //
			if((charlas.get(i)).getIdCharla().equals(idCharla)){
				return false;
			}
		}		//Se verifica si no hay cosas raras y si tampoco esta la charla en la lista, para luego agregarla
		Charla c= new Charla(idCharla,expositor,usuario,salaAsignada);
		charlas.add(c);
		size=charlas.size();
		return true;
		
	}
	
	public boolean modificarCharla(String idCharla,Expositor expositor, Usuario usuario, Sala salaAsignada){ // modifica un evento en la lista eventos utilizando su posicion.
		if(idCharla.equals(" ")){
			return false;
		}
		if(expositor.equals(null)){
			return false;
		}
		if(usuario.equals(null)){
			return false;
		}
		if(salaAsignada.equals(null)){
			return false;
		}
		Charla c= new Charla(idCharla,expositor,usuario,salaAsignada);
		for (int i=0; i<charlas.size();i++) {
			if ((charlas.get(i)).getIdCharla().equals(idCharla)) {
			charlas.remove(i);
			charlas.add(i, c);
			}
		}
		return true;
	}
	
	public Charla buscarCharla(String idCharla){ // Busca charla en la lista usando su idCharla
		if(charlas.size()==0){
			return null;
		}
		for(int i=0;i<charlas.size();i++){ //Busca una charla y la devuelve para que sea mostrada
			if(((charlas.get(i)).getIdCharla()).equals(idCharla)){
				return charlas.get(i);	
			}
		}		
		return null;
		
	}
	
	public int obtenerIndice (String idCharla) { //Obtiene el indice para poder usar en la funcion eliminar
		if(charlas.size()==0){
			return 0;
		}
		for(int i=0;i<charlas.size();i++){ //Solamente para obtener indice
			if((charlas.get(i)).getIdCharla().equals(idCharla)){
				return i;	
			}
		}		
		return 0;
	}
	
	public boolean eliminarCharla (String idCharla){ // Elimina una charla usando la id de la charla
		int index=obtenerIndice(idCharla);  //Se obtiene el indice de donde esta la charla
		if(index==0){
			return false;
		}else{
			charlas.remove(index);  //Se remueve de la posicion donde estaba la charla del id que se ingreso, el remove hace el...
			return true;		   //trabajo de acomodar las filas
		}
	}
	
	public void importar(ArrayList<Charla> charlas) {
		//Importar desde un archivo 
	
		
		
		
	}
	
	
	
	
}