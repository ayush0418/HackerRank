import java.util.Scanner;

public class Problem_10 {
    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0,k);
        String largest  = "";

//  The compareTo() method compares two strings lexicographically.[ A<B<C<.....<Z<a<b<c<....<z  ]
//  Returns:  An int value: = 0 if the string is equal to the other string.
//                          < 0 if the string is lexicographically less than the other string
//                          > 0 if the string is lexicographically greater than the other string (more characters)

        for(int i=0;i<s.length()-k+1;i++){              // s.length()-k+1 --> number of substrings can be made
            if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest)  >0) largest  = s.substring(i,i+k);
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
