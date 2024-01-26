import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	int point = 2; // 정사각형 한 변의 점의 개수, 초기값 2
    	int answer = 4; // 초기상태 점의 개수

    	for (int i = 1; i <= N; i++) {
    		point = 2 * point - 1;
    		answer = point * point;
    	}
		System.out.println(answer);
    }
}