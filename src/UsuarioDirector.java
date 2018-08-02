


public class UsuarioDirector {
	
	
	private CuentaUsuarioBuilder usuarioBuilder;
	
	
	
	public UsuarioDirector(CuentaUsuarioBuilder usuarioBuilder) {
		this.usuarioBuilder = usuarioBuilder;
	}
	
	public CuentaUsuario getCuentaUsuario() {
		return usuarioBuilder.getCuentaUsuario();
	}
	
	/**
	 * Crea al usuario
	 * @param nombreUsuario el nombre del usuario
	 * @param contrasena
	 * @param palabras 
	 * @return La misma instancia de UsuarioDirector

	 */
	public UsuarioDirector haceUsuario(String nombreUsuario, String contrasena, String rut){
		usuarioBuilder.crearNuevoUsuario();
		usuarioBuilder.setCampos(nombreUsuario, contrasena, rut);
		return this;
	}
}
