import java.util.ArrayList;
public class Usuario extends Persona {
	private String clave;
	private ArrayList<Charla> charlasAsociadas=new ArrayList<Charla>(); //charlas a las cuales el usuario asistirá
	private Asiento asiento;
	
	public Usuario() {
		super();
		this.clave=null;
		charlasAsociadas=new ArrayList<Charla>();
		asiento=null;
	}
	public Usuario(String clave, String rut, String nombre, Charla charla,Asiento asiento) {
		super(nombre,rut);
		this.clave=clave;
		charlasAsociadas.add(charla);
		this.asiento = asiento;
	}
	
	public void setClave(String clave) { this.clave = clave;}
	public String getClave() { return clave; }
	public void setAsiento (Asiento asiento) {this.asiento = asiento;}
	public Asiento getAsiento () {return asiento; }
		
	public boolean validarRut (Usuario usuario) { //En duda si dejar o no, muy complicado para entenderlo, sacado de una pagina
		boolean validacion = false;
		String rut = usuario.getRut();
		try {
			rut =  rut.toUpperCase();
			rut = rut.replace(".", "");
			rut = rut.replace("-", ""); 
			
			int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
			 
			char dv = rut.charAt(rut.length() - 1);
			 
			int m = 0, s = 1;
			for (; rutAux != 0; rutAux /= 10) {
			s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
			}
			if (dv == (char) (s != 0 ? s + 47 : 75)) {
			validacion = true;
			}
			 
			} catch (java.lang.NumberFormatException e) {
			} catch (Exception e) {
			}
			return validacion;
	}
}


	