import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int M = sc.nextInt();
    	int N = sc.nextInt();
		ArrayList<Integer> primeNum = new ArrayList<>(); // 소수들을 담을 arraylist
    	int tot = 0; // 소수의 합
    	
    	for (int i = M; i <= N; i++) { // M이상 N이하의 자연수 중 소수 찾기
    		boolean isPrime = true; // 소수인지 판별
    		
    		if (i < 2) {
    			isPrime = false;
    		}
    		else {
        		for (int j = 2; j <= Math.sqrt(i); j++) {
        			if (i % j == 0) {
        				isPrime = false;
        				break;
        			}
        		}
    		}
  		
    		if (isPrime) {
    			primeNum.add(i);
    			tot += i;
    		}
    	}
    	
    	if (primeNum.isEmpty()) { // 소수가 없을 경우 -1 출력
    		System.out.println(-1);
    	}
    	else { // 소수의 총합과 최솟값 출력
    		System.out.println(tot);
        	System.out.println(Collections.min(primeNum));
    	}
    	sc.close();
    }
}