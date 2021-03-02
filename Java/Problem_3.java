
import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

//    %-15s will pad your string to 14 characters and align your the content to the left
//    %03d  will print minimum 3 digit output...if then the output is less than 3 digit it will add zeros in beginning
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");
    }
}