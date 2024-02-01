import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	
    	for (int i = 0; i < T; i++) {
    		int H = sc.nextInt(); // 호텔의 층 수
    		int W = sc.nextInt(); // 각 층의 방 수
    		int N = sc.nextInt(); // 몇 번째 손님인지
    		
    		int floor; // 손님이 머무를 층
    		int roomNum; // 손님이 머무를 방 번호
    		
    		if (N % H == 0) {
    			floor = H;
    			roomNum = N / H;
    		}
    		else {
    			floor = N % H;
    			roomNum = N / H + 1;
    		}
            
            // 방 번호 출력 형식에 맞게 조정
            System.out.println(floor * 100 + roomNum);
    	}
    	sc.close();
    }
}