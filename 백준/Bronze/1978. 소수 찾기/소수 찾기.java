import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int cnt = 0; // N개의 수 중 소수의 개수
    	
    	for (int i = 0; i < N; i++) {
    		int num = sc.nextInt();
    		boolean isPrime = true; // num이 소수인지 판별
    		
			if (num == 1) { 
				continue;
			}
			else {
				for (int j = 2; j <= Math.sqrt(num); j++) { // Math.sqrt(num): num의 제곱근
	    			if (num % j == 0) {
	    				isPrime = false;
	    				break; // 소수가 아니면 반복문 종료
	    			}
	    		}
				
				if (isPrime == true) {
					cnt++;
				}
			}
    	}
    	
    	System.out.println(cnt);
    	sc.close();
    }
}