import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int X = sc.nextInt();
    	int cross_count = 1; // 해당 범위의 대각선 칸 수
    	int prev_count_sum = 0; // 직전 대각선까지의 누적 합
    	
    	while (true) {
    		if (X <= prev_count_sum + cross_count) { // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
    			if (cross_count % 2 == 1) { // 해당 대각선 칸 수가 홀수 -> 대각선 아래에서 위로 진행
    				// 분자가 큰 수부터 시작
					// 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
    			}
    			else { // 해당 대각선 칸 수가 짝수 -> 대각선 위에서 아래로 진행
    				// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;    				
    			}
    		}
    		else {
    			prev_count_sum += cross_count;
    			cross_count++;
    		}
    	}
    }
}