import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        while (N > 0){
            list.add(N % 10);
            N /= 10;
        }

        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i));
        }
        br.close();
    }
}