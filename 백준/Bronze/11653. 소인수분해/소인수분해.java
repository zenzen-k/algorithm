import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = 2;
		
		while(n != 1) {
			
			if(n%m != 0)
				m ++;
			else {
				n /= m;
				System.out.println(m);
			}
				
		}
		
	}
}