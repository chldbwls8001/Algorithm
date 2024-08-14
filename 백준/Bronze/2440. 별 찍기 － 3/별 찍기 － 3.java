import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N; i > 0; i--) {
            // 별을 i개 찍음
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
        sc.close();
    }
}