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

        HashSet<String> hearSet = new HashSet<>(); // 듣도 못한 사람 리스트
        HashSet<String> seeSet = new HashSet<>(); // 보도 못한 사람 리스트

        for (int i = 0; i < N; i++){
            hearSet.add(br.readLine());
        }

        for (int i = 0; i < M; i++){
            seeSet.add(br.readLine());
        }

        TreeSet<String> finalSet = new TreeSet<>();
        for (String name : hearSet){
            if (seeSet.contains(name)){
                finalSet.add(name);
            }
        }

        System.out.println(finalSet.size());
        for (String name : finalSet){
            System.out.println(name);
        }
    }
}