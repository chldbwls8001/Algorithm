import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int fn = a1 * n0 + a0;
        int gn = n0; // n = n0 일때

        if (fn <= c * gn && c >= a1){ // 0 ≤ |ai| ≤ 100 이므로, a1이 음수인 경우 고려
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        sc.close();
    }
}