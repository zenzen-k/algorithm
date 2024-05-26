import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int ho;
			if(n%h == 0) {
				ho = n/h;
			}else {
				ho = (n/h) + 1;
			}
			
			int floor = n%h;
			if(floor == 0) {
				floor = h;
			}
			
			System.out.println(floor + (ho < 10 ? "0"+ho : ho+""));
		}
		br.close();
	}

}
