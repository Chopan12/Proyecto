import java.util.ArrayList;

public class UsuarioBuilder extends CuentaUsuarioBuilder{

	
	public UsuarioBuilder() {
		this.crearNuevoUsuario();
	}
	
	

	@Override
	public CuentaUsuarioBuilder setEsAdmin() {
		usuario.setEsAdmin(false);
		return this;
	}



	@Override
	protected CuentaUsuario crearNuevoUsuario() {
		usuario = new CuentaUsuario(new ArrayList< Charla >());
		return usuario;

	}



}
