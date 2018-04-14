import java.util.Hashtable;
public class MapaSalas {
	private Hashtable<String, Sala> mapaSalas;
	
	public MapaSalas() {
		mapaSalas=new Hashtable<String, Sala>();
	}
	
	public void a�adirSala(Sala sala) { //se ingresa una sala completa
		String id=sala.getIdSala();
		if(!mapaSalas.containsValue(sala))mapaSalas.put(id, sala);
	}
	public void a�adirSala(String idSala, int capacTotal) { //se crea una sala en base a un id y su capacidad m�xima
		Sala sala=new Sala(idSala, capacTotal);
		if(!mapaSalas.containsKey(idSala))mapaSalas.put(idSala, sala);
	}
	
}
