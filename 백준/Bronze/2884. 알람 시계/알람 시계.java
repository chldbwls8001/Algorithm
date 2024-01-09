import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();        
        sc.close();
        
        // case 1: minute < 45 인 경우
        //     case 1-1: 0:0~0:44 인 경우
        
        if (minute < 45){
            hour--;
            minute = 60 - (45 - minute);
            if (hour < 0){
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        }
        else {
            System.out.println(hour + " " + (minute - 45));
        }
    }
}