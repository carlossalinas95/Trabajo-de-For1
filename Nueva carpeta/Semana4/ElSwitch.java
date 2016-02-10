import java.util.Scanner;

public class ElSwitch{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);	

		double vts = lea.nextDouble();
		char zona = lea.next().charAt(0);
		double comis;

		/*FORMATO DEL SWITCH
			switch(valor o variable){
				case valor de comparacion: *
					//instrucciones si ese valor de 
					//comparacion es IGUAL al valor o
					//variable del switch
				default:
					//Instrucciones a ejecutar en caso
					//que todos los cases sean false
			}

			NOTAS:
				- el valor o variable debe ser
					int, char o String
				- la clausula "default" es opcional
				- El valor a comparar debe ser CONSTANTE
				  y del MISMO tipo que la variable del switch
		*/	
		switch(zona){
			case 'A':
				System.out.println("Zona A");
				comis = vts * 0.05;
				break;
			case 'B':
				System.out.println("Zona B");
				comis = vts * 0.02;
				break;
			default:
				System.out.println("ZONA MALA");
		}

		//EJEMPLO 2---------------------------
		int mes = lea.nextInt(), dias;

		switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dias = 31;
				break;
			case 2:
				dias = 28;
				break;
			default:
				dias = 30;
		}

		System.out.println("El mes "+mes+" tiene "+
			dias+" dias.");

		//EJEMPLO 3------------------
			//str.toUpperCase()
			//str.toLowerCase()
		String membresia = lea.next();	
		double millas=0;
		System.out.println("membresia: "+ membresia);

		switch(membresia.toLowerCase()){
			case "plata":
				millas = 1;
				break;
			case "oro":
				millas = 1.5;
				break;
			case "platino":
				millas = 2;
				break;
			default:
				System.out.println("ERROR en Membresia");	
		}
		System.out.println("Usted gano "+millas+" millas.");
	}
}