import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
public class Charla {
	private String idCharla;
	private int duracion;//duracion de la charla en minutos
	private String fecha;
	private Expositor expositor;
	private Sala salaAsignada; //para poder ver a que sala está asignada la charla
	public Charla() {
		this.idCharla=null;
		this.fecha=null;
		this.expositor=new Expositor();
		this.salaAsignada=new Sala();
		this.duracion=0;
	}
	
	public Charla(String idCharla, int duracion, Expositor expositor, Sala sala, String fecha) {
		this.idCharla = idCharla;
		this.expositor=expositor;
		salaAsignada=sala;
		this.fecha=fecha;
		this.duracion=duracion;
		
	}
	
	public void setIdCharla(String idCharla) { this.idCharla=idCharla; }
	public String getIdCharla() { return idCharla; }
	public void setExpositor(Expositor expositor) { this.expositor=expositor; }
	public Expositor getExpositor() { return expositor; }
	public void setSalaAsignada(Sala sala) { this.salaAsignada=sala; }
	public Sala getSalaAsignada() { return salaAsignada; }
	public void setFecha(String fecha) { this.fecha=fecha;  }
	public String getFecha() {  return fecha;  }
	public void setDuracion(int duracion) {  this.duracion=duracion;  }
	public int getDuracion() {  return duracion;  }

	
	
/*
	
	public Usuario buscarUsuario(String rut){ // busca al usuario por su rut
		
		if(usuarios.size()==0){
			return null;
		}
		if(usuarios.size()==1) {
			return usuarios.get(1);
		}
		for(int i=0;i<usuarios.size();i++){
			Usuario us= usuarios.get(i);
			if(us.getRut().equals(rut)){
				return usuarios.get(i);	
			}
		}		
		return null;
	}
	
	private int obtenerIndice(String rut){ //busca la posicion de un usuario usando el rut, para poder usar en la funcion eliminar, privado ya que solo se utilizará acá
		if(usuarios.size()==0) {
			return -1;//con esto se comprobará si es que hay valores dentro
		}
		if(usuarios.size()==1){
			return 0; //si el tamaño es 1, el indice donde está posicionado es inmediatamente el 0
		}
		for(int i=0;i<usuarios.size();i++){
			Usuario u=usuarios.get(i);
			if(u.getRut().equals(rut)){
				return i;	
			}
		}		
		return -1;
		
	}
	
	
	public void eliminarUsuario (String rut){ // Elimina un usuario usando el rut
		  //Se obtiene el indice de donde esta el usuario
		if(obtenerIndice(rut)==-1){
			return;
		}else{
			usuarios.remove(obtenerIndice(rut));  //Se remueve de la posicion donde estaba el usuario del rut que se ingreso, el remove hace el trabajo de acomodar la lista
		}
	}
	*/
		public void importar (MapaUsuarios usuarios) throws ParseException { //El throws es para verificar que el date se ingrese bien, ademas la funcion asi lo requiere
			 
			String expalabra1,expalabra2,expalabra3; //Strings para rellenar expositores
			String sapalabra1,sapalabra2,sapalabra3; //Strings para rellenar salas
			String chpalabra1,chpalabra2,chpalabra3,chpalabra4,chpalabra5; //Strings para rellenar charlas
			
			int capAct,capTot;	
			
			try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/nicho/Desktop/charlas.txt"))) { //Funcion para rellenar charla
					String linea,fechaD;
					int d;
					
				    while ((linea = br.readLine()) != null) {
				    	String[] partes = linea.split(";"); //Se obtiene por palabra cada dato a ingresar, y se meten a un arreglo de cadenas
				    	chpalabra1 = partes[0]; //idCharla 
				    	chpalabra2 = partes[1]; //duracion de charla 
				    	d = Integer.parseInt(chpalabra2); //se convierte a int la duracion
				    	chpalabra3 = partes[2]; //mes charla 
				    	chpalabra4 = partes[3]; //dia charla 
				    	chpalabra5 = partes[4]; //año charla 
				    	expalabra1 = partes[5]; //nombre expositor
				    	expalabra2 = partes[6]; //rut expositor
				    	expalabra3 = partes[7]; //tema expositor 
						sapalabra1 = partes[8]; //idsala
						sapalabra2 = partes[9]; //capacidad actual
						capAct = Integer.parseInt(sapalabra2); //cap actual se convierte a entero
						sapalabra3 = partes[2]; //capacidad total
						capTot = Integer.parseInt(sapalabra3); //cap total se convierte a entero
						
						
						//Se concatenaran los strings de mes,año,dia para usarlas en el api DateFormat
						fechaD = chpalabra3;
						fechaD.concat("/");fechaD.concat(chpalabra4);
						fechaD.concat("/");fechaD.concat(chpalabra5); //Aqui la cadena fechaD, deberia quedar (mes/dia/año) como string, usable en DateFormat
						
						
						
						//Se crea el expositor con los datos de arriba
				    	Expositor ex = new Expositor (); //Se crea expositor
				    	ex.setNombre(expalabra1);
				    	ex.setRut(expalabra2);
				    	ex.setTema(expalabra3);
				    	
				    	//Se crea sala con los datos de arriba
				    	Sala sa = new Sala ();
				    	sa.setIdSala(sapalabra1);
				    	sa.setActualCapac(capAct);
				    	sa.setCapacTotal(capTot);
				
				    	Charla charlita = new Charla ();
				    	charlita.setIdCharla(chpalabra1);
				    	charlita.setDuracion(d);
				    	charlita.setExpositor(ex);
				    	charlita.setSalaAsignada(sa);
				    	charlita.setFecha(fechaD);  //Para usar el date va a tener que hacer un cambio
				    	
				    	ListaCharlas charlas = new ListaCharlas(); 
						charlas.agregarCharla(charlita);  //Se agrega la charla creada en la lista
				    }
				    
				} catch (FileNotFoundException e) { //Excepciones
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		
	}
	
	

