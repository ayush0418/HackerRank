import java.util.*;

public class Problem_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException | InputMismatchException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else if (e instanceof InputMismatchException){
                System.out.println("java.util.InputMismatchException");
            }
        }
    }
}