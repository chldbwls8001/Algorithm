import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	double totSum = 0; // 학점 x 과목평점의 합
    	double totHakjum = 0; // 학점의 총합
    	
    	for (int i = 0; i < 20; i++) {
    		st = new StringTokenizer(br.readLine());
    		st.nextToken(); // 과목명 건너뛰기
    		double hakjum = Double.parseDouble(st.nextToken()); // 학점
    		String grade = st.nextToken(); // 등급(A~F, P/NP)
    		
    		if (grade.charAt(0) == 'P') { // 계산에서 제외
    			continue;
    		}
    		
    		if (grade.charAt(0) == 'A') {
    			if (grade.charAt(1) == '+') {
    				totSum += 4.5 * hakjum;   				
    			}
    			else if (grade.charAt(1) == '0') {
    				totSum += 4.0 * hakjum;
    			}
    		}
    		if (grade.charAt(0) == 'B') {
    			if (grade.charAt(1) == '+') {
    				totSum += 3.5 * hakjum;
    			}
    			else if (grade.charAt(1) == '0') {
    				totSum += 3.0 * hakjum;
    			}
    		}
    		if (grade.charAt(0) == 'C') {
    			if (grade.charAt(1) == '+') {
    				totSum += 2.5 * hakjum;
    			}
    			else if (grade.charAt(1) == '0') {
    				totSum += 2.0 * hakjum;
    			}
    		}
    		if (grade.charAt(0) == 'D') {
    			if (grade.charAt(1) == '+') {
    				totSum += 1.5 * hakjum;
    			}
    			else if (grade.charAt(1) == '0') {
    				totSum += 1.0 * hakjum;
    			}
    		}
    		if (grade.charAt(0) == 'F') {
    			totSum += 0.0 * hakjum;
    		}
    		
    		totHakjum += hakjum;
    	}
    	
    	System.out.println(totSum / totHakjum);
    }
}