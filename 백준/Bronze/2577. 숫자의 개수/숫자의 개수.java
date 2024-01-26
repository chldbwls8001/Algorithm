import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	
    	int[] numArray = new int[10]; // 숫자 0~9가 각각 쓰인 횟수를 담을 배열
    	
    	String calculated = String.valueOf(A * B * C);
    	
    	for (int i = 0; i < calculated.length(); i++) {
    		char ch = calculated.charAt(i);
    		int idx = Character.getNumericValue(ch);
    		numArray[idx]++;
    	}
    	
    	for (int i = 0; i < 10; i++) {
    		System.out.println(numArray[i]);
    	}
    }
}