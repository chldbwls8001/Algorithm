import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();        
        int[] bucket = new int[N];
        
        for (int i = 0; i < N; i++) {
        	bucket[i] = i + 1;
        }
        
        for (int k = 0; k < M; k++) {
        	int i = sc.nextInt();
        	int j = sc.nextInt();
        	
        	int temp = bucket[i-1];
        	bucket[i-1] = bucket[j-1];
        	bucket[j-1] = temp;
        }
        
        for (int i = 0; i < bucket.length; i++) {
        	System.out.print(bucket[i] + " ");
        }
    }
}