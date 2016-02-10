import java.util.Scanner;

public class Ciclos{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);	

		/*
		FORMATO de while:
			while(valor booleano){
				//instrucciones a repetir
			}
		*/

		//Ejemplo 1 Impriminir los numeros del 1-N
		int n = lea.nextInt();
		int contador=1, suma=0;

		/*
			n = 5
			contador = 1
			suma = 15
			1 2 3 4 5
		*/

		while(contador <= n){
			System.out.print(contador+" ");
			suma += contador;
			contador++;
		}	

		System.out.println("\nSuma: " + suma);	

		//Ejemplo 2 ---------
		//Contar cuantos numeros pares ingresa el usuario
		//El proceso termina cuando el usuario ya no
		//ingresa "SI"
		int pares=0;
		String resp = "SI";

		while(resp.equalsIgnoreCase("SI")){
			n = lea.nextInt();
			if(n%2==0){
				pares++;	
			}
			System.out.print("Otro?: ");
			resp = lea.next();
		}
		System.out.println("Pares: " + pares);
	}
}