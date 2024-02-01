import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	
    	while (true) {
        	int n1 = sc.nextInt();
        	int n2 = sc.nextInt();
        	
        	if (n1 == 0 && n2 == 0) {
        		break;
        	}
        	
        	if (n2 % n1 == 0) { // 첫 번째 숫자가 두 번째 숫자의 약수인 경우
        		System.out.println("factor");
        	}
        	else if (n1 % n2 == 0) { // 첫 번째 숫자가 두 번째 숫자의 배수인 경우
        		System.out.println("multiple");
        	}
        	else {
        		System.out.println("neither");
        	}
    	}
    	sc.close();
    }
}