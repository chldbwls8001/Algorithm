/*
바구니 개수 N
바구니에 공(1~N)을 넣는 횟수 M

한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.

공을 넣는 방법: 세 정수 i j k로 이루어져 있으며, 
i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻

공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하라.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N]; // 바구니 배열화
        
        for (int a = 0; a < M; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            // fill 메서드는 시작 인덱스부터 끝 인덱스까지 값을 설정하며, 끝 인덱스는 포함됨
            Arrays.fill(arr, i - 1, j, k);
        }
        
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}