import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        double d =scan.nextDouble();

        scan.nextLine();          // to print the string after the white space
        String s = scan.nextLine();

        System.out.println("String: " +s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i1);
    }
}
