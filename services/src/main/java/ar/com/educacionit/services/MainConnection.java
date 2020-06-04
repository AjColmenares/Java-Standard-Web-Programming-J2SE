package ar.com.educacionit.services;

import ar.com.educacionit.domain.Producto;

public class MainConnection {

	public static void main(String[] args) {
		
		
		ProductoDAO pdao = new ProductoDAOJDBCimpl();
		
		Producto producto = pdao.getProducto();
		
		System.out.println(producto);
		
		
		
	}
	
}
