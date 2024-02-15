import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0; // 종말의 수 카운트
        int num = 666; // 시작하는 수

        while (true){
            if (String.valueOf(num).contains("666")){ // 종말의 수가 포함된 경우
                cnt++;
            }

            if (cnt == N){ // N번째 종말의 수를 찾은 경우
                System.out.println(num);
                break;
            }

            num++; // 다음 수로 넘어감
        }
        br.close();
    }
}