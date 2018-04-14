import java.util.ArrayList;
import java.util.Date;
public class ListaCharlas {
	private ArrayList<Charla> listaCharlas= new ArrayList<Charla>();
	
	public void agregarCharla(String idCharla, int duracion, Expositor expositor, Sala sala, Date fecha){ // Agrega una charla a la lista de charlas
		if(idCharla.equals(" ")){
			return;
		}
		if(expositor.equals(null)) {
			return;
		}
		if(sala.equals(null)){
			return;
		}
		if(fecha.equals(null)) {
			return;
		}
		Charla charla;
		for(int i=0;i<listaCharlas.size();i++){
			charla = listaCharlas.get(i);
			if(charla.getIdCharla().equals(idCharla)){
				return;
			}
		}		//Se verifica si no hay parametros mal ingresados o si esta la charla en la lista, para luego agregarla
		charla = new Charla(idCharla,duracion,expositor,sala, fecha);
		listaCharlas.add(charla);
		return;
	}
	public void agregarCharla(Charla charla) {
		for(int i = 0; i<listaCharlas.size(); i++) {
			if(listaCharlas.get(i).equals(charla))return;//si es que la charla coincide con alguna charla que existe en la lista, se finaliza ya que la Charla ya se encuentra agregada
		}
		listaCharlas.add(charla);
	}
	
	public void modificarCharla(String idCharla,int duracion, Expositor expositor, Sala sala, Date fecha){ // modifica un evento en la lista eventos utilizando su posicion.
		if(idCharla.equals(" ")){
			return;
		}
		if(expositor.equals(null)){
			return;
		}
		if(fecha.equals(null)){
			return;
		}
		if(sala.equals(null)){
			return;
		}
		if(duracion<=0) {
			return;
		}
		Charla c= new Charla(idCharla,duracion,expositor,sala,fecha);
		for (int i=0; i<listaCharlas.size();i++) {
			if ((listaCharlas.get(i)).getIdCharla().equals(idCharla)) {
			listaCharlas.remove(i);
			listaCharlas.add(i, c);
			}
		}
	}
	public Charla buscarCharla(String idCharla){ // Busca charla en la lista usando su idCharla
		if(listaCharlas.size()==0){
			return null;
		}
		for(int i=0;i<listaCharlas.size();i++){ //Busca una charla y la devuelve para que sea mostrada
			if(((listaCharlas.get(i)).getIdCharla()).equals(idCharla)){
				return listaCharlas.get(i);	
			}
		}		
		return null;
		
	}
	
	public Charla buscarCharla(Expositor expositor) { //Busca una Charla mediante el expositor
		if(listaCharlas.size()==0) return null;
		for(int i = 0; i<listaCharlas.size(); i++) {
			if(listaCharlas.get(i).getExpositor().equals(expositor)) return listaCharlas.get(i);
		}
		return null;
	}
	public Charla buscarCharla(String idCharla, Date hora) {//buscará la charla más próxima en base a la hora que se busca, y la sala en la cual se está buscando
		
		return null;
	}
	private int obtenerIndice (String idCharla) { //Obtiene el indice para poder usar en la funcion eliminar, se crea privado porque solo se utilizara el metodo en esta clase
		if(listaCharlas.size()==0){
			return 0;
		}
		for(int i=0;i<listaCharlas.size();i++){ //Solamente para obtener indice
			if((listaCharlas.get(i)).getIdCharla().equals(idCharla)){
				return i;	
			}
		}		
		return 0;
	}
	
	public boolean eliminarCharla (String idCharla){ // Elimina una charla usando la id de la charla
		//int index=obtenerIndice(idCharla);  //Se obtiene el indice de donde esta la charla
		if(obtenerIndice(idCharla)==0){
			return false;
		}else{
			listaCharlas.remove(obtenerIndice(idCharla));  //Se remueve de la posicion donde estaba la charla del id que se ingreso, el remove hace el...
			return true;		   							//trabajo de acomodar las filas
		}
	}
	
	public void importar(ArrayList<Charla> charlas) {
		//Importar desde un archivo 	
		
	}
	
	public int tamañoLista() {  return listaCharlas.size();  }
	public Charla obtenerCharla(int i) {
		for(int j=0; j<tamañoLista(); j++) {
			if(i==j)return listaCharlas.get(j); //se recorre la lista hasta obtener el mismo numero que ingresa, ya que se busca el objeto en el indice "i"
		}
		return null;
		
	}
}
