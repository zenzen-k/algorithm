import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] piece = new int[] {1,1,2,2,2,8};
		
		for(int i=0; i<piece.length; i++) {
			int a = sc.nextInt();
			System.out.print (piece[i] - a + " ");
		}

	}

}