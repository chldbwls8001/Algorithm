import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();
        
        String type = "";
        
        for (int i = 1; i <= N/4; i++){
            type += "long ";
        }
        
        System.out.println(type + "int");

    }
}