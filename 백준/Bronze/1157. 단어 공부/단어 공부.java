import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next().toUpperCase(); // 문자열 전부 대문자로 변환

    	int[] alphabetIndex = new int[26]; // 알파벳 개수 카운트 배열
    	
    	for (int i = 0; i < str.length(); i++) {
    		char currentChar = str.charAt(i);
    		int index = currentChar - 'A';
    		
    		alphabetIndex[index]++; // 해당 알파벳 개수 +1
    	}
    	
    	int maxCount = 0;
    	char resultChar = '?';
    	
    	for (int i = 0; i < 26; i++) {
    		if (alphabetIndex[i] > maxCount) {
    			maxCount = alphabetIndex[i];
    			resultChar = (char) ('A' + i);
    		}
    		else if (alphabetIndex[i] == maxCount) {
    			resultChar = '?';
    		}
    	}
    	
    	System.out.println(resultChar);
    }
}