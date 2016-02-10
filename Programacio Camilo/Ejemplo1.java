import java.util.Scanner;
public class Ejemplo{
	public static void main(String[] args{
		Scanner lea = new Scanner(System.in);
		int cuantos = lea.nextInt();
		int pares[] = new int[cuantos];
		int cpares=0;


		do{
			int n = lea.nextINt();
			if(n % 2 == 0){
				pares[cpares] = n;
				cpares++;
			}
		}while(cpares < cuantos);

		for(int p=0; p< cuantos; p++){
			System.out.print(pares[p]);
		}
	}
}