import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class AgregarenArchivo {

	public void importar (String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11) {
		
		
		
				String ubicacion = "C:\\Users\\nicho\\eclipse-workspace\\Proyecto\\charlas.txt";
				String nuevaCh = s1;
				nuevaCh.concat(";");nuevaCh.concat(s2);
				nuevaCh.concat(";");nuevaCh.concat(s3);
				nuevaCh.concat(";");nuevaCh.concat(s4);
				nuevaCh.concat(";");nuevaCh.concat(s5);
				nuevaCh.concat(";");nuevaCh.concat(s6);
				nuevaCh.concat(";");nuevaCh.concat(s7);
				nuevaCh.concat(";");nuevaCh.concat(s8);
				nuevaCh.concat(";");nuevaCh.concat(s9);
				nuevaCh.concat(";");nuevaCh.concat(s10);
				nuevaCh.concat(";");nuevaCh.concat(s11); //Se deja el formato "idch;dur;mes;dia;año;nombre;rut;tema;capactual;captotal"
														//para despues al importar no haya problemas
				
				try (Writer fileWriter = new FileWriter(ubicacion, true)){
					fileWriter.write("\n"+nuevaCh);
				} catch (IOException e) {
					System.out.println("Problemas con directorio " + ubicacion);
					e.printStackTrace();
				} 
			}
	
}
