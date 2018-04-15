import java.util.ArrayList;
public class Usuario extends Persona {
	private String clave;
	private ArrayList<Asiento> asientosAsociados; //charlas a las cuales el usuario asistirá
	//hay que comprobar que el asiento en la charla en especifico existe, y luego mandar a agregar a este metodo
	public Usuario() {
		super();
		this.clave=null;
		this.asientosAsociados= new ArrayList<Asiento>();
	}
	public void setClave(String clave) { this.clave = clave;}
	public String getClave() { return clave; }
	
	public String getNombre() {
		String nombre=this.getNombre();
		return nombre;
	}

	public Usuario(String nombre, String rut, String clave) {
		super(nombre, rut);
		this.clave=clave;
		this.asientosAsociados=new ArrayList<Asiento>();
	}

	
	public boolean recorrerAsientos(String idAsiento) {//para recorrer los asientos y verificar si, por id, ya se encuentra en sus asientos asociados
		if(asientosAsociados.size()==0)return false;//no tiene nada dentro
		Asiento asiento;
		String id;
		for(int i=0; i<asientosAsociados.size(); i++) {
			asiento=asientosAsociados.get(i);
			id=asiento.getIdAsiento();
			if(id.equals(idAsiento))return true;
		}
		return false;
	}
	public void agregarAsiento(Asiento asiento) {
		String id=asiento.getIdAsiento();
		//if(asientosAsociados.size()==1)return;//solo existe un elemento, por lo que la verificacion es innecesaria
		if(!recorrerAsientos(id)) {
			asientosAsociados.add(asiento);
		}
	}
	

		
	public boolean validarRut (Usuario usuario) {
		String rut = usuario.getRut();
		rut.trim(); //lo que hace trim() es eliminar los espacios antes y después del numero o lo que sea que entre
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
	public Asiento getAsiento(String idAsiento) { //para obtener el asiento (que es único por id) el cual se está buscando por id
		Asiento asiento;
		String key;
		for(int i=0; i<asientosAsociados.size(); i++) {
			asiento=asientosAsociados.get(i);
			key=asiento.getIdAsiento();
			if(key.equals(idAsiento))return asiento;
		}
		return null;
	}
}


	