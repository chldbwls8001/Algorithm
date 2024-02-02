import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] triangle = {a, b, c}; // 세 변의 길이를 담은 배열
        Arrays.sort(triangle); // 오름차순 정렬

        if (triangle[0] + triangle[1] <= triangle[2]){ // 삼각형의 조건을 만족하지 못하는 경우 -> 조건을 만족할 때까지 가장 긴 변의 길이를 줄임
            while (true){
                triangle[2]--;

                if (triangle[0] + triangle[1] > triangle[2]){
                    break;
                }
            }
        }
        System.out.println(triangle[0] + triangle[1] + triangle[2]);
        sc.close();
    }
}