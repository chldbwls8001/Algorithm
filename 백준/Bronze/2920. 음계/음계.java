import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < 8; i++) {
    		sb.append(sc.nextInt());
    	}
    	
    	if (sb.toString().equals("12345678")) {
    		System.out.println("ascending");
    	}
    	else if (sb.toString().equals("87654321")) {
    		System.out.println("descending");
    	}
    	else {
    		System.out.println("mixed");
    	}
    	
    	sc.close();
    }
}