import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	
    	for (int i = 0; i < T; i++) {
    		int[] change = new int[4]; // 쿼터: 25, 다임: 10, 니켈: 5, 페니: 1
    		int C = sc.nextInt(); // C 단위: 센트(1달러 = 100센트, 1센트 = 0.01달러)
    		
    		change[0] = C / 25;
    		C %= 25;
    		change[1] = C / 10;
    		C %= 10;
    		change[2] = C / 5;
    		C %= 5;
    		change[3] = C / 1;
    		
    		System.out.println(change[0] + " " + change[1] + " " + change[2] + " " + change[3]);   		
    	}
    	sc.close();
    }
}