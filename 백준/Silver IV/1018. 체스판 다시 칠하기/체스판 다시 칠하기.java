import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 보드의 세로 길이
        int M = Integer.parseInt(st.nextToken()); // 보드의 가로 길이

        char[][] board = new char[N][M]; // 보드의 상태 저장을 위한 2차원배열

        // 보드 상태 입력
        for (int i = 0; i < N; i++){
            String line = br.readLine();
            for (int j = 0; j < M; j++){
                board[i][j] = line.charAt(j);
            }
        }

        int minRepeat = Integer.MAX_VALUE; // 다시 칠해야하는 정사각형 수의 최솟값

        // 모든 8x8 체스판의 경우의 수를 검사
        for (int i = 0; i <= N - 8; i++){
            for (int j = 0; j <= M - 8; j++){
                // 첫번째 칸이 White인 경우와 Black인 경우 나눠서 계산
                int caseWhite = repaint(board, i, j, 'W');
                int caseBlack = repaint(board, i, j, 'B');

                int caseMin = Math.min(caseWhite, caseBlack); // 두 케이스 중 작은 값
                if (caseMin < minRepeat){ // 최솟값 갱신
                    minRepeat = caseMin;
                }
            }
        }
        System.out.println(minRepeat);
        br.close();
    }

    // 주어진 시작 위치에서 8x8 체스판을 검사하며 다시 칠해야하는 정사각형 수를 계산하는 메소드
    public static int repaint(char[][] board, int startX, int startY, char startColor){
        int cnt = 0; // 다시 칠해야하는 정사각형 수를 카운트

        for (int i = startX; i < startX + 8; i++){
            for (int j = startY; j < startY + 8; j++){
                if (board[i][j] != startColor){
                    cnt++; // 현재 위치의 색깔이 정답색깔과 일치하지 않을 경우 다시 칠해야 하므로 cnt 증가
                }
                startColor = (startColor == 'W') ? 'B' : 'W'; // 다음 칸의 색은 현재 칸과 반대여야함
            }
            startColor = (startColor == 'W') ? 'B' : 'W'; // 다음 행에서 시작하는 경우 색깔 바꿔주어야 함
        }

        return cnt;
    }
}