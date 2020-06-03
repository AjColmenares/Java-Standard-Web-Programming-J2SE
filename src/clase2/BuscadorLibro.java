package clase2;



public class BuscadorLibro extends Buscador{

	public BuscadorLibro(String clave) {
		super(clave);
	}

	@Override
	public Resultado[] buscar(String sql) {
		// TODO Auto-generated method stub
		String sqlInicial = "SELECT  * FROM ARTICULOS WHERE TITULO LIKE '%" + this.clave + "%'";
		
		Resultado result1 = new Resultado("PROGRAMACION BASICA DE LIBROS", "JUAN PABLO SARASA", new Float(679), true);
		
		//creo el vector 
		Resultado[] resultados = {result1};
		
		
		return resultados;
	}

	@Override
	public String getSQL() {
		// TODO Auto-generated method stub
		return null;
	}

}
