import java.math.*;
import java.util.*;

public class Problem_33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        if(n.isProbablePrime(100))
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}