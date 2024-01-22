import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int cnt = 0;
    	
    	for (int i = 0; i < N; i++) {
    		String word = sc.next();
    		
    		if (isGroupWord(word)){
    			cnt++;
    		}
    	}
		
    	System.out.println(cnt);	

    }
    
    private static boolean isGroupWord(String word) { // 그룹단어인지 확인하는 메소드
    	boolean[] visited = new boolean[26]; // 알파벳의 방문 여부 저장 - 기본값 false
    	int prev = 0; // 이전 문자
    	
    	for (int i = 0; i < word.length(); i++) {
    		int temp = word.charAt(i); // 현재 문자

    		if (prev != temp) { // 이전 문자와 현재 문자가 같지 않을 경우
    			if (visited[temp - 'a'] == false) { // 현재 문자가 처음 나오는 경우
    				visited[temp - 'a'] = true;
    				prev = temp;
    			}
    			else { // 현재 문자가 나온 적이 있는 경우 -> 그룹 단어 x
    				return false;
    			}
    		}   		
    	}
    	
    	return true;
    }
}