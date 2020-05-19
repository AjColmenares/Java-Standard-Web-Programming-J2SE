package clase1;

import java.util.Scanner;

public class Programa1 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n1; 
		int n2; 
		int n3;
		
		int cantidadNotas = 3;
		int mayor;
		int menor;
		int sumaNotas = 0;
		float promedio = 0;
		
		//validacion con do while
		n1 = validarNota(scan);
		n2 = validarNota(scan);
		n3 = validarNota(scan);
		
		sumaNotas = n1 + n2 + n3;
		
		promedio = sumaNotas / cantidadNotas;
		
		if (n1>=n2 && n1>=n3) {
			mayor = n1;
		} else if (n2>=1 && n2 >= n3) {
			mayor = n2;
		} else {
			mayor = n3;
		}
		
		if (n1<=n2 && n1<=n3) {
			menor = n1;
		} else if (n2<=1 && n2<=n3) {
			menor = n2;
		} else {
			menor = n3;
		}
		
		System.out.println("la suma total es " + sumaNotas);
		System.out.println("el promedio total es " + promedio);
		System.out.println("la nota mayor es " + mayor);
		System.out.println("la nota menor es " + menor);
		
		
	}

	private static int validarNota(Scanner teclado) {
		int nota = 0;
		boolean valido = false;
		do {
			System.out.println("ingrese por favor un numero");
			String aux = scan.nextLine();
		try {
			nota = Integer.parseInt(aux);
			valido = true;	
		} catch (Exception e) {
			valido = false;
		}
			}while(!valido);
		return nota;
	}	
	
	
}
