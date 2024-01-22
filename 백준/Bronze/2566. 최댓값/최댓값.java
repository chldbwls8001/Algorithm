import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int[][] arr = new int[9][9];
    	int maxNum = -1;
    	int row = 0;
    	int col = 0;
    	
    	for (int i = 0; i < 9; i++) {
    		for (int j = 0; j < 9; j++) {
    			arr[i][j] = sc.nextInt();
    			
    			if (arr[i][j] >= maxNum) {
    				maxNum = arr[i][j];
    				row = i + 1;
    				col = j + 1;
    			}
    		}
    	}
    	
    	System.out.println(maxNum);
    	System.out.print(row + " " + col);
    }
}