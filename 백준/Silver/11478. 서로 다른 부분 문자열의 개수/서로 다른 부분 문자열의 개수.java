import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        HashSet<String> substrings = new HashSet<>(); // S의 부분 문자열을 담을 hashset

        for (int i = 0; i < S.length(); i++){
            for (int j = i + 1; j <= S.length(); j++){
                substrings.add(S.substring(i, j));
            }
        }

        System.out.println(substrings.size());
        br.close();
    }
}