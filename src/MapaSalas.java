import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
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
	
	public Sala encontrarSala (String id) { //Encontrara sala atraves del id y la retornara
		return mapaSalas.get(id);
		
	}

	public void importar (MapaAsientos mapAs) throws ParseException, IOException {
		String linea;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("salas.txt"));
			while ((linea = br.readLine()) != null) {
				String[] palabras = new String [3];
				palabras = linea.split(";"); 
				
				Sala sala = new Sala();
				sala.setIdSala(palabras[0]);
				sala.setActualCapac(Integer.parseInt(palabras[1]));
				sala.setCapacTotal(Integer.parseInt(palabras[2]));
				sala.setAsientos(mapAs.obtenerAsientos(sala.getIdSala()));
				añadirSala(sala);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		}
	}

