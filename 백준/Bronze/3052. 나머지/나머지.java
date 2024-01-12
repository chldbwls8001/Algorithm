import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int[] remainder = new int[10];

        
        for (int i = 0; i < 10; i++) { // 입력받은 10개의 숫자 배열화
        	int num = Integer.parseInt(br.readLine());
        	numbers[i] = num;
        }
        
        for (int i = 0; i < numbers.length; i++) { // 10개의 숫자를 각각 42로 나눈 나머지 배열화
        	remainder[i] = numbers[i] % 42;
        }
        
        HashSet<Integer> uniqueSet = new HashSet<>();
        
        for (int num : remainder) { // HashSet 사용하여 중복 제거한 배열 생성
        	uniqueSet.add(num);
        }
        
        System.out.print(uniqueSet.size());
    }
}