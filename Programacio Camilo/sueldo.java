import java.util.Scanner;

public class sueldo
{
	public static void main(String args[]){
		Scanner lea = new Scanner(System.in);
		System.out.println("Ingrese nombre del empleado: ");

	    String nombre = lea.nextLine();
	    System.out.println("Ingrese Pago Por Hora: ");
	    int horas_trabajadas = lea.nextInt();
	    System.out.println("Ingrese pago por hora: ");
	    double pago_por_hora = lea.nextDouble();
	    dueble sueldo = horas trabajadas 
	    System.out.println("Horas trabjadas: "+ horas_trabajadas);
	    System.out.println("Pago_por_hora: "+pago_por_hora);
	    System.out.println("Sueldo : "+ sueldo);
	}
}