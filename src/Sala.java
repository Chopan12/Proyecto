public class Sala {
	private int capacTotal, actualCapac;
	private String idSala;
	private MapaAsientos asientos;
	
	
	public Sala() {
		idSala=null;
		capacTotal=-1;
		actualCapac=0;
		asientos=new MapaAsientos();
	}
	public Sala(String idSala) {
		this.idSala=idSala;
		this.capacTotal=50;//por defecto serán 50 sillas por sala
		this.actualCapac=0;
	}
	public Sala(String idSala, int capacTotal) {//por si la sala tiene otras dimensiones
		this.idSala=idSala;
		this.capacTotal=capacTotal;
		this.actualCapac=0;
	}
	
	
	public void setIdSala(String id) { this.idSala=id; }
	public String getIdSala() { return idSala; }
	public void setCapacTotal(int capacidad) { this.capacTotal=capacidad; }
	public int getCapacTotal() { return capacTotal; }
	public void setActualCapac(int capacidad) { this.actualCapac=capacidad; }
	public int getActualCapac() { return actualCapac; }

	
	public void agregarAsiento(Asiento asiento) {//se agrega un asiento al mapa de asientos
		asientos.agregarAsiento(asiento);
	}
	public boolean recorrerAsientos(Asiento asiento) {//para corroborar si el asiento existe
		if(asientos.verificarAsiento(asiento))return true;
		return false;
	}
	
	public boolean recorrerAsientos(String idAsiento) {
		boolean valor;
		valor=asientos.verificarAsiento(idAsiento);
		return valor;
	
	}
	
	public boolean verificarEstadoAsiento(String idAsiento) {
		return asientos.estadoAsiento(idAsiento);
	}
	
}
