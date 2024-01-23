import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int B = sc.nextInt();
    	sc.close();
    	
    	StringBuilder answer = new StringBuilder(); // B진수를 담을 StringBuilder 생성
    	
    	while (N > 0) { // B진수 처리
    		int remainder = N % B; // N을 B로 나눈 나머지
    		char ch;
    		
    		if (remainder >= 10) { // 나머지가 10보다 클 경우 영문대문자로 변환
    			ch = (char) ('A' + (remainder - 10));
    		}
    		else {
    			ch = (char) ('0' + remainder);
    		}
    		
    		answer.append(ch);
    		
    		N /= B;
    	}
    	
    	System.out.println(answer.reverse().toString());
    }
}