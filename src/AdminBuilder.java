

public class AdminBuilder extends CuentaUsuarioBuilder {

	public AdminBuilder() {
		this.crearNuevoUsuario();
	}
	


	@Override
	public CuentaUsuarioBuilder setEsAdmin() {
		usuario.setEsAdmin(true);
		return this;
	}



	@Override
	protected CuentaUsuario crearNuevoUsuario() {
		usuario = new CuentaUsuario(null);
		return usuario;
	}
	
}
