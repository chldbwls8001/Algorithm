import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] arr = new String[N][2]; // 나이와 이름을 담을 2차원 배열

        for (int i = 0; i < N; i++){ // 배열에 나이와 이름 할당
            for (int j = 0; j < 2; j++){
                arr[i][j] = sc.next();
            }
        }

        // 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬
        Arrays.sort(arr, (a, b) -> {
            if (Integer.parseInt(a[0]) == Integer.parseInt(b[0])){
                return a[0].compareTo(b[0]);
            }
            return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
        });

        for (int i = 0; i < N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        sc.close();
    }
}