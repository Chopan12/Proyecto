import java.util.Hashtable;
import java.util.Set;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
public class MapaAsientos {
	private Hashtable<String, Asiento> mapaAsientos;
	private ArrayList<Asiento> listaAsientos;//lista que tendrá todos los valores que tenga el mapa, se debe ir actualizando en todas las funciones, lo cree para que fuera más comodo trabajar en cualquier otro caso
	
	public MapaAsientos(){
		mapaAsientos=new Hashtable<String, Asiento>();
		listaAsientos=new ArrayList<Asiento>(mapaAsientos.values());
	}
	
	public MapaAsientos(Hashtable<String, Asiento> mapilla) {
        mapaAsientos = mapilla;
        listaAsientos=new ArrayList<Asiento>(mapaAsientos.values());
    }
	
	public MapaAsientos(int capacTotal, String idSala) {
		mapaAsientos=new Hashtable<String, Asiento>();
		String idAs;
		for(int i=1 ;i<=capacTotal ; i++) {
			idAs = idSala + i;
			mapaAsientos.put(idAs, new Asiento(idAs, idSala));
			
		}
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

		if(mapaAsientos.containsKey(idAsiento))return true;
		return false;
	}
	public boolean verificarAsiento(Asiento asiento) {
		if(mapaAsientos.containsValue(asiento) && listaAsientos.contains(asiento))return true;//el asiento se encuentra ingresado
		return false;
	}

	public boolean estadoAsiento(String idAsiento) {
		Asiento asiento;
		String id;
		for(int i=0; i<listaAsientos.size(); i++) {
			asiento=(Asiento)listaAsientos.get(i);
			id=asiento.getIdAsiento();
			if(id.equals(idAsiento)) {
				return asiento.getEstadoAsiento();//se comprobará el estado del asiento y lo retornará
			}
			
		}
		return false;//en cualquier otro caso, se retorna false
	}

	public Asiento obtenerAsiento(String idAsiento) {
		if(mapaAsientos.containsKey(idAsiento)) {
			return mapaAsientos.get(idAsiento);
		}
		
		return null;
	}
	
	public MapaAsientos obtenerAsientos(String idSala){//Este metodo se utiliza solo para el importar TODO:SE ROMPIO EL ENCAPSULAMIENTO
        ArrayList<Asiento> listaAsientos = new ArrayList<Asiento>(mapaAsientos.values()); //Se copian los objetos que contiene el mapaAsientos dentro de un nuevo arrayList para ser utilizado
        Hashtable<String, Asiento> mapa=new Hashtable<String, Asiento>();
        for(Asiento i : listaAsientos) {
            if(i.getIdSala().equals(idSala))
                mapa.put(i.getIdAsiento(), i);
        }

        return new MapaAsientos(mapa);
    }
	
	/*public void eliminarAsiento(String idAsiento, String idSala) {
		Asiento asiento = new Asiento(idAsiento, idSala);
		if(mapaAsientos.contains(asiento))
	}*/
	
	public void importar () throws ParseException, IOException  { //Funcion para importar asiento
		String linea;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("asientos.txt"));
			while ((linea = br.readLine()) != null) {
				String[] palabras = new String [3];
				palabras = linea.split(";"); 
				
				Asiento as = new Asiento ();
				as.setIdAsiento(palabras[0]);
				if (palabras[2].equals("false")) { 
				as.setAsientoLibre();
				}else {
					as.setAsientoOcupado();
				}
				as.setIdSala(palabras[1]);
				agregarAsiento(as); //Se agrega al mapa el asiento creado 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
		}
	public Set<String> obtenerClaves () {
		return mapaAsientos.keySet();	 
	}
		
	}
	
	

	

