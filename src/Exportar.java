import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class Exportar {
	
	public void exportarCharlas (Congreso co) throws FileNotFoundException, UnsupportedEncodingException {
		ArrayList<Charla> listaCh = co.obtenerL();
		PrintWriter sobreEscribe = new PrintWriter ("charlas.txt","UTF-8"); //Para escribir en el archivo
		
			for (int x=0; x<listaCh.size(); x++) { //Proceso para escribir en el archivo, para el programa para usar el importar mas tarde
				Charla ch = listaCh.get(x);
					sobreEscribe.write(ch.getIdCharla()); 
					sobreEscribe.write(";"); //Cada punto coma es para separar las palabras en los archivos para que el importar funcione
					String duracion = Integer.toString(ch.getDuracion());
					sobreEscribe.write(duracion);
					sobreEscribe.write(";");
					String fecha = ch.getFecha();
					String[] arrFecha = new String [3]; //Pos 0 = Mes, Pos 1 = Dia, Pos 2 = Año
					arrFecha = fecha.split("/"); //Desde aqui 
					sobreEscribe.write(arrFecha[0]); //Mes
					sobreEscribe.write(";");
					sobreEscribe.write(arrFecha[1]); //Dia
					sobreEscribe.write(";");
					sobreEscribe.write(arrFecha[2]);
					sobreEscribe.write(";"); //Hasta aca se escribe cada componente de la fecha en el proceso
					
				Expositor ex = ch.getExpositor();
					sobreEscribe.write(ex.getNombre());
					sobreEscribe.write(";");
					sobreEscribe.write(ex.getRut());
					sobreEscribe.write(";");
					sobreEscribe.write(ex.getTema());
					sobreEscribe.write(";");
					
				Sala sa = ch.getSalaAsignada();
					sobreEscribe.write(sa.getIdSala());
					sobreEscribe.write(";");
					sobreEscribe.write(""+sa.getCapacTotal());
					sobreEscribe.write(";\n");
			}
			sobreEscribe.close();
	}
		public void exportarCharlas (Congreso co,String ruta) throws FileNotFoundException, UnsupportedEncodingException { //Sobrecarga de metodos para reporte por archivo para usuario
			ArrayList<Charla> listaCh = co.obtenerL();
			PrintWriter sobreEscribe = new PrintWriter (ruta,"UTF-8"); //Para escribir en el archivo
			
				for (int x=0; x<listaCh.size(); x++) { //Proceso para escribir en el archivo
						Charla ch = listaCh.get(x);
						sobreEscribe.write(ch.getIdCharla()); 
					
						
						sobreEscribe.write("(Este elemento debe ingresar en la ventana);"); //Cada punto coma es para separar las palabras en los archivos para que este separado para el usuario
						sobreEscribe.write(ch.getFecha());
						sobreEscribe.write(";");
						
					Expositor ex = ch.getExpositor();
						sobreEscribe.write(ex.getNombre());
						sobreEscribe.write(";");
						sobreEscribe.write(ex.getTema());
						sobreEscribe.write(";");
						
					Sala sa = ch.getSalaAsignada();
						sobreEscribe.write(sa.getIdSala());
						sobreEscribe.write(";");
						sobreEscribe.write("\n");
				}
				sobreEscribe.close();
		}
			
		public void exportarAsiento (Congreso co) throws FileNotFoundException, UnsupportedEncodingException {
			MapaAsientos mapaAsiento = co.obtenerMaAs();
			PrintWriter sobreEscribe = new PrintWriter ("asientos.txt","UTF-8"); //Para escribir en el archivo
			for (String clave: mapaAsiento.obtenerClaves()) { //Obtener claves es una funcion keySet
				Asiento as = mapaAsiento.obtenerAsiento(clave);//Se obtiene cada object del mapa con el for
				sobreEscribe.write(as.getIdAsiento());
				sobreEscribe.write(";");
				sobreEscribe.write(as.getIdSala());
				sobreEscribe.write(";");
				sobreEscribe.write( (as.getEstadoAsiento())? "true":"false" ); //Condicion que evalua si es true o false, si es true imprime true, sino imprime false
				sobreEscribe.close();
			}
		}
			
		public void exportarUsuarios (Congreso co) throws FileNotFoundException, UnsupportedEncodingException {
			Hashtable <String,Persona> mapaUs = co.obtenerMaUs();
			
			PrintWriter sobreEscribe = new PrintWriter ("usuarios.txt","UTF-8"); //Para escribir en el archivo
			for(String clave: mapaUs.keySet()) {
				Persona us = mapaUs.get(clave);
				
				sobreEscribe.write(us.getNombre());
				sobreEscribe.write(";");
				sobreEscribe.write(us.getRut());
				sobreEscribe.write(";");
				sobreEscribe.write(us.getClave());
				sobreEscribe.close();
			}
		}
		
		public void exportarTodo (Congreso c) throws FileNotFoundException, UnsupportedEncodingException {
			exportarAsiento (c);
			exportarCharlas (c);
			exportarUsuarios(c);
		}
}
	



