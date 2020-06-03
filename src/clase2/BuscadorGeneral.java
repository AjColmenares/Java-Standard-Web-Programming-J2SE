package clase2;


public class BuscadorGeneral extends Buscador {

	public BuscadorGeneral(String clave) {
		super(clave);

	}

	@Override
	public Resultado[] buscar(String sql) {
		// TODO Auto-generated method stub
		
		
	System.out.println("ejecutando consulta");
		
		Resultado result1 = new Resultado("PROGRAMACION BASICA", "FIGUEROA, LEONEL", new Float(679), true);
		Resultado result2 = new Resultado("PROGRAMACION PARA NIÑOS 1", "PEÑA MILLAHUAL, CLAUDIO A.", new Float(578),true);
		Resultado result3 = new Resultado("PROGRAMACION NIÑOS 2", "PEÑA MILLAHUAL, CLAUDIO A.", new Float(649), true);

		// creo el vector
		Resultado[] resultados = { result1, result2, result3 };

		return resultados;
	}

	@Override
	public String getSQL() {
		// TODO Auto-generated method stub
		return "articulo where tipo_articulo in (1,2,3,4) LIKE '%" +this.clave + "%'";
	}


}
