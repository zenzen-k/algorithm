import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum=0, min = 0;
		for(int i=n; i>=m; i--) {
			boolean a = true;
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					a = false;
					break;
				}
			}
			
			if(a && i!=1) {
				sum += i;
				min = i;
			}
		}
		if(sum == 0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
}