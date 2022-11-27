package Contest_835;

import java.util.Scanner;

public class Fav_prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0)
        {
            int n =sc.nextInt();
            String s = sc.next();
            char[] a = s.toCharArray();
            char f = 'a';
            for (int i = 0; i<n ; i++) {
                if(a[i]>f)
                {
                    f=a[i];
                }
            }
            System.out.println(26-(122-(int)f));
        }
    }
}
