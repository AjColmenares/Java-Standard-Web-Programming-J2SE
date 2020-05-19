package clase2;

import java.util.List;

import clase1.Resultado;

public abstract class Buscador {

	protected String clave;

	public Buscador(String clave) {
	super();
	this.clave = clave;
}

	public abstract Resultado[]  buscar();


	
}
