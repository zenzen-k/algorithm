import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean paper[][] = new boolean[100][100];
		int count = 0;
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(!paper[j][k]) {
						paper[j][k] = true;
						count++;
					}
					
				}
			}
		}
		
		System.out.println(count);

	}
}