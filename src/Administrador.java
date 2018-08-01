
public class Administrador extends Persona{
	private String clave;
	
	public Administrador() {
		super(); //Herencia de persona, que poseia rut y nombre
	}
	
	public Administrador(String nombre, String rut, String clave) {
		super();
		this.clave=clave;
	}
	
	public void setClave(String clave) { this.clave=clave; } 
	public String getClave() { return clave; }
	
	public boolean esAdmin() {
		return true;
	}
	
}
