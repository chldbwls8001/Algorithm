import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for (int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine()); // a, b 입력
            // BufferedReader는 Enter만을 입력의 경계로 인지하므로 StringTokenizer로 입력 받는다
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n"); 
            // br, bw는 받은 데이터가 String으로 고정되므로 형변환 필요함
        }
       
        bw.close();     
    }
}