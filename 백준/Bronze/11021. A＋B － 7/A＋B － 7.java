import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;       
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            
            bw.write("Case #" + i + ": " + sum + "\n");
        }
        
        bw.close();
    }
}
