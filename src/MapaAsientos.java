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
		if(mapaAsientos.containsKey(key))return;//cada silla tiene id único, así que basta con esto para saber si el asiento se encuentra agregado o no
		if(listaAsientos.contains(asiento))return;//también se verifica si existe en la lista, ya que ambas se irán llenando para comodidad futura
		mapaAsientos.put(key, asiento);
		listaAsientos.add(asiento);
	}
	
	public boolean verificarAsiento(String idAsiento) {
		if(mapaAsientos.containsKey(idAsiento))return true;//el asiento se encuentra ingresado en el mapa
		return false;
	}
	public boolean verificarAsiento(Asiento asiento) {
		if(mapaAsientos.containsValue(asiento) && listaAsientos.contains(asiento))return true;//el asiento se encuentra ingresado
		return false;
	}
	

	
}
