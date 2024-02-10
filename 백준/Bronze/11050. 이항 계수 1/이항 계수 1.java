import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 이항계수(n k) = n!/(k!(n-k)!) = a/bc
        int a = 1;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= n; i++){
            a *= i;
        }

        for (int i = 1; i <= k; i++){
            b *= i;
        }

        for (int i = 1; i <= n - k; i++){
            c *= i;
        }

        System.out.println(a / (b * c));
        sc.close();
    }
}