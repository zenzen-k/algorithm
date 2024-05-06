import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int numerator1 = Integer.parseInt(st.nextToken()); // 분자
		int denominator1 = Integer.parseInt(st.nextToken()); // 분모
		
		st = new StringTokenizer(br.readLine());
		int numerator2 = Integer.parseInt(st.nextToken()); // 분자
		int denominator2 = Integer.parseInt(st.nextToken()); // 분모
		
		int result1 = (numerator1*denominator2)+(numerator2*denominator1);
		int result2 = denominator1 * denominator2;
		
		int num = gcd(result1,result2);
		System.out.println(result1/gcd(result1,result2) + " " + result2/gcd(result1,result2));
	}
	
	public static int gcd(int num1, int num2) {
		if(num2 == 0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	
}

