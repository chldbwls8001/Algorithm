import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> newList = new ArrayList<>(); // 배열 크기 동적으로 조절하기 위해 ArrayList 사용
        
        for (int num : numlist){
            if (num % n == 0){
                newList.add(num); // n의 배수인 num을 newList에 추가
            }
        }
        
        int[] answer = new int[newList.size()]; // 결과값 반환하기 위한 새 배열 생성
        for (int i = 0; i < newList.size(); i++){
            answer[i] = newList.get(i); // newList를 배열로 변환
        }

        return answer;
    }
}