 import java.util.*;

public class Problem_13 {

    static Scanner sc = new Scanner(System.in);

    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;

   static{
       if(B<0 || H<0){
           flag = false;
           System.out.println("java.lang.Exception: Breadth and height must be positive");
       }else{
           flag = true;
       }
   }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print("Area: "+ area);
        }
    }
}

