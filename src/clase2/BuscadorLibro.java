package clase2;

import clase1.Resultado;

public class BuscadorLibro extends Buscador{

	public BuscadorLibro(String clave) {
		super(clave);
	}

	@Override
	public Resultado[] buscar() {
		// TODO Auto-generated method stub
		String sql = "SELECT  * FROM ARTICULOS WHERE TITULO LIKE '%" + super.clave + "%'";
		
		Resultado result1 = new Resultado("PROGRAMACION BASICA DE LIBROS", "JUAN PABLO SARASA", new Float(679), true);
		
		//creo el vector 
		Resultado[] resultados = {result1};
		
		
		return resultados;
	}

}
