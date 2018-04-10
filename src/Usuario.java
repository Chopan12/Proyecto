import java.util.ArrayList;
public class Usuario extends Persona {
	private String clave;
	private ArrayList<Charla> charlasAsociadas=new ArrayList<Charla>(); //charlas a las cuales el usuario asistirá
	
	public Usuario() {
		super();
		this.clave=null;
		charlasAsociadas=new ArrayList<Charla>();
	}
	public Usuario(String clave, String nombre, Charla charla) {
		super(nombre);
		this.clave=clave;
		charlasAsociadas.add(charla);
	}
	
	public void setClave(String clave) { this.clave = clave;}
	public String getClave() { return clave; }
	
	
}
