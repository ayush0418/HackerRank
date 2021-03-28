import java.util.Scanner;

public class Problem_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        // Multiplication table...
        for(int i =1;i<=10;i++) {
            System.out.format("%d * %d = %d \n",n ,i,n*i);
        }

    }
}
