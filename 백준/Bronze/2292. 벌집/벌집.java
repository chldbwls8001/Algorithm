import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int hexagon = 1; // 방의 개수
    	int layer = 0; // 층
    	
    	while (N > hexagon) {
    		layer++;
    		hexagon += 6 * layer; // 한 층당 방의 개수는 6 * 층수 만큼 증가
    	}
    	
    	System.out.println(layer + 1);
    }
}