import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
    public static void main(String[] args) throws IOException {    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	char[][] arr = new char[5][15];
    	
    	for (int i = 0; i < 5; i++) {   	
    		String words = br.readLine();
    		
    		for (int j = 0; j < words.length(); j++) {
    			arr[i][j] = words.charAt(j);
    		}
    	}
    	
    	for (int j = 0; j < 15; j++) {
    		for (int i = 0; i < 5; i++) {
    			if (arr[i][j] != '\u0000') { 
    				// char는 기본적으로 '\u0000'(널 문자)로 초기화되기 때문에 값이 비어있음을 표현할 때는 해당 문자 ('\u0000')를 사용하거나 다른 값으로 초기화해야 함.
            		System.out.print(arr[i][j]);
    			}
        	}
		}
    }
}