import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] score = new int[N];

        st = new StringTokenizer(br.readLine()); // 새로운 StringTokenizer 생성
        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            score[i] = x;
        }

        Arrays.sort(score);
        System.out.println(score[N - k]);

        br.close();
    }
}