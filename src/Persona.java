public abstract class Persona {
	private String nombre;
	private String rut;
	private String clave;

	public Persona() {
		rut=null;
		nombre=null;
		clave=null;
	}
	
	public Persona(String nombre,String rut, String clave) {
		this.nombre=nombre;
		this.rut=rut;
		this.clave=clave;
	}

	public abstract boolean esAdmin();
	public void setNombre(String nombre) { this.nombre=nombre; }
	public String getNombre() { return nombre; }
	public void setRut(String rut) { this.rut=rut; }
	public String getRut() { return rut;}

	public String getClave() {
		return clave;
	}

	public void setClave(String nuevaClave) {
		this.clave = nuevaClave;
	}

}
