
public class Expositor extends Persona{
	private String tema;
	public Expositor() {
		super();
		this.tema=null;
	
	}
	
	public Expositor(String nombre, String rut, String tema) {
		super(nombre, rut);
		this.tema=tema;
	}
	
	
/*	public Expositor(String nomExpositor) {
		super(nomExpositor);
		tema=null;
	}
*/
	public void setTema(String tema) { this.tema=tema; }
	public String getTema() { return tema; }
	
/*	
	public void a�adirCharla(Charla charla) { //Se a�ade una charla solo ingresando el objeto Charla
		charlas.agregarCharla(charla);
	}
	public void a�adirCharla(String idCharla,Expositor expositor, Usuario usuario, Sala salaAsignada) { //con todos los datos, se ingresa una charla a la lista
		charlas.agregarCharla(idCharla, expositor, usuario, salaAsignada);
	}
	public boolean verificarCharla(Charla charla) {
		if(charlas.tama�oLista()==0) return false; //si el largo es 0, no existen valores
		for(int i=0; i<charlas.tama�oLista(); i++) {
			if(charlas.obtenerCharla(i).equals(charla))return true;//se verifica que est�, si lo est� finaliza retornando verdadero
		}
		return false;
	}*/
	
}
