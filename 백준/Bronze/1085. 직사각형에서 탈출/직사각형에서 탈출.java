import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int toW = w - x;
        int toH = h - y;
        int toWH = (w - x) * (w - x) + (h - y) * (h - y);
        
        int[] arr = {x, y, toW, toH, toWH};
        Arrays.sort(arr);
        
        System.out.println(arr[0]);
        sc.close();
    }
}