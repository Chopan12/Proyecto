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
	
	public String getIdSala() {
		return salaAsignada.getIdSala();
	}

	
	
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

		
		
	}
	
	

