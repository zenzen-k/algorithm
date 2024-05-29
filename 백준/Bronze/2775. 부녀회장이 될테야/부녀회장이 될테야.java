import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 아파트 생성
		int[][] APT = new int[15][15];

		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1; // i층 1호
			APT[0][i] = i; // 0층 i호
		}

		for (int i = 1; i < 15; i++) { // 1층부터 14층까지

			for (int j = 2; j < 15; j++) { // 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j]; // 밑에 층 + 앞에 호수 
			}
		}
		
		
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(APT[k][n]); // 0호는 없음
		}

		sc.close();
	}

}
