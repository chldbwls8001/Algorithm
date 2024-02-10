import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }

            int originalN = n;
            StringBuilder sb = new StringBuilder();

            while (n > 0){
                sb.append(n % 10);
                n /= 10;
            }

            int reversedN = Integer.parseInt(sb.toString());
            if (originalN == reversedN){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}