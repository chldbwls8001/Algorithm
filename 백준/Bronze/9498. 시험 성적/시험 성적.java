import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
        int score = sc.nextInt();
        
        if (score >= 90){
            System.out.println("A");
        }
        if (score >= 80 && score < 90){
            System.out.println("B");
        }
        if (score >= 70 && score < 80){
            System.out.println("C");
        }
        if (score >= 60 && score < 70){
            System.out.println("D");
        }
        if (score < 60){
            System.out.println("F");
        }
        
        sc.close();
    }
}