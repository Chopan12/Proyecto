public class Sala {
	private int idSala, capacTotal, actualCapac;
	private MapaAsientos asientos;
	
	
	public Sala() {
		idSala=-1;
		capacTotal=-1;
		actualCapac=0;
		asientos=new MapaAsientos();
	}
	public Sala(int idSala, int capacTotal) {
		this.idSala=idSala;
		this.capacTotal=capacTotal;
		this.actualCapac=0;
	}
	
	public void setIdSala(int id) { this.idSala=id; }
	public int getIdSala() { return idSala; }
	public void setCapacTotal(int capacidad) { this.capacTotal=capacidad; }
	public int getCapacTotal() { return capacTotal; }
	public void setActualCapac(int capacidad) { this.actualCapac=capacidad; }
	public int getActualCapac() { return actualCapac; }
	
	public void agregarAsiento(Asiento asiento) {
		asientos.agregarAsiento(asiento);
	}
	
	
	
	
}
