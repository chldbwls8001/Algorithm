import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) { // 각 테스트 케이스
        	int R = sc.nextInt(); // 반복 횟수
        	String S = sc.next(); // 문자열
        	
        	String P = ""; // 새 문자열
        	
        	for (int j = 0; j < S.length(); j++) {
        		for (int k = 0; k < R; k++) { // 문자 R만큼 반복하여 P에 추가
            		P += S.charAt(j);
            	}
        	}
        	System.out.println(P);
        }
        sc.close();
    }
}