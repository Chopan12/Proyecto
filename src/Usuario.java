import java.util.ArrayList;
public class Usuario extends Persona {
	private String clave;
	private ArrayList<Asiento> asientosAsociados; //charlas a las cuales el usuario asistirá
	//alen: comprobar que el asiento en la charla en especifico existe, y luego mandar a agregar a este metodo
	public Usuario() {
		super();
		this.clave=null;
		this.asientosAsociados= new ArrayList<Asiento>();
	}
	public Usuario(String clave, String rut, String nombre) {
		super(nombre,rut);
		this.clave=clave;
	}
	
	public Usuario(String nombre, String rut, String clave, Asiento asiento) {
		super(nombre, rut);
		this.clave=clave;
		asientosAsociados.add(asiento);
		
		
	}
	//metodo agregar asiento
	public void setClave(String clave) { this.clave = clave;}
	public String getClave() { return clave; }
		
	public boolean validarRut (Usuario usuario) {
		String rut = usuario.getRut();
		rut.trim(); //lo que hace .trim() es eliminar los espacios antes y después del numero o lo que sea que entre
		rut = rut.replace(".", "");
		rut = rut.replace("-", "");
		try {
			int aux = Integer.parseInt(rut);
			int cont=0;
			while(aux>0) {
				aux/=10;
				cont++;
			}
			if(!(cont==9 || cont==8))return false;//si el rut no tiene 9 u 8 digitos, no es un rut válido
			
			
		}catch(NumberFormatException e) {
			return false;
		}
		
		return true;
	}
}


	