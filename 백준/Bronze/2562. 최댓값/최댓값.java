import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numList = new int[9];
        
        for (int i = 0; i < 9; i++){
            int num = sc.nextInt();
            numList[i] = num;
        }
        
        int max = numList[0];
        int idx = 0;
        
        for (int i = 0; i < numList.length; i++){
            if (numList[i] > max){
                max = numList[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
    }
}