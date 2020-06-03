package clase2;

import java.util.List;


public abstract class Buscador {

	protected String clave;

	public Buscador(String clave) {
	super();
	this.clave = clave;
}

	public Resultado[] buscargeneral() {
		String sqlGeneral = "Select * From ARTICULO";
		
		String sqlParticular = getSQL();
		
		String sqlFinal = sqlGeneral + sqlParticular;
		
		return buscar(sqlFinal);
	}
	
	public abstract String getSQL();
	
	public abstract Resultado[]  buscar(String sql);


	
}
