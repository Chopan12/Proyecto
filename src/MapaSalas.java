import java.util.Hashtable;
public class MapaSalas {
	private Hashtable<String, Sala> mapaSalas;
	
	public MapaSalas() {
		mapaSalas=new Hashtable<String, Sala>();
	}
	
	public void añadirSala(Sala sala) { //se ingresa una sala completa
		String id=sala.getIdSala();
		if(!mapaSalas.containsValue(sala))mapaSalas.put(id, sala);
	}
	public void añadirSala(String idSala, int capacTotal) { //se crea una sala en base a un id y su capacidad máxima
		Sala sala=new Sala(idSala, capacTotal);
		if(!mapaSalas.containsKey(idSala))mapaSalas.put(idSala, sala);
	}
	
	public boolean encontrarSala(Sala sala) {
		if(mapaSalas.containsValue(sala))return true;
		return false;
	}

	public void añadirAsiento(Sala sala, Asiento asiento) {
		Sala aux=new Sala();
		String id=sala.getIdSala();
		aux=mapaSalas.get(id);
		mapaSalas.remove(id);
		aux.agregarAsiento(asiento);
		mapaSalas.put(id, aux);
	}
}
