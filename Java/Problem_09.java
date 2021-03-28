import java.util.*;

public class Problem_9  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(S.substring(start,end));
    }
}
