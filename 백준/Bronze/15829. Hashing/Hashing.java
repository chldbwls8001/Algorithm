import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int L = sc.nextInt();
    	String str = sc.next();
    	int[] stringToInt = new int[L];
    	
    	for (int i = 0; i < str.length(); i++) {
    		stringToInt[i] = str.charAt(i) - 'a' + 1;
    	}
    	
    	int hashValue = stringToInt[0]; // 해시 초기값: stringToInt[0] x 31^0
    	
    	for (int i = 1; i < stringToInt.length; i++) {
    		int multiple = 1; // 계수
    		
    		for (int j = 1; j <= i; j++) {
    			multiple *= 31;
    		}
    		
    		hashValue += stringToInt[i] * multiple;
    	}
    	
    	System.out.println(hashValue);
    	sc.close();
    }
}