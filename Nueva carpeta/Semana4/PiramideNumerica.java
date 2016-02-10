import java.util.Scanner;

public class PiramideNumerica{
	public static void main(String[] args) {
		/*
		-Pedir al usuario que ingrese un numero entero
		- vamos a validar que sea > 1
			- Si lo es, vamos a imprimir los numeros asi:
			Ej:
			n = 5
			1 
			22
			333
			4444
			55555
		*/	
		Scanner lea = new Scanner(System.in);
		int fila=1, columna=1;

		int n = lea.nextInt();

		if( n > 1 ){
			while(fila <= n){
				while(columna <= fila){
					System.out.println(fila);
					columna++;
				}
				//System.out.println();
				fila++;
				columna=1;
			}	
		}
		

	}
}