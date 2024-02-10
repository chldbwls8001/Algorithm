import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);
        int GCD = 0; // 최대공약수
        int LCM = 0; // 최소공배수
        int i = 1;

        while (i <= smaller){
            if (bigger % i == 0 && smaller % i == 0){
                GCD = i;
            }
            i++;
        }

        LCM = bigger * smaller / GCD;

        System.out.println(GCD);
        System.out.println(LCM);
        sc.close();
    }
}