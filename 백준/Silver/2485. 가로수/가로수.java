import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        for (int i = 0; i < N; i++){
            trees[i] = Integer.parseInt(br.readLine());
        }

        int[] distance = new int[N - 1];

        for (int i = 0; i < N - 1; i++){
            distance[i] = trees[i + 1] - trees[i];
        }

        int GCD = distance[0]; // 첫 번째 거리를 초기 GCD로 설정

        // 모든 거리의 최대공약수(GCD)를 구함
        for (int i = 1; i < N - 1; i++) {
            GCD = getGCD(GCD, distance[i]);
        }

        int cnt = 0;

        for (int n : distance){
            cnt += (n / GCD) - 1;
        }

        System.out.println(cnt);
    }

    public static int getGCD(int a, int b){
        while (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}