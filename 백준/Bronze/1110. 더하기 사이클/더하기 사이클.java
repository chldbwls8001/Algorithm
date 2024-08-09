import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0; // 사이클 수를 저장할 변수
        int originalN = N; // 최초 입력값 저장

        while(true){
            cnt++; // 사이클 수 증가
            int num1 = N / 10; // 십의 자리 숫자
            int num2 = N % 10; // 일의 자리 숫자
            int newNum = num2 * 10 + (num1 + num2) % 10; // 새로운 숫자 생성
            
            if (newNum == originalN){ // 새로운 숫자가 원래 숫자와 동일하면 종료
                break;
            }
            N = newNum; // 새로운 숫자로 업데이트
        }
        
        System.out.println(cnt);
        sc.close();
    }
}