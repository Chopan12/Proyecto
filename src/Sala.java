public class Sala {
	private int capacTotal;
	private String idSala;
	private MapaAsientos asientos;
	
	/*
	public Sala() {
		idSala="A5";
		capacTotal=-1;
		actualCapac=0;
		asientos=new MapaAsientos();
	}*/
	public Sala(String idSala) {
		this.idSala=idSala;
		this.capacTotal=50;//por defecto serán 50 sillas por sala
		
	}
	public Sala(String idSala, int capacTotal) {//por si la sala tiene otras dimensiones
		this.idSala=idSala;
		this.capacTotal=capacTotal;
		this.asientos=new MapaAsientos(capacTotal, idSala);
	}
	
	
	public void setIdSala(String id) { this.idSala=id; }
	public String getIdSala() { return idSala; }
	public void setCapacTotal(int capacidad) { this.capacTotal=capacidad; }
	public int getCapacTotal() { return capacTotal; }

	
	public void agregarAsiento(Asiento asiento) {//se agrega un asiento al mapa de asientos
		asientos.agregarAsiento(asiento);
	}
	public boolean recorrerAsientos(Asiento asiento) {//para corroborar si el asiento existe
		if(asientos.verificarAsiento(asiento))return true;
		return false;
	}
	
	public boolean recorrerAsientos(String idAsiento) {
		if(asientos.verificarAsiento(idAsiento))return true;
		return false;
	
	}
	
	public Asiento obtenerAsiento(String idAsiento) {//para obtener el asiento que está adentro con su id
		return asientos.obtenerAsiento(idAsiento);
		
		
	}
	
	public boolean verificarEstadoAsiento(String idAsiento) {
		return asientos.estadoAsiento(idAsiento);
	}
	
	public void agregarAsientos (MapaAsientos mapAs) {
		
	}
	public void setAsientos(MapaAsientos obtenerAsientos) {
		asientos=obtenerAsientos;
	}
	
	
	
}
