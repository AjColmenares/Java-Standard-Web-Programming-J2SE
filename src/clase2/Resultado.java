package clase2;

public class Resultado {
	private String titulo;
	
	private String autor;
	
	private Float precio;
	
	private boolean stock;
	
	
	

	public Resultado() {
		super();
	}
	
	

	public Resultado(String titulo, String autor, Float precio, boolean stock) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.stock = stock;
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
	
}
