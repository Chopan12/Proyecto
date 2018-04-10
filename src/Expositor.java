import java.util.Date;
public class Expositor extends Persona{
	private Date horaComienzo;
	private int duracion;
	private String tema;
	public Expositor() {
		super();
		this.duracion=0;
		this.horaComienzo=null;
		this.tema=null;
	}
	
	public Expositor(String nombre, String tema, int duracion, Date horaComienzo) {
		super(nombre);
		this.tema=tema;
		this.duracion=duracion;
		this.horaComienzo=horaComienzo;
	}
	
	public void setTema(String tema) { this.tema=tema; }
	public String getTema() { return tema; }
	public void setDuracion(int duracion) { this.duracion=duracion; }
	public int getDuracion() { return duracion; }
	public void setHoraComienzo(Date horaComienzo) { this.horaComienzo=horaComienzo; }
	public Date getHoraComienzo() { return horaComienzo; }
	
	
}
