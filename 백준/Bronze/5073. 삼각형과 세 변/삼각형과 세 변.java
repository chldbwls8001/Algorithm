import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int[] length = new int[3]; // 세 변의 길이를 담을 배열
            for (int i = 0; i < 3; i++){
                length[i] = sc.nextInt();
            }

            if (length[0] == 0 && length[1] == 0 && length[2] == 0) { // 종료 조건
                break;
            }

            Arrays.sort(length); // 변의 길이 오름차순 정렬

            if (length[0] + length[1] > length[2]){ // 삼각형의 조건을 만족하는 경우
                if (length[0] != length[1] && length[1] != length[2] && length[0] != length[2]){ // 세 변의 길이가 모두 다른 경우
                    System.out.println("Scalene");
                }
                else if (length[0] == length[1] && length[1] == length[2] && length[0] == length[2]){ // 세 변의 길이가 모두 같은 경우
                    System.out.println("Equilateral");
                }
                else {
                    System.out.println("Isosceles");
                }
            }
            else { // 삼각형의 조건을 만족하지 않는 경우
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}