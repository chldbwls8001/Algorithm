class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = ""; // 정답을 담을 빈 문자열
        char[] array = new char[my_string.length()]; // my_string 원소를 담을 빈 배열
        
        for (int i = 0; i < my_string.length(); i++){ // my_string을 배열로 변환
            array[i] = my_string.charAt(i);
        }
        
        int minNum = Math.min(num1, num2); // num1과 num2 중 작은 값
        int maxNum = Math.max(num1, num2); // num1과 num2 중 큰 값
        char ch = array[minNum];
        
        for (int i = 0; i < array.length; i++){
            if (i == minNum){ // array[minNum]과 array[maxNum]의 값 교환
                array[minNum] = array[maxNum];
                array[maxNum] = ch; // array[minNum]값을 담은 변수 ch 사용
            }
            answer += array[i]; // array[] 문자열로 변환
        }

        return answer;
    }
}