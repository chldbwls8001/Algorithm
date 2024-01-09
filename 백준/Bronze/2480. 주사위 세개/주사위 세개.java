/*
1.같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
2.같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
3.모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        int[] numbers = {a, b, c};
        Arrays.sort(numbers); // 눈 오름차순 정렬
        
        if ((numbers[0] == numbers[1]) && (numbers[1] == numbers[2])){ // 같은 눈 3개
            System.out.println(10000 + numbers[0]*1000);
        }
        else if (numbers[0] == numbers[1] || numbers[1] == numbers[2]){ // 같은 눈 2개
            System.out.println(1000 + numbers[1]*100);
        }
        else { // 모두 다른 눈
            System.out.println(numbers[2]*100);
        }
    }
}