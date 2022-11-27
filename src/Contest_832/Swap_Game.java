package Contest_832;

import java.util.Scanner;

public class Swap_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0)
        {
            int n =sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if(a[i]<min)
                {
                    min = a[i];
                }
            }
            if(a[0]!=min)
            {
                System.out.println("Alice");
            }
            else {
                System.out.println("Bob");
            }
            t--;
        }
    }
}
