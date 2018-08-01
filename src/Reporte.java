import java.awt.List;
import java.io.IOException;

public interface Reporte { //Interfaz para generar reporte
	public String reportePantalla();
	public void reporteArchivo(String rutaArchivo) throws IOException;
}
