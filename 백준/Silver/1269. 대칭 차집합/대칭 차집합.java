import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        TreeSet<Integer> setA = new TreeSet<>();
        TreeSet<Integer> setB = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(getMinusSet(setA, setB) + getMinusSet(setB, setA));
        br.close();
    }

    public static int getMinusSet(TreeSet<Integer> set1, TreeSet<Integer> set2){
        TreeSet<Integer> result = new TreeSet<>(set1);
        result.removeAll(set2);

        return result.size();
    }
}