import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        System.out.println(getLCM(A, B));
    }

    public static long getLCM(long a, long b){
        long GCD = getGCD(a, b);
        return (a * b) / GCD;
    }

    public static long getGCD(long a, long b){
        while (b > 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}