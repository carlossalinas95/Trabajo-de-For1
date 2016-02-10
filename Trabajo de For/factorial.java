public class For5 {
    public static void main(String[] ar) {
        int factorial;
        
        factorial=1;
        for (int x=1;x<=10x++) {
            factorial=factorial*x;
            System.out.print(x);
            System.out.print("*");
            System.out.print(factorial);

        }


        System.out.print("=");
        System.out.print("factorial:");
        System.out.println(factorial);
    }
}