import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3]; // x좌표들을 담을 배열
        int[] y = new int[3]; // y좌표들을 담을 배열

        for (int i = 0; i < 3; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        System.out.println(findNonDuplicate(x) + " " + findNonDuplicate(y));
        sc.close();
    }

    public static int findNonDuplicate(int[] arr){ // 중복되지 않는 원소를 찾는 메소드
        if (arr[0] != arr[1] && arr[1] == arr[2]){
            return arr[0];
        }
        else if (arr[0] != arr[1] && arr[0] == arr[2]){
            return arr[1];
        }
        else {
            return arr[2];
        }
    }
}