import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] numbers = new int[N];
    	
    	for (int i = 0; i < N; i++) {
    		numbers[i] = sc.nextInt();
    	}
    	
    	ArrayList<Integer> list = new ArrayList<>(); // 세 숫자의 합을 담을 arraylist
    	
    	for (int i = 0; i < numbers.length - 2; i++) {
    		for (int j = i + 1; j < numbers.length - 1; j++) {
    			for (int k = j + 1; k < numbers.length; k++) {
    				if (numbers[i] + numbers[j] + numbers[k] <= M) {
    					list.add(numbers[i] + numbers[j] + numbers[k]);
    				}
    			}
    		}
    	}

    	System.out.println(Collections.max(list));
    	sc.close();
    }
}