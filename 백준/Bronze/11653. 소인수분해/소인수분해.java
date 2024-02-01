import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
		
    	if (N > 1) { // N이 1인 경우 출력 X 			
			int factor = 2;
			
    		while (N > 1) {  			
    			if (N % factor == 0) {
        			System.out.println(factor);
    				N /= factor;
    			}
    			else {
    				factor++;
    			}	
    		}
    	}
    	
    	sc.close();
    }
}