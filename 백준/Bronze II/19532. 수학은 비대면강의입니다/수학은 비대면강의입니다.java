import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int x = 0;
        int y = 0;

        for (int i = -999; i <= 999; i++){
            for (int j = -999; j <= 999; j++){
                int first = a * i + b * j; // 첫번째 방정식
                int second = d * i + e * j; // 두번째 방정식

                if (first == c && second == f){
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        System.out.println(x + " " + y);
        sc.close();
    }
}