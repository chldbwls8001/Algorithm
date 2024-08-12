import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine(); // 줄 바꿈 처리
        
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            System.out.println(isValidParenthesisString(str) ? "YES" : "NO");
        }
        
        sc.close();
    }
    
    public static boolean isValidParenthesisString(String str) {
        int count = 0;
        
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            
            // ')'가 더 많이 나올 경우, 즉 count가 음수가 될 경우 바로 NO를 반환
            if (count < 0) {
                return false;
            }
        }
        
        // 모든 괄호를 처리한 후, count가 0이면 올바른 괄호 문자열
        return count == 0;
    }
}
