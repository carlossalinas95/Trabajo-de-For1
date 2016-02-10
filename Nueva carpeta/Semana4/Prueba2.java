import java.util.Scanner;

public class Prueba2{
	/*
		INGRESAR DEL TECLADO:
			- Monto Gastado en Lps
			- Monto Gastado en $
			- Tipo de Membresia de Tarjeta
		CALCULAR E IMPRIMIR:
			- Monto Total en $ a pagar
			- Millas ganadas en el periodo

		NOTA: - Tasa de cambio L 22 = 1$
		- La Membresia "plata" da 1 milla x 1$ gastado
		  La "oro" da 1.5 millas y la "platino" da 
		  2 millas por dolar gastado
		 - Si ingresa una membresia mala, se imprime
		 "ERROR en Membresia" y las millas son 0.
	*/
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);
		double mlps, mdols, total, millas=0;
		String membresia;

		mlps = lea.nextDouble();
		mdols = lea.nextDouble();
		membresia = lea.next();	

		total = mdols + (mlps/22);

		if(membresia.equals("plata")){
			millas = total;
		}
		else if(membresia.equals("oro")){
			millas = total * 1.5;	
		}
		else if(membresia.equals("platino")){
			millas = total * 2;
		}
		else{
			System.out.println("ERROR en Membresia");	
		}

		System.out.println("Total: $"+total);
		System.out.println("Usted gano "+millas+" millas.");
	}
}