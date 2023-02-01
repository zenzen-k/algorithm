import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt(); // 테스트케이스
		int[] arr;

		for (int i = 0; i < test; i++) {

			int n = sc.nextInt();
			arr = new int[n]; // 학생 수

			double sum = 0;

			// 성적입력과 합계
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}

			double avg = sum / n;

			double count = 0; 
			// 평균 넘는 학생 수
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > avg) {
					count++;
				}
			}

			System.out.printf("%.3f%%\n", count / n * 100.0);

		} // for
	}
}
