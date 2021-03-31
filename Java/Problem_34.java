import java.util.*;
import java.math.*;

public class Problem_34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger sum;
        BigInteger mul;

       sum = a.add(b);
       mul = a.multiply(b);
       System.out.println(sum);
       System.out.println(mul);
    }
}