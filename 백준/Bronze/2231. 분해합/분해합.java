import java.util.Scanner;

public class Main {
	public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			
			int sum = i;
			int tmp =i;
			
			while(tmp != 0) {
				sum += tmp%10;
				tmp /= 10;
			}
			
			if(sum == n) {
				result = i;
				break;
			}
				
		}
		
		System.out.println(result);
		
		sc.close();
		
	}
}

