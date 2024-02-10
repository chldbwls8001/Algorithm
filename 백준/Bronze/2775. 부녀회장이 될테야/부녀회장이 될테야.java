import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(calculateResidents(k, n));
        }
        sc.close();
    }

    public static int calculateResidents(int k, int n){ // 재귀함수로 거주민 수 계산
        if (k == 0){
            return n;
        }

        if (n == 1){
            return 1;
        }

        return calculateResidents(k - 1, n) + calculateResidents(k, n - 1);
    }
}