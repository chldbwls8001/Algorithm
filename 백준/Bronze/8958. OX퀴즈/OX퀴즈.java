import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for (int i = 0; i < n; i++) {
    		String str = sc.next();
    		int score = 0; // 문제의 점수
    		int cnt = 0; // 연속된 O의 개수
    		
    		for (int j = 0; j < str.length(); j++) {
    			char ch = str.charAt(j);
    			if (ch == 'O') {
    				cnt++; // 연속된 O의 개수 증가
    				score += cnt; // 현재까지의 O의 개수를 점수에 더함
    			}
    			else {
    				cnt = 0; // O가 아닐 경우 cnt 초기화
    			}
    		} 		
    		System.out.println(score);
    	}    	
    	sc.close();
    }
}