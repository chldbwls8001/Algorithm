import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            char[] charArray = S.toCharArray();
            System.out.println(Character.toString(charArray[0]) + Character.toString(charArray[charArray.length - 1]));         
        }      
        sc.close();
    }
}