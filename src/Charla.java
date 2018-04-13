import java.util.ArrayList;
public class Charla {
	private String idCharla;
	private Expositor expositor;
	private ArrayList<Usuario> usuarios;
	private Sala salaAsignada; //para poder ver a que sala está asignada la charla
	public Charla() {
		this.expositor=null;
		usuarios = new ArrayList<Usuario>();
		this.salaAsignada=null;
	}
	
	public Charla(String idCharla, Expositor expositor, Usuario usuario, Sala sala) {
		this.idCharla = idCharla;
		this.expositor=expositor;
		usuarios.add(usuario);
		salaAsignada=sala;
	}
	
	public void setIdCharla(String idCharla) {this.idCharla=idCharla;}
	public String getIdCharla() {return idCharla; }
	public void setExpositor(Expositor expositor) { this.expositor=expositor; }
	public Expositor getExpositor() { return expositor; }
	public void setSalaAsignada(Sala sala) { this.salaAsignada=sala; }
	public Sala getSalaAsignada() { return salaAsignada; }
}
