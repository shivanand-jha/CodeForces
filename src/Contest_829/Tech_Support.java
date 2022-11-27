package Contest_829;

import java.util.Scanner;

public class Tech_Support {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k=1;
        while (k++<=t)
        {
            int n = sc.nextInt();
            String ss=sc.next();
            char[] a = ss.toCharArray();
            int  q = 0;
            for (int i = 0; i < n; i++) {
                if(a[i]=='Q') q++;
                else q=Math.max(0,q-1);
            }
            if(q<=0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
