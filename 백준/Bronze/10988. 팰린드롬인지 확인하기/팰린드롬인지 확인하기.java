import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	char[] array = str.toCharArray(); // 입력된 문자열 배열화
    	char[] reverseArray = new char[array.length]; // 문자열 역순화하여 담을 배열 생성
    	
    	for (int i = 0; i < array.length; i++) {
    		reverseArray[i] = array[array.length - i - 1];
    	}
    	
    	int isSame = 1;
    	for (int j = 0; j < array.length; j++) {
    		if (array[j] != reverseArray[j]) {
    			isSame = 0;
    		}
    	}
    	
    	System.out.println(isSame);
    	 
    }
}