import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=m; i<=n; i++) {
			if(prime(i)) sb.append(i + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	static boolean prime(int num) {
		if(num < 2) return false; // 음수, 1 제외
		
		// 짝수 제외 (2는 소수이므로 빼고)
		else if(num%2 == 0) return num == 2 ? true : false;
		
		// 에라토스테네스의 체.
		for(int i=3; i<=Math.sqrt(num); i+=2) {
			if(num%i == 0)
				return false;
		}
		
		return true;
	}
}
