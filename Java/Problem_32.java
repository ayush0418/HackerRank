import java.util.*;

public class Problem_32 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList[] set = new ArrayList[n];

        for(int i =0;i<n;i++) {
            int d = sc.nextInt();

            set[i] = new ArrayList();
            for(int j=0;j<d;j++) {
                set[i].add(sc.nextInt());
            }
        }

        int q =sc.nextInt();
        for (int k=0;k<q;k++){
            int x =sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(set[x-1].get(y-1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}