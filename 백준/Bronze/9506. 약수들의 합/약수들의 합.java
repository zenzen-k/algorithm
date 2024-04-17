import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == -1) break;
			int sum = 0;
			String x = "1";
			for(int i=2; i<n; i++) {
				if(n%i == 0) {
					x += " + " + i;
					sum += i;
				}
			}
			sum += 1;
			
			if(sum == n) {
				System.out.println(n + " = " + x);
			}else {
				System.out.println(n + " is NOT perfect.");
			}
			
		}
		
	}
}