import java.util.ArrayList;
public class Charla {
	private Expositor expositor;
	private ArrayList<Usuario> usuarios;
	private Sala salaAsignada; //para poder ver a que sala está asignada la charla
	public Charla() {
		this.expositor=null;
		usuarios = new ArrayList<Usuario>();
		this.salaAsignada=null;
	}
	
	public Charla(Expositor expositor, Usuario usuario, Sala sala) {
		this.expositor=expositor;
		usuarios.add(usuario);
		salaAsignada=sala;
	}
	
	public void setExpositor(Expositor expositor) { this.expositor=expositor; }
	public Expositor getExpositor() { return expositor; }
	public void setSalaAsignada(Sala sala) { this.salaAsignada=sala; }
	public Sala getSalaAsignada() { return salaAsignada; }
}
