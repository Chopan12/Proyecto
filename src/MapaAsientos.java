import java.util.Hashtable;
import java.util.ArrayList;
public class MapaAsientos {
	private Hashtable<String, Asiento> mapaAsientos;
	private ArrayList<Asiento> listaAsientos;//lista que tendrá todos los valores que tenga el mapa, se debe ir actualizando en todas las funciones, lo cree para que fuera más comodo trabajar en cualquier otro caso
	
	public MapaAsientos(){
		mapaAsientos=new Hashtable<String, Asiento>();
		listaAsientos=new ArrayList<Asiento>(mapaAsientos.values());
	}
	
	public void agregarAsiento(Asiento asiento) { //hay que verificar que el asiento no se encuentra ya en el usuario, a futuro agregar opcion para meterlo también al arraylist
		String key=asiento.getIdAsiento();
		mapaAsientos.put(key, asiento);
	}

	
}
