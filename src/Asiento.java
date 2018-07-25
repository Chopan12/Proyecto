
public class Asiento {
	private String idAsiento,idSala;
	private boolean ocupado;
	
	public Asiento() {
		this.idAsiento=null;
		this.idSala = null;
		this.ocupado=false;
		
	}
	
	public Asiento(String idAsiento,String idSala) {
		this.idAsiento=idAsiento;
		this.idSala=idSala;
		this.ocupado=false;
	}
	
	public Asiento(String idAsiento,String idSala,boolean ocupado) {
		this.idAsiento=idAsiento;
		this.idSala=idSala;
		this.ocupado=ocupado;
	}
	
	
	public void setIdAsiento(String idAsiento) {  this.idAsiento=idAsiento;  }
	public String getIdAsiento() { return idAsiento; }
	public void setIdSala (String idSala) {this.idSala=idSala; }
	public String getIdSala() {System.out.println(idSala); return idSala; }
	public void setAsientoOcupado() { this.ocupado=true; }
	public void setAsientoLibre() { this.ocupado=false; }
	public boolean getEstadoAsiento() { return ocupado; }
}
