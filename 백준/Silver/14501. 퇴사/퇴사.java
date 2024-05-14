import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int t[] = new int[n];
		int p[] = new int[n];
		int DP[] = new int[n+1];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		// Dynamic Programming, 점화식
		// DP[현재 날의 상담 기간을 계산했을 때 끝나는 날] 
		// = max(DP[현재 날의 상담 기간을 계산했을 때 끝나는 날], DP[현재 날까지 계산된 값] + p[현재 날 상담을 통해 얻는 값])
		for(int i=0; i<n; ++i) {
			if(i+t[i] <= n) {
				DP[i+t[i]] = Math.max(DP[i+t[i]], DP[i] +p[i]);							
			}
			DP[i+1] = Math.max(DP[i+1], DP[i]);
		}
		
		System.out.println(DP[n]);
	} 
}

