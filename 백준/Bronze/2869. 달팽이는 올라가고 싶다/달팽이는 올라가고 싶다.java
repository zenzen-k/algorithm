import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		int sum = (v-b)/(a-b);
		
		if((v-b)%(a-b) != 0)
			sum++;

		System.out.println(sum);
	}
}