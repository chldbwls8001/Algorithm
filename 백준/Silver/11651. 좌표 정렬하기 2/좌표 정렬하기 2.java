import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2]; // 각 x,y좌표를 담을 2차원배열

        for (int i = 0; i < N; i++) { // 배열에 x,y 좌표 할당
            arr[i][0] = sc.nextInt(); // i번째 점의 x좌표
            arr[i][1] = sc.nextInt(); // i번째 점의 y좌표
        }

        // x좌표를 기준으로 정렬, x좌표가 같은 경우 y좌표를 기준으로 정렬
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            else if (a[1] == b[1]){
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}