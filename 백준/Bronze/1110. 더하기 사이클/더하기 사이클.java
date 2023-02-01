import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int N = 0;	//사이클
		int y = 100;
		int j = x;
		
		
		while(x != y) {
			y = j/10 + j%10;
			j = (y%10) + (j%10)*10;
			y = j;
			
			N++;
		}
		System.out.println(N);
	}
}