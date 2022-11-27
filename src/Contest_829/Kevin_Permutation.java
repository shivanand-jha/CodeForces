package Contest_829;

import java.util.Scanner;

public class Kevin_Permutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while (t-->0)
        {
            int n =s.nextInt();
            int a = n/2+1; int c =1;
            for (int i =1; i <= n/2; i++) {
                System.out.print(a+" "+ c +"");
                a++;
                c++;
            }
            if (n%2!=0)
            {
                System.out.print(a);
                System.out.println();
            }
        }
    }
}
