import java.util.Arrays;
import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	while (true) {
        	int n1 = sc.nextInt();
        	int n2 = sc.nextInt();
        	int n3 = sc.nextInt();

        	if (n1 == 0) {
        		break;
        	}
        	
        	int[] numbers = {n1, n2, n3};
        	Arrays.sort(numbers);
        	
        	if (numbers[2] * numbers[2] == numbers[1] * numbers[1] + numbers[0] * numbers[0]) {
        		System.out.println("right");
        	}
        	else {
        		System.out.println("wrong");
        	}
    	}
    	sc.close();
    }
}