import java.util.*;

class Solution {
    public int[] solution(String my_string) {

        ArrayList<Integer> list = new ArrayList<>(); // 숫자를 담을 ArrayList 생성
        
        for (int i = 0; i < my_string.length(); i++){
            char currentChar = my_string.charAt(i);
            if (Character.isDigit(currentChar)){ // 문자열의 현재 문자가 숫자이면(isDigit)
                int currentNum = Character.getNumericValue(currentChar); // char->int 변환
                list.add(currentNum); // ArrayList에 숫자 추가
            }
        }
        
        Collections.sort(list); // 숫자 오름차순 정렬
        int[] answer = new int[list.size()]; // int[] 타입으로 반환하기 위한 새 배열 생성
        
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i); // ArrayList의 원소들을 배열에 담음
        }
        
        return answer;
    }
}