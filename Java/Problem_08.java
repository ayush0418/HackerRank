import java.io.*;
import java.util.*;

public class Problem_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length()+B.length());

        if(A.compareTo(B) > 0){          //Compare string A with B
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // A.substring(0,1)).toUpperCase()  ---> convert position 0 to upperCase.
        // (0 is starting point and 1 is ending point) [1 is not included]
        // A.substring(1)    ---> prints the string starting from index 1
        A = (A.substring(0,1)).toUpperCase() + A.substring(1);
        B = (B.substring(0,1)).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);

    }
}



