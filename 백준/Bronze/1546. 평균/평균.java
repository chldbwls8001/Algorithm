import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        
        for (int i = 0; i < N; i++) { // 점수 배열화
        	int num = sc.nextInt();
        	score[i] = num;
        }
        sc.close();
        
        Arrays.sort(score);

        int M = score[N - 1]; // 점수의 최댓값
        double tot = 0;
        double avg = 0;
        
        for (int i = 0; i < score.length; i++) {
        	tot += ((double)score[i] / M) * 100;
        }

        avg = tot / N;
        
        System.out.println(avg);
    }
}