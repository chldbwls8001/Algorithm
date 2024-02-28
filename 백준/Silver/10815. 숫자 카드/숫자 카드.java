import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        TreeSet<Integer> cardSet = new TreeSet<>();

        // 카드 뭉치 입력
        for (int i = 0; i < N; i++){
            cardSet.add(Integer.parseInt(st.nextToken()));
        }

        // 입력된 수의 개수 입력 및 처리
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());
            System.out.print(cardSet.contains(num) ? "1 " : "0 ");
        }
        
        br.close();
    }
}