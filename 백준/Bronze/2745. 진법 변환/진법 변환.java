import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	String N = sc.next();
    	int B = sc.nextInt();
    	
    	int[] arr = new int[N.length()];
    	
    	for (int i = 0; i < N.length(); i++) {
    		char ch = N.charAt(i);
    		
    		if (Character.isDigit(ch)) { // 숫자일 경우
    			arr[i] = Character.getNumericValue(ch);
    		}
    		else { // 문자일 경우
        		arr[i] = ch - '7'; // A = 17이므로, A = 10부터 시작하도록 -7 처리
    		}
    	}
    	
    	int answer = 0;
    	int b = 1;   	
    	
    	for (int i = arr.length - 1; i >= 0; i--) {
    		answer += arr[i] * b;
    		b *= B;
    	}
    	
    	System.out.println(answer);
    }
}