import java.util.Scanner;

public class Problem_30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        
        if(s.length() > 400000 || s.length() == 0 ) {
            System.out.println(0);
        }else {

            String[] tokens = s.split("[ !,?.\\_'@]+");
            System.out.println(tokens.length);

            for (int i = 0; i < tokens.length; i++) {
                System.out.println(tokens[i]);
            }
        }
    }
}