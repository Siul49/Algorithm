import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        
        // dp[i]: i를 표현할 때 최소 제곱수 항의 개수
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // 최대 i개 (1² + 1² + ...)
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}
