import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(); // int로 입력 받을 시 오버플로우 발생 가능(1 ≤ n ≤ 500,000)

        System.out.println(n * n);
        System.out.println(2);
    }
}