package Contest_835;

import java.util.Scanner;

public class medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0)
        {
            int[] a1 = new int[3];
            for (int i = 0; i < 3; i++) {
                a1[i]=sc.nextInt();
            }
            int a = a1[0];
            int b = a1[1];
            int c = a1[2];
            if (a > b)
            {
                if (b > c)
                    System.out.println(b);
                else if (a > c)
                    System.out.println(c);
                else
                    System.out.println(a);;
            }
            else
            {

                if (a > c)
                    System.out.println(a);
                else if (b > c)
                    System.out.println(c);
                else
                    System.out.println(b);
            }
        }
    }
}
