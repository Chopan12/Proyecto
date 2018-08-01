import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class ListaCharlas implements Reporte{
	private ArrayList<Charla> listaCharlas;
	
	public ListaCharlas() {
		listaCharlas = new ArrayList<Charla>();
	}
	
	public Charla obtenerCharla(Charla charla) {
		for(int j=0; j<listaCharlas.size(); j++) {
			if(listaCharlas.get(j).getIdCharla().equals(charla.getIdCharla()))return listaCharlas.get(j); //se recorre la lista hasta obtener la charla buscada
		}
		return null;		
	}
	
	public Charla obtenerCharla (int i) {
		Charla charla = listaCharlas.get(i);
		return charla;
	}

 
	public Charla obtenerCharla(String idAsiento) { //devolverá la Charla utilizando el id
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
			
			Sala sala = charla.getSalaAsignada(); //se obtiene la sala asignada que tiene la charla
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
	
	public void agregarCharla(Charla charla) {
		String id=charla.getIdCharla();//guardaremos el id para saber si existe
		if(obtenerCharla(id)!=null) {			
			return;//finaliza, ya que existe la sala con su id guardado
		}
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

	public void eliminarCharla (String idCharla){ // Elimina una charla usando la id de la charla
		int index=indexArray(idCharla);  //Se obtiene el indice de donde esta la charla
		if(index==0)return;
		if(recorrerCharlas(idCharla)) {
			if(index!=-1)listaCharlas.remove(index);  //Se remueve de la posicion donde estaba la charla del id que se ingreso, el remove hace el...
		}
				   							//trabajo de acomodar las filas
	
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
	
	
	public void importar() throws IOException {
		BufferedReader br;
		String linea;
		try {
			br = new BufferedReader(new FileReader("charlas.txt")); //Lector de archivos 
			while ((linea = br.readLine()) != null) { //Se lee linea a linea
				String[] palabras = new String [10]; //Se crea un vector para almacenar los datos
				palabras = linea.split(";");  //Los datos en el archivo estan separados por punto y coma 
					
				String fecha = palabras[2]+"/"+palabras[3]+"/"+palabras[4]; //Se crea la fecha 

				Expositor ex = new Expositor (); //Se crea el expositor 
				ex.setNombre(palabras[5]);
				ex.setRut(palabras[6]);
				ex.setTema(palabras[7]);
				Charla charlita = new Charla (palabras[0], Integer.parseInt(palabras[1]), ex, palabras[8], fecha, Integer.parseInt(palabras[9])); //Se crea la charla con todos los datos disponibles
				agregarCharla(charlita); //Se agrega la charla a la lista
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //Excepcion por si no se llega a encontrar el archivo
	}
	}
	
	

	public int size() {
		return listaCharlas.size();
	}
	
	
	public void reporteArchivo (String ruta,Congreso c) throws IOException {
		
		Exportar exp = new Exportar ();
		exp.exportarCharlas(c, ruta);
		File file = new File(ruta); //Se abre el archivo 
        
        if(!Desktop.isDesktopSupported()){ //Ver si la plataforma soporta 	
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
  
		
	}
	
	public String reportePantalla () {
		return Integer.toString(listaCharlas.size());
	}

	public void reporteArchivo(String rutaArchivo) throws IOException {
			
			File file = new File(rutaArchivo); //Se abre el archivo 
	        
	        if(!Desktop.isDesktopSupported()){ //Ver si la plataforma soporta 	
	            VentanaAviso.infoVentana("El escritorio no es soportado por la plataforma", "Aviso");
	            return;
	        }
	        
	        Desktop desktop = Desktop.getDesktop(); //Se abre el archivo 
	        if(file.exists()) desktop.open(file);
	        	
		}
		
		
	

	public ArrayList<Charla> obtenerL() {
		return new ArrayList<Charla>(listaCharlas); //es una copia de la lista c:
	}

}