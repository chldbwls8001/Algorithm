import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> cards = new HashMap<>(); // 숫자 카드에 적혀있는 정수를 저장할 hashmap

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            int card = Integer.parseInt(st.nextToken());
            cards.put(card, cards.getOrDefault(card, 0) + 1); // 카드의 개수를 세어 hashmap에 저장
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++){
            int target = Integer.parseInt(st.nextToken());
            sb.append(cards.getOrDefault(target, 0)).append(" "); // hashmap에서 해당 숫자 카드의 개수를 가져와 출력
        }

        // 결과 출력
        System.out.println(sb.toString().trim()); // trim(): 양 끝 공백 제거
        br.close();
    }
}