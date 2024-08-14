import java.util.Scanner;

public class Main // 그리디 알고리즘: 현재 상황에서 지금 당장 좋은 것만 고르는 방법
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coins = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++){
            coins[i] = sc.nextInt();
        }
        
        for (int i = N - 1; i >= 0; i--){
            sum += K / coins[i];
            K %= coins[i];
        }

        System.out.println(sum);
    }
}