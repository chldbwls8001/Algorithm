import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++){
            arr[i] = sc.next();
        }

        Set<String> set = new HashSet<>(Arrays.asList(arr)); // 중복 제거를 위해 hashset으로 변환
        String[] uniqueArr = set.toArray(new String[0]); // 중복이 제거된 원소를 다시 배열로 변환

        // 문자열 길이순으로 정렬, 길이가 같은 경우에는 사전순으로 정렬
        Arrays.sort(uniqueArr, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return Integer.compare(a.length(), b.length());
            }
        });

        for (String str : uniqueArr){
            System.out.println(str);
        }
        sc.close();
    }
}