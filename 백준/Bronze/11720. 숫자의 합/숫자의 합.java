import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
    	String numbers = sc.next();
        
        for (int i = 0; i < N; i++) {
        	char digitChar = numbers.charAt(i);
        	int digit = Character.getNumericValue(digitChar);
        	cnt += digit;
        }
       
        System.out.println(cnt);
        
        sc.close();
    }
}