import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] origin = new int[N]; // 원본 배열
        int[] sorted = new int[N]; // 정렬 할 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>(); // 순위를 매길 hashmap

        for (int i = 0; i < N; i++){
            origin[i] = sorted[i] = sc.nextInt();
        }

        Arrays.sort(sorted);

        int rank = 0; // 정렬된 배열을 순회하면서 map에 넣어준다
        for (int num : sorted){
            // 원소가 중복되지 않을 때에만 map에 원소와 해당 원소의 순위를 넣어준다
            if (!rankingMap.containsKey(num)){
                rankingMap.put(num, rank);
                rank++; // map에 넣고 나면 그 다음 순위를 가리킬 수 있도록 rank 1증가
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : origin){
            int ranking = rankingMap.get(key); // 원본 배열 원소에 대한 key(순위)를 가져온다
            sb.append(ranking).append(" ");
        }
        
        System.out.println(sb);
        sc.close();
    }
}