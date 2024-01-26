import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt(); // 낮에 A미터 올라감
    	int B = sc.nextInt(); // 밤에 B미터 미끄러짐
    	int V = sc.nextInt(); // 막대의 높이 V
    	
    	// 하루(24시간)동안 달팽이가 이동하는 거리: (A-B)미터
        // 막대의 높이 V에서 낮 동안 올라가고 밤에 미끄러져 내려가는 거리는 (A-B)미터씩
        // 이동했을 때 V보다 크거나 같아지는 순간까지의 일수를 계산
        int days = (V - B - 1) / (A - B) + 1; // 소요되는 일 수

        System.out.println(days);  	
    }
}