import java.util.*;
import java.io.*;

public class Problem_6 {
        public static void main(String []argh) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of test cases: ");
            int t = sc.nextInt();

            for(int i=0;i<t;i++) {
                try
                {
                    System.out.print("Enter the number to know about its datatype: ");
                    long x=sc.nextLong();
                    System.out.println(x +" can be fitted in:");

                    if(x>=-Math.pow(2,7) && x<=Math.pow(2,7)-1)
                        System.out.println("* byte");

                    if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                        System.out.println("* short");

                    if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                        System.out.println("* int");

                    if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                        System.out.println("* long");
                }
                catch(Exception e)
                {
                    System.out.println(sc.next()+" can't be fitted anywhere.");
                }
            }
        }
}











