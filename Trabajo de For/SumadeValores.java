import java.util.Scanner;

public class SumadeValores {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int suma,valor,promedio;
        suma=0;
        for(int x=1;x<=10;x++) {
            System.out.print("Ingrese un valor:");
            valor=teclado.nextInt();
            suma=suma+valor;
        }
        promedio=suma/10;
        System.out.print("La suma de los 10 valores es:");
        System.out.println(suma);
        System.out.print("El promedio es:");
        System.out.print(promedio);
        System.out.print("%");
    }
}