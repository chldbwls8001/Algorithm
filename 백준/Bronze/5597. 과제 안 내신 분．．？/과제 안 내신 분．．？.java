import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] students = new int[31]; // 31: 1~30의 숫자를 students[num]으로 바로 받기 위해(students[30] = 30)
        
        for (int i = 1; i <= 28; i++) { // 과제를 낸 학생의 출석번호(28명) 배열화
        	int num = Integer.parseInt(br.readLine());
        	students[num]++;
        }
        
        for (int i = 1; i <= 30; i++) {
        	if (students[i] == 0) {
        		System.out.println(i);
        	}
        }
    }
}