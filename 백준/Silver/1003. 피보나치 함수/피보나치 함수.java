import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 빈값 null 처리
	static Integer dp[][] = new Integer[41][2]; // 0 <= N <= 40
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		// f(0)일때 0호출 1번, 1호출 0번
		dp[0][0] = 1; 
		dp[0][1] = 0; 
		// f(1)일때 0호출 0번, 1호출 1번
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			fibonacci(n);
			sb.append(dp[n][0] + " " + dp[n][1] + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}

	static Integer[] fibonacci(int n) {
		
		if(dp[n][0] == null || dp[n][1] == null) {
			dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
			dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
		}
		
		return dp[n];
	}
	
}
