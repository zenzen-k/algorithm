import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[26];
		String input = sc.next();
		input = input.toUpperCase();
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = 65; j < 91; j++) {
				if (input.charAt(i) == (char) j) {
					num[j - 65]++;
				}
			}
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
				ch = (char) (i + 65);
			} else if (num[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);

		sc.close();
	}

}
