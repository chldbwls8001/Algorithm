import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int[] dp = new int[N + 1]; // DP 테이블 초기화

        dp[1] = 0; // 1은 이미 1이므로 연산 필요 없음

        for (int i = 2; i <= N; i++) {
            // 기본적으로 dp[i-1]에서 1을 더하는 경우
            dp[i] = dp[i - 1] + 1;

            // 2로 나누어 떨어질 경우
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3으로 나누어 떨어질 경우
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        // N을 1로 만드는 최소 연산 횟수 출력
        System.out.println(dp[N]);
    }
}
