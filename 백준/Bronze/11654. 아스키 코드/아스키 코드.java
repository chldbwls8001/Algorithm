import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0); // scanner 사용 시 next()로 문자 입력 받는 방법

        System.out.println((int) input);
        
        sc.close();
    }
}