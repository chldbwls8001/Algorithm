import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int cnt = 0; // 소수의 개수를 저장할 변수
            int n = Integer.parseInt(br.readLine());

            if (n == 0){
                break;
            }

            for (int i = n + 1; i <= 2 * n; i++){
                if (isPrime(i)){
                    cnt++; // i가 소수일 경우 카운트
                }
            }
            System.out.println(cnt); // 소수의 개수 출력
        }

        br.close();
    }

    public static boolean isPrime(int number){ // 소수인지 판별
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}