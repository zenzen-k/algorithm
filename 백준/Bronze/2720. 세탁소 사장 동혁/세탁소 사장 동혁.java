import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int changer[][] = new int[t][4];
		int p[] = {25, 10, 5, 1};
		
		for(int i=0; i<t; i++) {
			int money = sc.nextInt();
			
			for(int j=0; j<4; j++){
				changer[i][j] = money / p[j];
				money = money % p[j];
			}
		}
		
		for(int c[] : changer) {
			for(int x : c) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

	}
}