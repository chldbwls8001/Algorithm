import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        int numer = a1 * b2 + a2 * b1; // 분자
        int denom = b1 * b2; // 분모

        int GCD = getGCD(numer, denom); // 분자와 분모의 최대공약수를 구함

        System.out.println(numer/GCD + " " + denom/GCD); // 분자와 분모를 각각 최대공약수로 나누어줌
    }

    public static int getGCD(int a, int b){ // 두 수의 최대공약수를 구하는 메소드
        while (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}