import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(Integer.toString(b, n).toUpperCase());

	}
}