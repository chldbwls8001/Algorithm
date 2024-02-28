import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> poketmon = new HashMap<>(); // 포켓몬 번호와 이름을 키-값 쌍으로 저장할 hashmap
        for (int i = 0; i < N; i++){
            int key = i + 1; // 포켓몬 번호
            String value = br.readLine(); // 포켓몬 이름
            poketmon.put(key, value);
        }

        // 역방향 맵 생성
        HashMap<String, Integer> reverseMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : poketmon.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        for (int i = 0; i < M; i++){
            String question = br.readLine();
            try { // 입력받은 문제가 숫자인 경우
                int number = Integer.parseInt(question);
                String val = poketmon.get(number);
                System.out.println(val);
            }
            catch (NumberFormatException e){ // 숫자가 아닌 경우 (문자열인 경우)
                int key = reverseMap.get(question); // 값을 키로 이용하여 직접 검색
                System.out.println(key);
            }
        }
    }
}