public class Main {
    public static void main(String[] args) {
        boolean[] isSelfNumber = new boolean[10001]; // 1부터 10000까지의 숫자를 위한 배열
        
        // 모든 숫자를 셀프 넘버로 초기화
        for (int i = 1; i <= 10000; i++) {
            int dn = d(i);
            if (dn <= 10000) {
                isSelfNumber[dn] = true; // 생성자가 있는 숫자는 셀프 넘버가 아님
            }
        }
        
        // 셀프 넘버 출력
        for (int i = 1; i <= 10000; i++) {
            if (!isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }
    
    // d(n) 함수를 구현
    public static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10; // 각 자리수를 더함
            n /= 10; // 다음 자리수로 이동
        }
        return sum;
    }
}
