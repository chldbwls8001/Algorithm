import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
    	String S = sc.next();
   	
        char[] alphabetArray = new char[26]; // 알파벳 'a'부터 'z'까지 원소로 하는 배열 생성
        
        for (int i = 0; i < 26; i++) { // 배열에 알파벳 할당
            alphabetArray[i] = (char) ('a' + i);
        }
        
        int[] answer = new int[26]; // 빈 배열 생성(모든 원소의 값이 0)
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = -1; // 모든 값 -1로 변경
        }
               
        for (int i = 0; i < S.length(); i++) {
        	for (int j = 0; j < alphabetArray.length; j++) {
        		if (S.charAt(i) == alphabetArray[j]) { // S에 해당 알파벳이 있는 경우		       	 		
        			if (answer[j] == -1) {
        				answer[j] = i;
        			}
        		}
        	}
        }
        
        for (int i = 0; i < answer.length; i++) { // 정답 출력
        	System.out.print(answer[i] + " ");
        }
    }
}