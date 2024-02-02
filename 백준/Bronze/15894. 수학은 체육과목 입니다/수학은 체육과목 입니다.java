import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(); // 맨 아랫줄의 정사각형의 개수

        System.out.println(4 * n);
        sc.close();
    }
}