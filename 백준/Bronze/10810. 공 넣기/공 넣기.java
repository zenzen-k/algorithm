import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 바구니수량
		int m = sc.nextInt(); // 반복횟수
		
		int basket[] = new int[n];
		for(int i=0; i<m; i++) {
			int z,x,k;
			z = sc.nextInt();
			x = sc.nextInt();
			k = sc.nextInt();
			
			for(int j=z-1; j<x; j++)
				basket[j] = k;
		}
		
		String arrToString = Arrays.toString(basket);
        String rep = arrToString.replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","");
        System.out.println(rep);
	}
}