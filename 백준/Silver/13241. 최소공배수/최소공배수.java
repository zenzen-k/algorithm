import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long num1 = Integer.parseInt(st.nextToken());
		long num2 = Integer.parseInt(st.nextToken());
		
		// 최소공배수 = 두 자연수의 곱 / 최대공약수
		System.out.println(num1*num2/gcd(num1,num2) + " ");
	}
	
	// 유클리드 알고리즘 : 두 수 사이 존재하는 최대공약수 알고리즘
	public static long gcd(long num1, long num2) {
		if(num2 == 0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
}

