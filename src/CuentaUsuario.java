

import java.util.ArrayList;

public class CuentaUsuario {
	
	
	private String nombre;
	private String rut;
	private String clave;
	private boolean esAdmin;
	private ArrayList< Charla > charlasAsociadas; //charlas a las cuales el usuario asistirá

	public CuentaUsuario( ArrayList<Charla> charlas) {
		rut=null;
		nombre=null;
		clave=null;
		esAdmin=false;
		charlasAsociadas = charlas;
	}
	
	
	public boolean getEsAdmin() {
		return esAdmin;
	}
	
	public void setNombre(String nombre) { this.nombre=nombre; }
	public String getNombre() { return nombre; }
	public void setRut(String rut) { this.rut=rut; }
	public String getRut() { return rut;}

	public String getClave() {
		return clave;
	}

	public void setClave(String nuevaClave) {
		this.clave = nuevaClave;
	}
	

	public void setEsAdmin(boolean b) {
		this.esAdmin = b;
		
	}
	
	
	
	
	
	/*public boolean recorrerAsientos(String idAsiento, String idSala) {//para recorrer los asientos y verificar si, por id, ya se encuentra en sus asientos asociados
	if(charlasAsociadas.size()==0)return false;//no tiene nada dentro
	Asiento asiento;
	String idAs, idSal;
	for(int i=0; i<charlasAsociadas.size(); i++) {
		asiento=charlasAsociadas.get(i);
		idAs=asiento.getIdAsiento();
		idSal=asiento.getIdSala();
		if(idAs.equals(idAsiento)&&idSal.equals(idSal))return true;
	}
	return false;
}*/

public void agregarCharla(Charla charla) {
	if(charlasAsociadas == null || charlasAsociadas.contains(charla))return;
	charlasAsociadas.add(charla);
}

public void eliminarCharla (String idCharla) {
	if(charlasAsociadas == null)
		return;
	Charla charla;
	for(int i=0; i<charlasAsociadas.size(); i++) {
		charla=charlasAsociadas.get(i);
		if(charla.getIdCharla().equals(idCharla))charlasAsociadas.remove(i);
	}
}

public void eliminarCharlaPorExpositor(String nomExpositor,CuentaUsuario us) {
	if(charlasAsociadas == null)
		return;
	Charla charla;
	for(int i=0; i<us.getListaCharlas().size(); i++) {
		charla=us.getListaCharlas().get(i);
		if(charla.getExpositor().getNombre().equals(nomExpositor))us.getListaCharlas().remove(charla);
		
	}
}
public boolean comprobarExpositor (String nomExpositor,CuentaUsuario us) {
	if(charlasAsociadas == null)
		return false;
	Charla ch;Expositor ex;
	for (int i=0; i<us.getListaCharlas().size(); i++) {
		ch = us.getListaCharlas().get(i);
		ex = ch.getExpositor();
		if (ex.getNombre().equals(nomExpositor)) {return true;}
	}
	return false;
}

public void eliminarCharlas() {
	if(charlasAsociadas == null)
		return;
	charlasAsociadas.removeAll(charlasAsociadas);
}

public Charla buscarCharla (String id) {
	if(charlasAsociadas == null)
		return null;
if(charlasAsociadas.size()==0)return null;
	
	for(int i=0;i<charlasAsociadas.size();i++){ //Busca una charla y la devuelve para que sea mostrada
		Charla charla=charlasAsociadas.get(i);
		if((charla.getIdCharla()).equals(id))return charla;	
	}		
	return null;
	
}


	
public boolean validarRut (CuentaUsuario usuario) {
	String rut = usuario.getRut();
	rut.trim(); //lo que hace trim() es eliminar los espacios antes y después del numero o lo que sea que entre
	rut = rut.replace(".", "");
	rut = rut.replace("-", "");
	try {
		int aux = Integer.parseInt(rut);
		int cont=0;
		while(aux>0) {
			aux/=10;
			cont++;
		}
		if(!(cont==9 || cont==8))return false;//si el rut no tiene 9 u 8 digitos, no es un rut válido
		
		
	}catch(NumberFormatException e) {
		return false;
	}
	return true;
}

public Charla getCharla(String idCharla) { //se obtiene la charla mediante su id
	Charla charla;
	String key;
	for(int i=0; i<charlasAsociadas.size(); i++) {
		charla=charlasAsociadas.get(i);
		key=charla.getIdCharla();
		if(key.equals(idCharla))return charla;
	}
	return null;
}

//Setters y getters
public ArrayList<Charla> getListaCharlas(){return charlasAsociadas;}
public int getSize(){return charlasAsociadas.size();}



	

}
	
