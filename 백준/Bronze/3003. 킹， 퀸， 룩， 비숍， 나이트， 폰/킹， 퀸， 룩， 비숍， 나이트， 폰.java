import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int[] count = {1, 1, 2, 2, 2, 8};
    	int[] inputCount = new int[6];
    	
    	for (int i = 0; i < 6; i++) {
    		inputCount[i] = sc.nextInt();
    	}
    	
    	for (int i = 0; i < 6; i++) {
    		inputCount[i] = count[i] - inputCount[i];
    		System.out.print(inputCount[i] + " ");
    	}
    }
}