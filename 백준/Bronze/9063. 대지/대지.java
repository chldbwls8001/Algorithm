import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        System.out.println(diffValue(x) * diffValue(y));
        sc.close();
    }

    public static int diffValue(int[] arr){
        Arrays.sort(arr);
        return (arr[arr.length - 1] - arr[0]);
    }
}