import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> logMap = new HashMap<>(); // 직원 이름과 로그 기록을 키-값 쌍으로 저장할 hashmap

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken(); // 직원 이름
            String value = st.nextToken(); // 출근/퇴근 로그
            logMap.put(key, value);
        }

        ArrayList<String> list = new ArrayList<>(); // 현재 회사에 있는 사람들을 담을 arraylist
        for (String key : logMap.keySet()) {
            String val = logMap.get(key);
            if (val.equals("enter")){ // 퇴근하지 않은 사람만 list에 추가
                list.add(key);
            }
        }

        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i)); // 리스트 역순으로 출력
        }
    }
}