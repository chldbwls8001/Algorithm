import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] buckets = new int[N]; // 바구니 배열(1~N)
        
        for (int i = 0; i < N; i++) { // 바구니 배열에 차례로 1부터 N까지 넣기
        	buckets[i] = i+1;
        }
        
        for (int k = 1; k <= M; k++) {
        	int i = sc.nextInt();
        	int j = sc.nextInt();
        	
        	while(i < j) { // 인덱스 주의! i번째 원소 = buckets[i-1]
        		int temp = buckets[i-1];
            	buckets[i-1] = buckets[j-1];
            	buckets[j-1] = temp;
            	
            	i++;
            	j--;
        	}       	
        }       
        sc.close();
        
        for (int i = 0; i < buckets.length; i++) {
        	System.out.print(buckets[i] + " ");
        }
    }
}