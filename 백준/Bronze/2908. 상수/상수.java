import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int reversedA = reversedNum(A);
        int reversedB = reversedNum(B);
        
        if (reversedA > reversedB) {
        	System.out.println(reversedA);
        }
        else {
        	System.out.println(reversedB);
        }
	}
    
    public static int reversedNum(int num) {
    	int newNum = 0;
    	
        for (int i = 0; i < 2; i++) {
        	while (num > 0) {
            	newNum = newNum * 10 + num % 10;
            	num /= 10;
            }
        }
        return newNum;
    }
}