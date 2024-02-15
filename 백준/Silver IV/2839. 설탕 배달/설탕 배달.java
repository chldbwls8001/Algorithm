import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int minCount = Integer.MAX_VALUE; // 봉지 개수의 최솟값

        for (int i = 0; i <= N / 5; i++){
            for (int j = 0; j <= N / 3; j++){
                if (5 * i + 3 * j == N){ // 정확하게 N킬로그램을 만들 수 있는 경우
                    minCount = Math.min(minCount, i + j); // 총 봉지의 수 저장
                }
            }
        }

        if (minCount == Integer.MAX_VALUE){ // 정확하게 N킬로그램을 만들 수 없는 경우
            System.out.println(-1);
        }
        else {
            System.out.println(minCount);
        }
        br.close();
    }
}