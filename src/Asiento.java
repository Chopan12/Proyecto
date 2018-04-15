
public class Asiento {
	private String idAsiento;
	private boolean ocupado;
	
	public Asiento() {
		this.idAsiento=null;
		this.ocupado=false;
		
	}
	
	public Asiento(String idAsiento) {
		this.idAsiento=idAsiento;
		this.ocupado=false;
	}
	
	public Asiento(String idAsiento,boolean ocupado) {
		this.idAsiento=idAsiento;
		this.ocupado=ocupado;
	}
	
	
	public void setIdAsiento(String idAsiento) {  this.idAsiento=idAsiento;  }
	public String getIdAsiento() { return idAsiento; }
	public void setAsientoOcupado() { this.ocupado=true; }
	public void setAsientoLibre() { this.ocupado=false; }
	public boolean getEstadoAsiento() { return ocupado; }
}
