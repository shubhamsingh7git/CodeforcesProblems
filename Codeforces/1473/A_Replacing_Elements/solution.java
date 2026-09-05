import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int d = sc.nextInt();

            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();

            Arrays.sort(a);

            if(a[n-1] <= d || a[0] + a[1] <= d)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}