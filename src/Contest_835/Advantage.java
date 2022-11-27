package Contest_835;

import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n =sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int max =0;
            int[] res = new int[n];
            for (int i = 0; i <n ; i++) {
                res[i] =a[i]- max(a,a[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(res[i]);
            }
        }
    }

    public static int max(int[] a, int d) {
        int m =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=d )
            {
                if(a[i]>m)
                {
                    m = a[i];
                }
            }
        }
        return  m;
    }
}
