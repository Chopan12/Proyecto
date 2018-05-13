import java.io.*;

public class Exportar {
	
/*public void exportar (Congreso c) {
		ListaCharlas LiCh = c.obtenerL();
		MapaUsuarios MaUs = c.obtenerMaUs();
		MapaAsientos MaAs = c.obtenerMaAs();
		MapaSalas MaSa = c.obtenerMaSa();
}*/
	
	public void exportarCh (Congreso co) throws FileNotFoundException, UnsupportedEncodingException {
		ListaCharlas LiCh = co.obtenerL();
		PrintWriter sobreEscribe = new PrintWriter ("charlas.txt","UTF-8"); //Para escribir en el archivo
		
			for (int x=0; x<LiCh.tamanio(); x++) {
				Charla ch = LiCh.obtenerCharla(x);
				String a = ch.getIdCharla();
					sobreEscribe.write(a); 
					sobreEscribe.write(";"); //Cada punto coma es para separar las palabras en los archivos para que el importar funcione
				String b = Integer.toString(ch.getDuracion());
					sobreEscribe.write(b);
					sobreEscribe.write(";");
				String c = ch.getFecha();
					String[] p = new String [3];
					p = c.split("/"); //Desde aqui 
					String d = p[0]; //Mes 
						sobreEscribe.write(d);
						sobreEscribe.write(";");
				String e = p[1]; //Dia 
					sobreEscribe.write(e);
					sobreEscribe.write(";");
				String f = p[2];	//Año
					sobreEscribe.write(f);
					sobreEscribe.write(";"); //Hasta aca se escribe cada componente de la fecha en el proceso
				Expositor ex = ch.getExpositor();
				String g = ex.getNombre();
					sobreEscribe.write(g);
					sobreEscribe.write(";");
				String h = ex.getRut();
					sobreEscribe.write(h);
					sobreEscribe.write(";");
				String i = ex.getTema();
					sobreEscribe.write(i);
					sobreEscribe.write(";");
				Sala sa = ch.getSalaAsignada();
				String j = 	sa.getIdSala();
					sobreEscribe.write(j);
					sobreEscribe.write(";");
					sobreEscribe.close();
			}
	}
			
		public void exportarSa (Congreso co) throws FileNotFoundException, UnsupportedEncodingException {
				MapaSalas MaSa = co.obtenerMaSa();
				PrintWriter sobreEscribe = new PrintWriter ("salas.txt","UTF-8"); //Para escribir en el archivo
				for ()
				Sala sa = MaSa.
				sobreEscribe.close();
				
			}
		}
	



