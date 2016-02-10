import java.util.Scanner;

public class Potencia{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		int base,expo,pot=1,cont=0;

		base = lea.nextInt();
		expo = lea.nextInt();

		while(cont < expo){
			pot *= base;
			cont++;	
		}	

		System.out.print("Potencia: "+pot);
	}
}