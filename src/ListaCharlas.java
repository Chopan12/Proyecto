import java.util.ArrayList;
import java.util.Date;
public class ListaCharlas {
	private ArrayList<Charla> listaCharlas;
	
	public ListaCharlas() {
		listaCharlas = new ArrayList<Charla>();
	}
	public Charla obtenerCharla(Charla charla) {
		for(int j=0; j<listaCharlas.size(); j++) {
			if(listaCharlas.get(j).equals(charla))return listaCharlas.get(j); //se recorre la lista hasta obtener la charla buscada
		}
		return null;		
	}
 
	public Charla obtenerCharla(String idAsiento) {
		Charla charla;
		Sala salaAsignada;
		for(int i=0; i<listaCharlas.size(); i++) {
			charla=listaCharlas.get(i);
			salaAsignada=charla.getSalaAsignada();

			if(salaAsignada.recorrerAsientos(idAsiento))
			return charla;//verificará si la charla contiene el id en sus asientos
		}
		return null;
	}
	public boolean recorrerCharlasAsientos(String idAsiento) {//se utilizará para encontrar si el asiento (según su id) está en el mapa de asientos
		Charla charla;
		for(int i=0; i<listaCharlas.size(); i++) {
			charla=listaCharlas.get(i);
			if(charla.getSalaAsignada().recorrerAsientos(idAsiento))return true; //encontró el asiento
		}
		return false;
	}
	
	public boolean recorrerCharlas(String idAsiento) { //para corroborar que existe la charla
		Charla charla;
		String id;
		for(int i=0; i<listaCharlas.size();i++) {
			
			charla=listaCharlas.get(i);
			Sala sala= charla.getSalaAsignada(); //se obtiene la sala asignada que tiene la charla
			Asiento asiento= sala.obtenerAsiento(idAsiento); //se obtiene el asiento que se está buscando con su id
			id=asiento.getIdAsiento(); //obtenemos el id que tiene el asiento y confirmamos si es el mismo que está entrando
			if(sala.recorrerAsientos(idAsiento)) {
				if(id.equals(idAsiento)) {
					return true; //fue encontrada, así que es verdadero
				}
			}
			
		}
		return false;//no se encontró
	}
	
	private int indexArray(String idCharla) {//se utilizará para ver el indice de donde está ubiada la charla
		if(recorrerCharlas(idCharla)) {//se verifica que exista la charla primero
			Charla charla;
			String id;
			if(listaCharlas.size()==0)return -1;//no hay valores inicializados dentro, por lo tanto no tiene un largo
			for(int i=0; i<listaCharlas.size(); i++) {
				charla=listaCharlas.get(i);
				id=charla.getIdCharla();
				if(id.equals(idCharla))return i;
			}
		}
		return -1;
	}
	
	
	public void agregarCharla(String idCharla, int duracion, Expositor expositor, Sala sala, String fecha){ // Agrega una charla a la lista de charlas
		if(idCharla.equals(" "))return;
		if(expositor.equals(null))return;
		if(sala.equals(null))return;
		if(fecha.equals(null))return;
		if(recorrerCharlas(idCharla))return;//Se verifica si no hay parametros mal ingresados o si esta la charla en la lista, para luego agregarla
		Charla charla = new Charla(idCharla,duracion,expositor,sala, fecha);
		listaCharlas.add(charla); //sala añadida correctamente :D
	}
	public void agregarCharla(Charla charla) {
		String id=charla.getIdCharla();//guardaremos el id para saber si existe
		if(recorrerCharlas(id))return;//finaliza, ya que existe la sala con su id guardado
		listaCharlas.add(charla);
	}
	
	public void modificarCharla(String idCharla,int duracion, Sala sala, String fecha){ // modifica un evento en la lista eventos utilizando su id.
		if(idCharla.equals(""))return;
		if(fecha.equals(null))return;
		if(sala.equals(null))return;
		if(duracion<=0)return;
		if(recorrerCharlas(idCharla)) {
			if(indexArray(idCharla)!=-1) {
				listaCharlas.get(indexArray(idCharla)).setDuracion(duracion);
				listaCharlas.get(indexArray(idCharla)).setSalaAsignada(sala);
				listaCharlas.get(indexArray(idCharla)).setFecha(fecha);
				return;//se finaliza ya que no requiere modificar nada más
			}
			
		}
				
		}
	public void modificarCharla(String idCharla, int duracion) {//se modificará solo la duración de la charla
		if(duracion<=0)return;//si la duración es 0 o negativa, no puede existir
		if(recorrerCharlas(idCharla)) {
			if(indexArray(idCharla)!=-1)listaCharlas.get(indexArray(idCharla)).setDuracion(duracion);
		}
		
	}
	
	public void modificarCharla(String idCharla, Sala sala) { //se utilizará para cambiar la charla de sitio
		if(sala.equals(null))return;//no existe una sala válida ingresada
		if(recorrerCharlas(idCharla)) {
			if(indexArray(idCharla)!=-1)listaCharlas.get(indexArray(idCharla)).setSalaAsignada(sala);
		}
	}
	
	/*public void modificarCharla(String idCharla, String fecha) {
		if(fecha.equals(null))return;//si no se ingresa una fecha válida
		if(recorrerCharlas(idCharla)) {
			Charla charla=listaCharlas.get(indexArray(idCharla));//se obtiene la charla que se debe modificar
			//String fechaAux=charla.getFecha();//se almacena la fecha para comparar si la fecha ingresada es menor a la actual
			//if(fechaAux.after(fecha))return;//Consideraremos que no se puede adelantar una charla, solo atrasarla (Problemas por date)*Cambiar despues*
			//if(fecha.before(fechaAux))return;//es lo mismo que arriba, solo que se ve de otra forma
			if(recorrerCharlas(idCharla)) {
				if(indexArray(idCharla)!=-1)listaCharlas.get(indexArray(idCharla)).setFecha(fecha); //se cambia la fecha a una posterior
			}
		}
	}
	*/
	public Charla buscarCharla(String idCharla){ // Busca charla en la lista usando su idCharla
		if(listaCharlas.size()==0)return null;
		
		for(int i=0;i<listaCharlas.size();i++){ //Busca una charla y la devuelve para que sea mostrada
			Charla charla=listaCharlas.get(i);
			if((charla.getIdCharla()).equals(idCharla))return charla;	
		}		
		return null;
		
	}
	
	public Charla buscarCharla(Expositor expositor) { //Busca una Charla mediante el expositor
		if(listaCharlas.size()==0) return null;
		for(int i = 0; i<listaCharlas.size(); i++) {
			Charla charla=listaCharlas.get(i);
			if(charla.getExpositor().equals(expositor)) return charla;
		}
		return null;
	}
/*	public Charla buscarCharla(Date hora) {//buscará la charla más próxima en base a la fecha que se busca, y la sala en la cual se está buscando
		if(hora.equals(null))return null;
		Charla charla;
		Date fecha, fechaAux;
		for(int i=0; i<listaCharlas.size(); i++) {
			charla=listaCharlas.get(i);
			fecha=charla.getFecha();
			if(hora.after(hora))
		}
		return null;
	}
	*/
/*	private int obtenerIndice (String idCharla) { //Obtiene el indice para poder usar en la funcion eliminar, se crea privado porque solo se utilizara el metodo en esta clase
		if(listaCharlas.size()==0)return -1;
		for(int i=0;i<listaCharlas.size();i++){ //Solamente para obtener indice
			if((listaCharlas.get(i)).getIdCharla().equals(idCharla))return i;
		}		
		return 0;
	}
*/	
	public boolean eliminarCharla (String idCharla){ // Elimina una charla usando la id de la charla
		int index=indexArray(idCharla);  //Se obtiene el indice de donde esta la charla
		if(index==0)return false;
		if(recorrerCharlas(idCharla)) {
			if(index!=-1)listaCharlas.remove(index);  //Se remueve de la posicion donde estaba la charla del id que se ingreso, el remove hace el...
		}
		return true;		   							//trabajo de acomodar las filas
	
	}
	
	public void importar(ArrayList<Charla> charlas) {
		//Importar desde un archivo 	
		
	}

	public int size() {
		return listaCharlas.size();
	}


	
/*	public int tamañoLista() {  
		return listaCharlas.size();  
	} // se utilizará para saber el largo de la lista y hacer otros metodos más adelante
	*/
	
}
