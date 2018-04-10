import java.util.ArrayList;

public class Sala {
	private int idSala, capacTotal, actualCapac;
	private ArrayList<Asiento> asientos = new ArrayList<Asiento>();
	
	
	public Sala() {
		idSala=-1;
		capacTotal=-1;
		actualCapac=0;
		asientos=new ArrayList<Asiento>();
	}
	public Sala(int idSala, int capacTotal, int actualCapac, Asiento asiento) {
		this.idSala=idSala;
		this.capacTotal=capacTotal;
		this.actualCapac=actualCapac;
		asientos.add(asiento);
		
	}
	
	public void setIdSala(int id) { this.idSala=id; }
	public int getIdSala() { return idSala; }
	public void setCapacTotal(int capacidad) { this.capacTotal=capacidad; }
	public int getCapacTotal() { return capacTotal; }
	public void setActualCapac(int capacidad) { this.actualCapac=capacidad; }
	public int getActualCapac() { return actualCapac; }
	
	
	
	
	
	
}
