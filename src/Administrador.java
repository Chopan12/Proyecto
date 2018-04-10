
public class Administrador extends Persona{
	private String clave;
	
	public Administrador() {
		super();
	}
	
	public Administrador(String nombre, String clave) {
		super(nombre);
		this.clave=clave;
	}
	
	public void setClave(String clave) { this.clave=clave; } 
	public String getClave() { return clave; }
	
}
