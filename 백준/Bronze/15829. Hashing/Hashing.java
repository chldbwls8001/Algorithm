import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String str = sc.next();

        // 해시 함수의 상수 값
        int r = 31;
        int M = 1234567891;

        long hashValue = calculateHash(str, r, M);

        System.out.println(hashValue);
        sc.close();
    }

    static long calculateHash(String str, int r, int M) {
        int len = str.length();
        long hashValue = 0;
        long rPow = 1;

        for (int i = 0; i < len; i++) {
            // 각 알파벳에 해당하는 숫자를 가져옴
            int ai = str.charAt(i) - 'a' + 1;

            // 각 항에 대해 ai * r^i를 계산하고 해시값에 더함
            hashValue = (hashValue + ai * rPow) % M;

            // r^i를 계산하여 다음 항에 사용
            rPow = (rPow * r) % M;
        }

        return hashValue;
    }
}