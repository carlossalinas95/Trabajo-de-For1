import java.util.Scanner;
public class valoringresado
{
public static void main (String args[]){
Scanner teclado=new Scanner(System.in);
System.out.println("Ingrese valor");
int valor1 = teclado.nextInt();
if ( valor1<1){
System.out.println("Valor ingresado es incorrecto");
   valoringresado.main (null);

}
else{
for(int i=1;i<=valor1;i++){
System.out.println(i);

								}
					}
		}
}
