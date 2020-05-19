package clase1;

public class Practica1 {
	
	public static void main(String[] args) {
		int[] vector ={11, -22, 33, -44, 55, -66, 77, -88, 99};
		int maximo = 0;
		int minimo = 0;
		int totalPositivos = 0;
		int totalNegativos = 0;
		int idMax = 0;
		int idMin = 0;
		for (int i = 0; i < vector.length; i++) {
			
			if (i == 0) {
				minimo = vector[i];
				maximo = vector[i];
				idMax = i;
				idMin = i;
			}
			if (vector[i] < minimo) {
				minimo = vector[i];
				idMin = i;
			}
			
			if (vector[i] > maximo) {
				maximo = vector[i];
				idMax = i;
			}
			if (vector[i] > 0) {
				
				totalPositivos += vector[i];
			}else {
				totalNegativos += vector[i];
				
			}
		}
		
		System.out.println("minimo " + minimo + " idMin " + idMin);
		System.out.println("maximo " + maximo + " idMax " + idMax);
		System.out.println("total Negativos " + totalNegativos);
		System.out.println("total Positivos " + totalPositivos);
}
}