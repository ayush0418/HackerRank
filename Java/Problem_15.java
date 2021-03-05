
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Problem_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int count =0;

        for (int j=0;j<n;j++){
            int sum = 0;

            for(int k=j;k<n;k++){
                sum=a[k]+sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
