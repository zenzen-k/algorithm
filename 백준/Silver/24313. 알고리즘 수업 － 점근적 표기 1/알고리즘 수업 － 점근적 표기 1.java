import java.util.Scanner;

public class Main {
	public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();

		// f(n) = 7n + 7, c=8, n0=10
		// g(n) = c*n0
		// 모든 n ≥ 10에 대하여  
		
		int result = (a1*n0)+a0 <= c*n0  && a1<=c ? 1 : 0;
		System.out.println(result);
		sc.close();
		
	}
}

