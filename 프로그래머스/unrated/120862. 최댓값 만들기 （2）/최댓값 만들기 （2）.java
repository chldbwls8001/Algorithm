import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int n = numbers.length;
        int maxValue = Math.max(numbers[0]*numbers[1], numbers[n-1]*numbers[n-2]);
        
        return maxValue;
        
    }
}