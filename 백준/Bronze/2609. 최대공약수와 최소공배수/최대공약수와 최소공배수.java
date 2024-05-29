import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int n = gcd(a,b);
		System.out.println(n);
		System.out.println(lcm(a,b,n));
		
		br.close();
	}

	static int gcd(int a, int b) { // 최대공약수
		
		int r;
		
		while(b != 0) {
			r = a%b;
			a = b;
			b = r;
		}
		
		return a;
	}

	static int lcm(int a, int b, int n) { // 최소공배수
		return a * b / n;
	}
}
