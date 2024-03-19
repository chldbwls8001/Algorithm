import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static final int MAX_N = 1000000;
    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        isPrime = new boolean[MAX_N + 1]; // 각 인덱스의 값이 소수인지를 나타내는 불리언 배열
        Arrays.fill(isPrime, true); // 배열의 모든 값을 true로 채움
        sieve(); // 에라토스테네스의 체 메소드 실행

        for (int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            System.out.println(countGBPartition(N)); // 파티션의 개수 출력
        }
        br.close();
    }

    public static void sieve() { // 에라토스테네스의 체를 활용한 소수 판별
        /*
        처음에는 모든 수를 소수로 가정
        2부터 시작하여, 소수인 수를 찾으면 해당 수의 배수를 모두 소수가 아닌 것으로 표시
        다음으로 아직 처리되지 않은 가장 작은 수를 찾고, 이를 반복
        이 과정을 반복하여 소수를 찾음
        */
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAX_N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX_N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static int countGBPartition(int number){
        int cnt = 0;

        for (int i = 2; i <= number / 2; i++){
            int j = number - i;
            if (isPrime[i] && isPrime[j]){
                cnt++;
            }
        }
        return cnt;
    }
}