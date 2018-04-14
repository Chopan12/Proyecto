
public class Administrador extends Persona{
	private String clave;
	
	public Administrador() {
		super(); //Herencia de persona, que poseia rut
	}
	
	public Administrador(String nombre, String rut, String clave) {
		super(nombre, rut);
		this.clave=clave;
	}
	
	public void setClave(String clave) { this.clave=clave; } 
	public String getClave() { return clave; }
	
}
