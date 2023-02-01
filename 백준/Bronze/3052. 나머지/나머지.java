import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rem = new int[10];

		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			rem[i] = num % 42;
		}

		int count = 0;

		for (int i = 0; i < rem.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < rem.length; j++) {
				if (rem[i] == rem[j]) { // i번째 자리의 숫자와 j번째 자리의 숫자를 비교한다.
					temp++; // 같으면 1증가
				}
			}
			// 같은 숫자는 중복해서 세면 안됨. 따라서 i번째 자리의 숫자가 다른 자리의 숫자와 같지 않으면(temp==0) 1증가(count++)
			if (temp == 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
