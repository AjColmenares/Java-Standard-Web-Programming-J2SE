package clase2;



public class BuscadorPelicula extends Buscador{

	public BuscadorPelicula(String clave) {
		super(clave);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Resultado[] buscar(String sql) {
		// TODO Auto-generated method stub
	String sqlInicial = "SELECT  * FROM ARTICULOS WHERE TITULO LIKE '%" + this.clave + "%'";
	
	
	Resultado result1 = new Resultado("PROGRAMACION DE TV", "LOS HERMANOS W", new Float(1000), true);
		//creo el vector 
		Resultado[] resultados = {result1 };
		
		
		return resultados;
	}

	@Override
	public String getSQL() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
