import java.util.Hashtable;
public class MapaSalas {
	private Hashtable<String, Sala> mapaSalas;
	
	public MapaSalas() {
		mapaSalas=new Hashtable<String, Sala>();
	}
	
	public void a�adirSala(Sala sala) { //hay que hacer verificaciones correspondientes
		String id=sala.getIdSala();
		mapaSalas.put(id, sala);
	}
	public void a�adirSala(String idSala) {
		Sala sala=new Sala(idSala);
		//verificaciones
		mapaSalas.put(idSala, sala);
		
	}
}
