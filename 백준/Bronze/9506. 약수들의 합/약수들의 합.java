import java.util.ArrayList;
import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	
    	while (true) {
    		int n = sc.nextInt();
    		
    		if (n == -1) {
    			break;
    		}
    		
    		ArrayList<Integer> list = new ArrayList<>(); // n의 약수들을 담을 arraylist
    		int tot = 0; // 약수들의 합
    		
    		for (int i = 1; i < n; i++) {
    			if (n % i == 0) {
    				list.add(i);
    				tot += i;
    			}
    		}
    		
    		if (tot == n) {
    			System.out.print(n + " = ");
    			
    			for (int i = 0; i < list.size() - 1; i++) {
    				System.out.print(list.get(i) + " + ");
    			}
    			
    			System.out.print(list.get(list.size() - 1));
    			System.out.println();
    		}
    		else {
    			System.out.println(n + " is NOT perfect.");
    		}   		
    	}
    	sc.close();
    }
}