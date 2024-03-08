import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int i = M; i <= N; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }

        sc.close();
    }

    public static boolean isPrime(int number){ // 소수인지 판별
        if (number == 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }
}