import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("0 0 0")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a*a + b*b == c*c) {
				bw.write("right\n");
			}else if(a*a + c*c == b*b) {
				bw.write("right\n");
			}else if(b*b + c*c == a*a) {
				bw.write("right\n");
			}else {
				bw.write("wrong\n");
			}
			
		}
		
		bw.flush();
		br.close();
	}

}
