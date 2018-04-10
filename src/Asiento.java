
public class Asiento {
	private String idAsiento;
	private Sala salaAsociada;
	
	public Asiento() {
		this.idAsiento=null;
		this.salaAsociada=null;
	}
	
	public Asiento (String idAsiento, Sala sala) {
		this.idAsiento=null;
		this.salaAsociada=sala;
	}
	
	public void setIdAsiento(String idAsiento) {  this.idAsiento=idAsiento;  }
	public String getIdAsiento() { return idAsiento; }
	public void setSalaAsociada(Sala salaAsociada) { this.salaAsociada = salaAsociada; }
	public Sala getSalaAsociada() { return salaAsociada; }
	
	
}
