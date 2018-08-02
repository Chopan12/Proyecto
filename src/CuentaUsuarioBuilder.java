


public abstract class CuentaUsuarioBuilder {
	
	protected CuentaUsuario usuario;
	
	/**
	 * establece el tipo de cuenta al deseado
	 * @return la misma instancia de UsuarioBuilder
	 */
	public abstract CuentaUsuarioBuilder setEsAdmin();
	protected abstract CuentaUsuario crearNuevoUsuario();
	
	
	public CuentaUsuario getCuentaUsuario() { 
		return usuario; 
	}

	
	
	public CuentaUsuarioBuilder setNombre(String nombreUsuario) {
		usuario.setNombre( nombreUsuario);
		return this;
	}
	
	public CuentaUsuarioBuilder setClave(String contrasena) {
		usuario.setClave(contrasena);
		return this;
	}
	
	
	public void setRut(String rut) { usuario.setRut(rut); }
	public String getRut() { return usuario.getRut();}
	
	
	
	/**
	 * Ingresa los campos del usuario, actualizando su nivel administrativo (usuario o administrador)
	 * @param nombreUsuario el nombre del usuario
	 * @param contrasena la contraseña del usuario
	 * @param rut 
	 */
	public void setCampos(String nombreUsuario, String contrasena, String rut) {
		setNombre(nombreUsuario);
		setClave(contrasena);
		setRut(rut);
		setEsAdmin();
	}
	
	
	
	
}
