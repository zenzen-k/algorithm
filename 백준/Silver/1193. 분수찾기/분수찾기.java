import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int count = 0; // 1 3 6 10 각 대각선 마지막 값
		int t = 1; // 2 3 4 5 .. 최대값
		while(count < x) {
			count = count + t;
			t++;
		}
		
		int d, n;
		
		if((t-1)%2 == 0) {
			n = (t-1) - (count -x);
			d = 1 + (count - x);
		}else {
			n = 1 + (count - x);
			d = (t-1) - (count -x);
		}
		System.out.println(n+"/"+d);
		
	}
}