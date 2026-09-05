import java.util.*;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[][] dp = new long[k + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            dp[1][i] = 1;
        }

        for (int len = 2; len <= k; len++) {
            for (int x = 1; x <= n; x++) {
                for (int multiple = x; multiple <= n; multiple += x) {
                    dp[len][multiple] += dp[len - 1][x];
                    dp[len][multiple] %= MOD;
                }
            }
        }

        long ans = 0;

        for (int i = 1; i <= n; i++) {
            ans = (ans + dp[k][i]) % MOD;
        }

        System.out.println(ans);
    }
}