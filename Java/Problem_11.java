import java.util.*;

public class Problem_11 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();

        int count = 0;
        for(int i=0; i<A.length()/2;i++) {

            if (A.charAt(i) == A.charAt(A.length() - i - 1))
            {
                count++;
            }
        }
        System.out.println((count == A.length() / 2) ? "Yes" : "No");
        System.out.println(5/2);
    }
}



