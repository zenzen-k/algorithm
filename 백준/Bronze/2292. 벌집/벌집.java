import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int r = 2;
		int cnt = 1;
		if(n != 1) {
			while(n >= r) {
				r += 6*cnt;
				cnt ++;
			}
		}
		System.out.println(cnt);
		
		
	}
}
