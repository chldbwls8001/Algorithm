class Solution {
    public int solution(int n, int t) {
        int answer = n; // 초기값
        
        for (int i = 1; i <= t; i++){ // i시간 뒤 세균 수
            answer *= 2;
        }
            
        return answer;
    }
}