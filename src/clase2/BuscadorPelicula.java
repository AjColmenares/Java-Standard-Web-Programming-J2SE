package clase2;

import clase1.Resultado;

public class BuscadorPelicula extends Buscador{

	public BuscadorPelicula(String clave) {
		super(clave);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Resultado[] buscar() {
		// TODO Auto-generated method stub
	String sql = "SELECT  * FROM ARTICULOS WHERE TITULO LIKE '%" + super.clave + "%'";
	
	
	Resultado result1 = new Resultado("PROGRAMACION DE TV", "LOS HERMANOS W", new Float(1000), true);
		//creo el vector 
		Resultado[] resultados = {result1 };
		
		
		return resultados;
	}


	

}
